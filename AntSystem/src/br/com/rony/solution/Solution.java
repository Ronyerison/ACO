/**
 * 
 */
package br.com.rony.solution;

import java.util.List;

import br.com.rony.grafo.Aresta;
import br.com.rony.modelo.Formiga;

/**
 * @author Ronyerison
 *
 */
public class Solution {
	
	private Double distancia;
	private List<Aresta> arestas;
	private Formiga formiga;
	/**
	 * @param distancia
	 * @param arestas
	 * @param formiga
	 */
	public Solution(Double distancia, List<Aresta> arestas, Formiga formiga) {
		super();
		this.distancia = distancia;
		this.arestas = arestas;
		this.formiga = formiga;
	}
	
	
	/**
	 * @param distancia
	 * @param formiga
	 */
	public Solution(Double distancia, Formiga formiga) {
		super();
		this.distancia = distancia;
		this.formiga = formiga;
		this.arestas = formiga.getArestas();
	}


	/**
	 * @return the arestas
	 */
	public List<Aresta> getArestas() {
		return arestas;
	}
	/**
	 * @param arestas the arestas to set
	 */
	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	/**
	 * @return the distancia
	 */
	public Double getQualidade() {
		return distancia;
	}
	/**
	 * @param distancia the distancia to set
	 */
	public void setQualidade(Double qualidade) {
		this.distancia = qualidade;
	}
	/**
	 * @return the formiga
	 */
	public Formiga getFormiga() {
		return formiga;
	}
	/**
	 * @param formiga the formiga to set
	 */
	public void setFormiga(Formiga formiga) {
		this.formiga = formiga;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Solution [distancia=" + distancia + ",\n arestas=" + arestas
				+ ",\n formiga=" + formiga + "]";
	}
}
