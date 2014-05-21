/**
 * 
 */
package br.com.rony.grafo;

import java.util.LinkedList;

/**
 * @author Ronyerison
 *
 */
public class Vertice {
	
	private Long id;
	
	private Object valor;
	
	private LinkedList<Aresta> arestasAdj;

	/**
	 * @param id
	 * @param valor
	 * @param arestasAdj
	 */
	public Vertice(Long id, Object valor, LinkedList<Aresta> arestasAdj) {
		this.id = id;
		this.valor = valor;
		this.arestasAdj = arestasAdj;
	}

	/**
	 * @param id
	 * @param valor
	 */
	public Vertice(Long id, Object valor) {
		this.id = id;
		this.valor = valor;
		this.arestasAdj = new LinkedList<Aresta>();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the valor
	 */
	public Object getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Object valor) {
		this.valor = valor;
	}

	/**
	 * @return the arestasAdj
	 */
	public LinkedList<Aresta> getArestasAdj() {
		return arestasAdj;
	}

	/**
	 * @param arestasAdj the arestasAdj to set
	 */
	public void setArestasAdj(LinkedList<Aresta> arestasAdj) {
		this.arestasAdj = arestasAdj;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vertice [id=" + id + ", valor=" + valor + "]";
	}
	
	
	
}
