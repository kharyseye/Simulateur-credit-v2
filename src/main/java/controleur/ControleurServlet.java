package controleur;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CreditMetierImpl;
import metier.ICreditMetier;
import model.CreditModel;


public class ControleurServlet extends HttpServlet {
	private ICreditMetier metier;
	
	@Override
	public void init() throws ServletException {
		metier = new CreditMetierImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("model", new CreditModel());
		req.getRequestDispatcher("vue.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double montant = Double.parseDouble(req.getParameter("montant"));
		double taux = Double.parseDouble(req.getParameter("taux"));
		int duree = Integer.parseInt(req.getParameter("duree"));
		
		CreditModel model = new CreditModel();
		model.setMontant(montant);
		model.setTaux(taux);
		model.setDuree(duree);
		
		double resultat = metier.calculCredit(montant, taux, duree);
		model.setMensualite(resultat);
		
		req.setAttribute("model", model);
		req.getRequestDispatcher("vue.jsp").forward(req, resp);
	}

}
