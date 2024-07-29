
public class Compte_de_fidelite {
	//declaration de attribut 
	private Client client ;
	private  String mot_de_pass;
	// les coontructeur 
	public Compte_de_fidelite() {}
	public Compte_de_fidelite(Client client, String mot_de_pass) {
		super();
		this.client = client;
		this.mot_de_pass = mot_de_pass;
	}
	// les getter
	public String getMot_de_pass() {
		return mot_de_pass;
	}
	public Client getClient() {
		return client;
	}
	// les setter
	public void setMot_de_pass(String mot_de_pass) {
		this.mot_de_pass = mot_de_pass;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	// tostring
	public String toString() {
		return "Compte_de_fidelite [client=" + client + ", mot_de_pass=" + mot_de_pass + "]";
	}
	// affichage du compte
	public void affiche_copmte_de_client()
	{
		System.out.println("le client est:");
		client.affiche_client();
		System.out.println("le mot de passe est:"+mot_de_pass);
		
	}
	
	
	

}
