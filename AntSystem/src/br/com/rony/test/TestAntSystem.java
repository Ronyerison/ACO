	/**
 * 
 */
package br.com.rony.test;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import br.com.rony.algorithm.AntSystemCycle;
import br.com.rony.algorithm.Confiuration;
import br.com.rony.grafo.Aresta;
import br.com.rony.grafo.Grafo;
import br.com.rony.grafo.Vertice;
import br.com.rony.solution.Solution;

/**
 * @author Ronyerison
 *
 */
public class TestAntSystem {

	@SuppressWarnings("unused")
	@Test
	public void test() {
		List<Vertice> vertices = new LinkedList<Vertice>();
		
		vertices.add(new Vertice((long) 1, "C1"));
		vertices.add(new Vertice((long) 2, "C2"));
		vertices.add(new Vertice((long) 3, "C3"));
		vertices.add(new Vertice((long) 4, "C4"));
		vertices.add(new Vertice((long) 5, "C5"));
		vertices.add(new Vertice((long) 6, "C6"));
		

		double[][] matrix = new double[][]{
				{ 0,  7, 4, 3, 11, 1},
				{ 7,  0, 2, 8, 10, 8},
				{ 4,  2, 0, 9,  9, 3},
				{ 3,  8, 9, 0,  5, 4},
				{11, 10, 9, 5,  0, 3},
				{ 1,  8, 3, 4,  3, 0}};

		List<Aresta> arestas = new LinkedList<Aresta>();
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				if(i != j && matrix[i][j] != 0){
					arestas.add(new Aresta(vertices.get(i), vertices.get(j), matrix[i][j]));
					arestas.add(new Aresta(vertices.get(j), vertices.get(i), matrix[i][j]));
				}
			}
		}
		
		Grafo grafo = new Grafo(vertices, arestas);
		Confiuration conf = new Confiuration(3, 0.1, 1, 1, 0.5, 1, 10);
		AntSystemCycle antSystemCycle = new AntSystemCycle(grafo, conf, vertices.get(1));
		Solution solution = antSystemCycle.execute();
	}

}
