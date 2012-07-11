package it.unibz.krdb.obda.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public interface Atom extends Cloneable, Serializable {
	
	public Atom clone();

	public int getArity();
	
	public void setPredicate(Predicate predicate);
	
	public Predicate getPredicate();
	
	public List<Term> getTerms();
	
	public Term getTerm(int index);
	
	/***
	 * Sets the term in position index to the value of t.
	 * @param index
	 * @param t
	 * @return Returns the term that was replaced by t.
	 */
	public Term setTerm(int index, Term newTerm);
	
	public void updateTerms(List<Term> terms);
	
	public int getFirstOcurrance(Term term, int i);
	
	public Set<Variable> getVariables(); 
}
