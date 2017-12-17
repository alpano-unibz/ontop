package it.unibz.inf.ontop.si.dag;

/*
 * #%L
 * ontop-quest-owlapi
 * %%
 * Copyright (C) 2009 - 2014 Free University of Bozen-Bolzano
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import it.unibz.inf.ontop.spec.ontology.*;
import it.unibz.inf.ontop.spec.ontology.impl.ClassifiedTBoxImpl;
import it.unibz.inf.ontop.spec.ontology.owlapi.OWLAPITranslatorUtility;
import it.unibz.inf.ontop.si.repository.impl.SemanticIndexBuilder;
import it.unibz.inf.ontop.si.repository.impl.SemanticIndexRange;
import it.unibz.inf.ontop.spec.ontology.ClassifiedTBox;
import junit.framework.TestCase;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map.Entry;

public class S_Indexes_Compare extends TestCase {
	
	ArrayList<String> input= new ArrayList<String>();

	Logger log = LoggerFactory.getLogger(S_HierarchyTestNewDAG.class);

	public S_Indexes_Compare (String name){
		super(name);
	}
	
	public void setUp() {
		input.add("src/test/resources/completeness/equivalence/test_404.owl");
	}

	public void testIndexes() throws Exception {
	//for each file in the input
	for (int i=0; i<input.size(); i++){
		String fileInput=input.get(i);

		ClassifiedTBox dag = ClassifiedTBoxImpl.create(OWLAPITranslatorUtility.loadOntologyFromFile(fileInput));

		SemanticIndexBuilder engine = new SemanticIndexBuilder(dag);

		
		log.debug("Input number {}", i+1 );
		
		testIndexes(engine, dag);

		Ontology onto = OWLAPITranslatorUtility.loadOntologyFromFile(fileInput);
		DAG dag2 = DAGConstructor.getISADAG(onto);
		dag2.clean();
        DAGOperations.buildDescendants(dag2);
        DAGOperations.buildAncestors(dag2);
		DAG pureIsa = DAGConstructor.filterPureISA(dag2, onto);
		 pureIsa.clean();
			pureIsa.index();
			 DAGOperations.buildDescendants(pureIsa);
		        DAGOperations.buildAncestors(pureIsa);
		 testOldIndexes(pureIsa, engine);
		
	}
}

private void testOldIndexes(DAG d1, SemanticIndexBuilder d2){
	
	
	
	for(DAGNode d: d1.getClasses()){
		System.out.println(d + "\n "+ d.getEquivalents());
		System.out.println(d1.equi_mappings.values());
		
	}
	
	
	for(DAGNode d: d1.getRoles()){
		System.out.println(d );
		for(DAGNode dd: d.getEquivalents()){
		System.out.println(d1.getRoleNode(((ObjectPropertyExpression)dd.getDescription())));
		;
		}
		//System.out.println(d1.getRoleNode(ofac.createObjectProperty("http://obda.inf.unibz.it/ontologies/tests/dllitef/test.owl#B2")));
		;
	}
		
	}


	private boolean testIndexes(SemanticIndexBuilder engine, ClassifiedTBox reasoner) {
		
		boolean result = false;
		
		//check that the index of the node is contained in the intervals of the parent node
		SimpleDirectedGraph<ObjectPropertyExpression, DefaultEdge> namedOP 
							= SemanticIndexBuilder.getNamedDAG(reasoner.objectProperties().dag());
		for (Entry<ObjectPropertyExpression, SemanticIndexRange> vertex: engine.getIndexedObjectProperties()) { // .getNamedDAG().vertexSet()
			int index = vertex.getValue().getIndex();
			log.info("vertex {} index {}", vertex, index);
			for (ObjectPropertyExpression parent: Graphs.successorListOf(namedOP, vertex.getKey())){
				result = engine.getRange(parent).contained(new SemanticIndexRange(index));			
				if (result)
					return result;
			}
		}
		SimpleDirectedGraph<DataPropertyExpression, DefaultEdge> namedDP
					= SemanticIndexBuilder.getNamedDAG(reasoner.dataProperties().dag());
		for (Entry<DataPropertyExpression, SemanticIndexRange> vertex: engine.getIndexedDataProperties()) { // .getNamedDAG().vertexSet()
			int index = vertex.getValue().getIndex();
			log.info("vertex {} index {}", vertex, index);
			for (DataPropertyExpression parent: Graphs.successorListOf(namedDP, vertex.getKey())) {
				result = engine.getRange(parent).contained(new SemanticIndexRange(index));			
				if (result)
					return result;
			}
		}
		SimpleDirectedGraph<ClassExpression, DefaultEdge> namedCL 
						= SemanticIndexBuilder.getNamedDAG(reasoner.classes().dag());
		for (Entry<ClassExpression, SemanticIndexRange> vertex: engine.getIndexedClasses()) { 
			int index = vertex.getValue().getIndex();
			log.info("vertex {} index {}", vertex, index);			
			for (ClassExpression parent: Graphs.successorListOf(namedCL, vertex.getKey())) {
				result = engine.getRange((OClass)parent).contained(new SemanticIndexRange(index));
				if (result)
					return result;
			}
		}
		
		return result;
	}






}
