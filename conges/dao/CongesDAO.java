package conges.dao;

import java.util.ArrayList;
import java.util.List;

import conges.model.Absence;


public class CongesDAO {
	
	//Parametres de connexion � la base de donn�es
	
	public void enregistrerAbsence(Absence abs) {
		
		//String request = "insert into "
	}
	
	public void enregistrerConges(Absence abs) {
		
	}

	public List<Absence> listerDemande(){
		
		List<Absence> demandes = new ArrayList<Absence>();
		
		// Connexion � la base puis execution de la requette select
		return demandes;
	}

	public void traiterDemande(Absence abs, boolean estAccepte){
		
	}
}
