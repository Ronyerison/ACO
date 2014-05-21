/**
 * 
 */
package br.com.rony.grafo;

/**
 * @author Ronyerison
 *
 */
public class Aresta {
	
	private Vertice vInicial;
	private Vertice vFinal;
	private Double distancia;
	private Double feromonio;
	private Double prob;
	
	/**
	 * @param vInicial
	 * @param vFinal
	 * @param distancia
	 */
	public Aresta(Vertice vInicial, Vertice vFinal, Double distancia) {
		this.vInicial = vInicial;
		this.vFinal = vFinal;
		this.distancia = distancia;
		vInicial.getArestasAdj().add(this);
		vFinal.getArestasAdj().add(this);
	}
	/**
	 * @param vInicial
	 * @param vFinal
	 */
	public Aresta(Vertice vInicial, Vertice vFinal) {
		this.vInicial = vInicial;
		this.vFinal = vFinal;
		this.distancia = null;
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
	 * @return the vFinal
	 */
	public Vertice getvFinal() {
		return vFinal;
	}
	/**
	 * @param vFinal the vFinal to set
	 */
	public void setvFinal(Vertice vFinal) {
		this.vFinal = vFinal;
	}
	/**
	 * @return the distancia
	 */
	public Double getDistancia() {
		return distancia;
	}
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	/**
	 * @return the feromonio
	 */
	public Double getFeromonio() {
		return feromonio;
	}
	/**
	 * @param feromonio the feromonio to set
	 */
	public void setFeromonio(Double feromonio) {
		this.feromonio = feromonio;
	}
	
	/**
	 * @return the prob
	 */
	public Double getProb() {
		return prob;
	}
	
	/**
	 * @param prob the prob to set
	 */
	public void setProb(Double prob) {
		this.prob = prob;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aresta [vInicial=" + vInicial + ",\n vFinal=" + vFinal
				+ ",\n distancia=" + distancia + ",\n feromonio=" + feromonio
				+ ",\n prob=" + prob + "]";
	}
	
	
	
}
