package it.unibz.inf.ontop.owlrefplatform.core.execution;

import java.util.Optional;
import it.unibz.inf.ontop.model.OBDAException;
import it.unibz.inf.ontop.ontology.Assertion;
import it.unibz.inf.ontop.owlrefplatform.core.IQuest;
import it.unibz.inf.ontop.owlrefplatform.core.QuestConnection;
import it.unibz.inf.ontop.owlrefplatform.core.SQLQuestStatement;
import it.unibz.inf.ontop.owlrefplatform.core.abox.RDBMSSIRepositoryManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

/**
 * Contains additional methods required by the Semantic Index mode.
 */
public class SISQLQuestStatementImpl extends SQLQuestStatement implements SIQuestStatement {

    private final Connection sqlConnection;
    private final RDBMSSIRepositoryManager siRepository;
    private static Logger log = LoggerFactory.getLogger(SISQLQuestStatementImpl.class);

    public SISQLQuestStatementImpl(IQuest questInstance, QuestConnection questConnection, Statement sqlStatement) {
        super(questInstance, questConnection, sqlStatement);
        sqlConnection = questConnection.getSQLConnection();
        Optional<RDBMSSIRepositoryManager> optionalSIRepository = questInstance.getOptionalSemanticIndexRepository();
        if (optionalSIRepository.isPresent()) {
            siRepository = optionalSIRepository.get();
        }
        else {
            throw new IllegalArgumentException(getClass().getCanonicalName() + " requires the quest instance to have a Semantic Index repository.");
        }
    }

    public void createIndexes() throws OBDAException {
        try {
            siRepository.createIndexes(sqlConnection);
        } catch (SQLException e) {
            throw new OBDAException(e);
        }
    }

    public void dropIndexes() throws OBDAException {
        try {
            siRepository.dropIndexes(sqlConnection);
        } catch (SQLException e) {
            throw new OBDAException(e);
        }
    }

    public boolean isIndexed() {
        return siRepository.isIndexed(sqlConnection);
    }

    public void dropRepository() throws OBDAException {
        try {
            siRepository.dropDBSchema(sqlConnection);
        } catch (SQLException e) {
            throw new OBDAException(e);
        }
    }

    /***
     * In an ABox store (classic) this methods triggers the generation of the
     * schema and the insertion of the metadata.
     *
     */
    public void createDB() throws OBDAException {
        try {
            siRepository.createDBSchemaAndInsertMetadata(sqlConnection);
        } catch (SQLException e) {
            throw new OBDAException(e);
        }
    }

    /***
     * Inserts a stream of ABox assertions into the repository.
     *
     * @param data

     *            Indicates if indexes (if any) should be dropped before
     *            inserting the tuples and recreated afterwards. Note, if no
     *            index existed before the insert no drop will be done and no
     *            new index will be created.
     *
     */
    @Override
    public int insertData(Iterator<Assertion> data, int commit, int batch) throws OBDAException {
        try {
            return siRepository.insertData(sqlConnection, data, commit, batch);
        } catch (SQLException e) {
            throw new OBDAException(e);
        }
    }
}