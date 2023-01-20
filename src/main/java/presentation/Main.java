package presentation;

import metier.CreditMetierImpl;

public class Main {

	public static void main(String[] args) {
		CreditMetierImpl metier = new CreditMetierImpl();
		double m =metier.calculCredit(200000, 4.5, 240);
		System.out.println(m);
	}

}
