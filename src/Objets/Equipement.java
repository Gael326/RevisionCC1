package Objets;

public enum Equipement {
	CASQUE("Casque"),BOUCLIER("Bouclier");
	
	final String  nom;
	
	Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return this.nom;
	}
}
