package metier;

public class CreditMetierImpl implements ICreditMetier {

	@Override
	public double calculCredit(double m, double t, int duree) {
		double taux = t/100;
		double numerateur = m * taux/12;
		double denominateur = 1 - Math.pow((1+taux/12), -duree);
		return numerateur/denominateur;
	}

}
