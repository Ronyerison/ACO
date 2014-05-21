/**
 * 
 */
package br.com.rony.algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.rony.grafo.Aresta;
import br.com.rony.grafo.Grafo;
import br.com.rony.grafo.Vertice;
import br.com.rony.modelo.Formiga;
import br.com.rony.solution.Solution;

/**
 * @author Ronyerison
 *
 */
public class AntSystemCycle {
	
	private Grafo grafo;
	private Confiuration conf;
	private List<Formiga> formigasList;
	private List<Solution> solucoes;
	private Solution melhorSolucao;
	
	/**
	 * @param grafo
	 * @param conf
	 */
	public AntSystemCycle(Grafo grafo, Confiuration conf, Vertice vInicial) {
		super();
		this.grafo = grafo;
		this.conf = conf;
		this.formigasList = new LinkedList<Formiga>();
		this.melhorSolucao = null;
		this.solucoes = new LinkedList<Solution>();
		
		for (int i = 0; i < conf.getNumFormigas(); i++) {
			this.formigasList.add(new Formiga(vInicial, vInicial));
		}
		
		for (Aresta aresta : grafo.getArestas()) {
			Double valor = new Random().nextDouble();
			aresta.setFeromonio(conf.getFeromonioInicial()*valor);
		}
	}
	
	public Solution execute(){
		int iteration = 0;
		
		while(iteration < conf.getMaxIteracoes()){
			for (Formiga formiga : this.formigasList) {
				construir(formiga);
			}
			
			for (Aresta aresta : this.grafo.getArestas()) {
				aresta.setFeromonio( (1-conf.getTaxaEvaporacao())*aresta.getFeromonio() );
			}
			
			for (Formiga formiga : formigasList) {
				for (Aresta aresta : formiga.getArestas()) {
					aresta.setFeromonio(aresta.getFeromonio() + conf.getQ()/formiga.calcDistanciaPercorrida());
				}
				this.solucoes.add(new Solution(formiga.calcDistanciaPercorrida(), formiga));
			}
			iteration++;
		}
		
		this.melhorSolucao = calcularMelhorSolucao();
		return this.melhorSolucao;
	}

	private void construir(Formiga formiga) {
		Aresta proxAresta = selecionarProximo(formiga.getvAtual());
		Vertice proximoVertice = proxAresta.getvFinal();
		
		do{
			if(!formiga.getVisitados().contains(proximoVertice)){
				formiga.getArestas().add(proxAresta);
				formiga.getVisitados().add(proximoVertice);
				formiga.setvAtual(proximoVertice);
				formiga.calcDistanciaPercorrida();
			}
			proxAresta = selecionarProximo(formiga.getvAtual());
			proximoVertice = proxAresta.getvFinal();
		}while(formiga.getVisitados().size() != grafo.getVertices().size());
		
	}
	

	
	/**
	 * Este método seleciona aresta sorteada levando em consideração a probabilidade de cada aresta
	 * @param vAtual
	 * @return proxAresta
	 */
	private Aresta selecionarProximo(Vertice vAtual) {
		Double sum = 0.0;
		
		for (Aresta aresta : vAtual.getArestasAdj()) {
			sum += Math.pow(aresta.getFeromonio(), this.conf.getAlfa()) *
					Math.pow(1/aresta.getDistancia(), this.conf.getBeta());
		}
		
		for (Aresta aresta : vAtual.getArestasAdj()) {
			Double prob = Math.pow(aresta.getFeromonio(), this.conf.getAlfa()) *
					Math.pow(1/aresta.getDistancia(), this.conf.getBeta()) / sum;
			aresta.setProb(prob);
		}
		
		Collections.sort(vAtual.getArestasAdj(), new Comparator<Aresta>() {
			@Override
			public int compare(Aresta o1, Aresta o2) {
				return o1.getProb().compareTo(o2.getProb());
			}
		});
		
		double valor = new Random().nextDouble();
		double soma = 0.0;
		for (Aresta aresta : vAtual.getArestasAdj()) {
			soma += aresta.getProb();
			if (valor <= soma) {
				return aresta;
			}
		}
		return null;
	}
	
	public Solution calcularMelhorSolucao(){
		Double melhorDistancia = Double.MAX_VALUE;
		Formiga melhorFormiga = null;
		Solution solution = null;
		
		for (Formiga formiga : this.formigasList) {
			if(formiga.getVisitados().size() == this.grafo.getVertices().size()){
				if(formiga.calcDistanciaPercorrida() < melhorDistancia){
					melhorDistancia = formiga.calcDistanciaPercorrida();
					melhorFormiga = formiga;
					solution = new Solution(melhorDistancia, melhorFormiga);
				}
			}
			formiga.reiniciar();
		}
		
		return solution;
	}

	/**
	 * @return the solucoes
	 */
	public List<Solution> getSolucoes() {
		return solucoes;
	}



	/**
	 * @param solucoes the solucoes to set
	 */
	public void setSolucoes(List<Solution> solucoes) {
		this.solucoes = solucoes;
	}



	/**
	 * @return the melhorSolucao
	 */
	public Solution getMelhorSolucao() {
		return melhorSolucao;
	}



	/**
	 * @param melhorSolucao the melhorSolucao to set
	 */
	public void setMelhorSolucao(Solution melhorSolucao) {
		this.melhorSolucao = melhorSolucao;
	}



	/**
	 * @return the grafo
	 */
	public Grafo getGrafo() {
		return grafo;
	}

	/**
	 * @param grafo the grafo to set
	 */
	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	/**
	 * @return the conf
	 */
	public Confiuration getConf() {
		return conf;
	}

	/**
	 * @param conf the conf to set
	 */
	public void setConf(Confiuration conf) {
		this.conf = conf;
	}

	/**
	 * @return the formigasList
	 */
	public List<Formiga> getFormigasList() {
		return formigasList;
	}

	/**
	 * @param formigasList the formigasList to set
	 */
	public void setFormigasList(List<Formiga> formigasList) {
		this.formigasList = formigasList;
	}
	
	
}
