
public class Article {

	private int prix;
	private String nom;
	
	public Article(String nom, int prix) {
		this.prix = prix;
		this.nom = nom;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
}
