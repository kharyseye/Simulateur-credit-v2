package metier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestUnitcalculcredit {
	private static ICreditMetier metier ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		metier = new CreditMetierImpl();
	}

	@Test
	void testCalculCredit() {
		double montant = 200000;
		double taux = 4.5;
		int duree = 240;
		
		double resultatAttendu = 1265.2987;
		double resultatObtenu = metier.calculCredit(montant, taux, duree);
		
		assertEquals(resultatAttendu, resultatObtenu,0.0001);
		
		
	}

}
