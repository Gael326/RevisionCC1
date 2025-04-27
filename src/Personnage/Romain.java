package Personnage;

public class Romain {
	String nom;
	int force;
	
	
	public Romain(String nom, int force) {
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
		return "Le romain "+nom+" : ";
	}
	
	public void recevoirCoup(int forceCoup){
		force-=forceCoup;
		if(force<1) {
			parler("J'abandonne !");
			
		}else {
			parler("Aïe");
		}
	}
	
	
	
}
