package conges.service;

import conges.dao.*;
import conges.model.*;

public class CongesService {

	public static void demanderConges(Absence abs) {
		new CongesDAO().enregistrerConges(abs);
	}

	public static void demanderAbsence(Absence abs) {
		new CongesDAO().enregistrerAbsence(abs);
	}

	public static void validerDemande(Absence abs) {
		new CongesDAO().traiterDemande(abs, true);
	}

	public static void refuserDemande(Absence abs) {
		new CongesDAO().traiterDemande(abs, false);
	}

}
