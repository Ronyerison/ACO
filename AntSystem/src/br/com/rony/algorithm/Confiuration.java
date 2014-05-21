/**
 * 
 */
package br.com.rony.algorithm;

/**
 * @author Ronyerison
 *
 */
public class Confiuration {
	
	private int numFormigas;
	private double feromonioInicial;
	private double alfa;
	private double beta;
	private double taxaEvaporacao;
	private double q;
	private int maxIteracoes;
	
	/**
	 * @param numFormigas
	 * @param feromonioInicial
	 * @param alfa
	 * @param beta
	 * @param taxaEvaporacao
	 * @param q
	 */
	public Confiuration(int numFormigas, double feromonioInicial, double alfa,
			double beta, double taxaEvaporacao, double q, int maxIteracoes) {
		super();
		this.numFormigas = numFormigas;
		this.feromonioInicial = feromonioInicial;
		this.alfa = alfa;
		this.beta = beta;
		this.taxaEvaporacao = taxaEvaporacao;
		this.q = q;
		this.maxIteracoes = maxIteracoes;
	}

	/**
	 * @return the numFormigas
	 */
	public int getNumFormigas() {
		return numFormigas;
	}

	/**
	 * @param numFormigas the numFormigas to set
	 */
	public void setNumFormigas(int numFormigas) {
		this.numFormigas = numFormigas;
	}

	/**
	 * @return the feromonioInicial
	 */
	public double getFeromonioInicial() {
		return feromonioInicial;
	}

	/**
	 * @param feromonioInicial the feromonioInicial to set
	 */
	public void setFeromonioInicial(double feromonioInicial) {
		this.feromonioInicial = feromonioInicial;
	}

	/**
	 * @return the alfa
	 */
	public double getAlfa() {
		return alfa;
	}

	/**
	 * @param alfa the alfa to set
	 */
	public void setAlfa(double alfa) {
		this.alfa = alfa;
	}

	/**
	 * @return the beta
	 */
	public double getBeta() {
		return beta;
	}

	/**
	 * @param beta the beta to set
	 */
	public void setBeta(double beta) {
		this.beta = beta;
	}

	/**
	 * @return the taxaEvaporacao
	 */
	public double getTaxaEvaporacao() {
		return taxaEvaporacao;
	}

	/**
	 * @param taxaEvaporacao the taxaEvaporacao to set
	 */
	public void setTaxaEvaporacao(double taxaEvaporacao) {
		this.taxaEvaporacao = taxaEvaporacao;
	}

	/**
	 * @return the q
	 */
	public double getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(double q) {
		this.q = q;
	}

	/**
	 * @return the maxIteracoes
	 */
	public int getMaxIteracoes() {
		return maxIteracoes;
	}

	/**
	 * @param maxIteracoes the maxIteracoes to set
	 */
	public void setMaxIteracoes(int maxIteracoes) {
		this.maxIteracoes = maxIteracoes;
	}
	
	
	
	
}
