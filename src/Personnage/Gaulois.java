package Personnage;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom , int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	
	public int getForce() {
		return this.force;
	}
	
	public void parler(String texte){
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le gaulois"+nom+" : ";
	}
	
}
