/**
 * 
 */
package br.com.rony.grafo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ronyerison
 *
 */
public class Grafo {
	
	private List<Vertice> vertices;
	
	private List<Aresta> arestas;

	/**
	 * @param vertices
	 * @param arestas
	 */
	public Grafo(List<Vertice> vertices, List<Aresta> arestas) {
		this.vertices = vertices;
		this.arestas = arestas;
	}
	
	public Grafo() {
		this.arestas = new LinkedList<>();
		this.vertices = new LinkedList<>();
	}
	
	public void addAresta(Aresta aresta){
		this.arestas.add(aresta);
	}
	
	public void addVertice(Vertice vertice){
		this.vertices.add(vertice);
	}

	/**
	 * @return the vertices
	 */
	public List<Vertice> getVertices() {
		return vertices;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
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
	
	
}
