/**
 * 
 */
package br.com.rony.modelo;

import java.text.Normalizer.Form;
import java.util.LinkedList;

import br.com.rony.grafo.Aresta;
import br.com.rony.grafo.Vertice;

/**
 * @author Ronyerison
 *
 */
public class Formiga implements Cloneable{
	 
	private Vertice vInicial;
	private Vertice vAtual;
	private LinkedList<Vertice> visitados;
	private LinkedList<Aresta> arestas;
	private Double distanciaPercorrida;
	/**
	 * @param vInicial
	 * @param vAtual
	 * @param visitados
	 * @param arestas
	 */
	public Formiga(Vertice vInicial, Vertice vAtual,
			LinkedList<Vertice> visitados, LinkedList<Aresta> arestas) {
		this.vInicial = vInicial;
		this.vAtual = vAtual;
		this.visitados = visitados;
		this.arestas = arestas;
	}
	/**
	 * @param vInicial
	 * @param vAtual
	 */
	public Formiga(Vertice vInicial, Vertice vAtual) {
		this.vInicial = vInicial;
		this.vAtual = vAtual;
		this.arestas = new LinkedList<Aresta>();
		this.visitados = new LinkedList<Vertice>();
	}
	
	/**
	 * @param formiga
	 */
	public Formiga(Formiga formiga){
		this.vInicial = formiga.vInicial;
		this.vAtual = formiga.vAtual;
		this.arestas = formiga.arestas;
		this.distanciaPercorrida = formiga.distanciaPercorrida;
		this.visitados = formiga.visitados;
	}
	
	/**
	 * @return
	 */
	public Double calcDistanciaPercorrida(){
		Double sum = 0.0;
		for (Aresta aresta : this.arestas) {
			sum += aresta.getDistancia();
		}
		return sum;
	}
	
	/**
	 * @param formiga
	 * @return
	 */
	public Formiga getClone(Formiga formiga){
		return new Formiga(this);
	}
	
	public void reiniciar(){
		this.vAtual = this.vInicial;
		this.visitados = new LinkedList<Vertice>();
		this.arestas = new LinkedList<Aresta>();
	}
	
	/**
	 * @return the vInicial
	 */
	public Vertice getvInicial() {
		return vInicial;
	}
	/**
	 * @param vInicial the vInicial to set
	 */
	public void setvInicial(Vertice vInicial) {
		this.vInicial = vInicial;
	}
	/**
	 * @return the vAtual
	 */
	public Vertice getvAtual() {
		return vAtual;
	}
	/**
	 * @param vAtual the vAtual to set
	 */
	public void setvAtual(Vertice vAtual) {
		this.vAtual = vAtual;
	}
	/**
	 * @return the visitados
	 */
	public LinkedList<Vertice> getVisitados() {
		return visitados;
	}
	/**
	 * @param visitados the visitados to set
	 */
	public void setVisitados(LinkedList<Vertice> visitados) {
		this.visitados = visitados;
	}
	/**
	 * @return the arestas
	 */
	public LinkedList<Aresta> getArestas() {
		return arestas;
	}
	/**
	 * @param arestas the arestas to set
	 */
	public void setArestas(LinkedList<Aresta> arestas) {
		this.arestas = arestas;
	}
	/**
	 * @return the distanciaPercorrida
	 */
	public Double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	/**
	 * @param distanciaPercorrida the distanciaPercorrida to set
	 */
	public void setDistanciaPercorrida(Double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Formiga [vInicial=" + vInicial + ", vAtual=" + vAtual
				+ ", visitados=" + visitados + ", arestas=" + arestas
				+ ", distanciaPercorrida=" + distanciaPercorrida + "]";
	}
	
	
}
