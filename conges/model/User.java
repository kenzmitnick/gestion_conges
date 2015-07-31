package conges.model;

public class User {

	private int idUser;
	private String login;
	private String motDePasse;
	private String prenom;
	private String nom;
	private TypeUser type;

	public User() {

	}

	public User(int id, String login, String mdp, String pnom, String nom) {

	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeUser getType() {
		return type;
	}

	public void setType(TypeUser type) {
		this.type = type;
	}

}
