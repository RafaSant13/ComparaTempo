package view;
import controller.TempoControle;

public class Principal {

	public static void main(String[] args) {
		TempoControle TC = new TempoControle();
		System.out.println("Vetor com 1000   ==> "+TC.Tempo(1000)+" nS.");
		System.out.println("Vetor com 10000  ==> "+TC.Tempo(10000)+" nS.");
		System.out.println("Vetor com 100000 ==> "+TC.Tempo(100000)+" nS.");
	}

}
