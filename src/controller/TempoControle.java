package controller;

public class TempoControle {

	public TempoControle() {
		super();
	}
	
	public double Tempo(int tamanho) {
		int vetor [] = new int [tamanho];
		int i;
		for (i = 0; i<tamanho ;i++) {
			vetor[i] = 0;
		}
		double tempoInicial = System.nanoTime();
		for (i = 0; i<tamanho ;i++) {

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal = tempoTotal/Math.pow(10, 9);
		return tempoTotal;
	}

}
