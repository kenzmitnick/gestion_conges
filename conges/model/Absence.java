package conges.model;

import java.sql.Date;

public class Absence {

	private int idAbsence;
	private String raison;
	private Date dateDebut;
	private Date dateFin;
	private EtatAbsence etat;
	private TypeAbsence type;
	private int idEmploye;
	private int idAdmin;

	public Absence() {

	}

	public Absence(String raison) {

	}

	public int getIdAbsence() {
		return idAbsence;
	}

	public void setIdAbsence(int idAbsence) {
		this.idAbsence = idAbsence;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public EtatAbsence getEtat() {
		return etat;
	}

	public void setEtat(EtatAbsence etat) {
		this.etat = etat;
	}

	public TypeAbsence getType() {
		return type;
	}

	public void setType(TypeAbsence type) {
		this.type = type;
	}

	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

}
