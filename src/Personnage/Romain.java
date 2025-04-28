package Personnage;

import Objets.Equipement;
public class Romain {
	String nom;
	int force;
	Equipement[] equipement= new Equipement[2];
	int nbEquipements;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0 : "La force doit être positive";
	}
	
	public String getNom() {
		return this.nom;
	}
	
	private boolean isInvariantVerified(int truc) {
		return truc>=0;
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
		assert forceCoup>0 : "la force du coup doit etre positive";
		force-=forceCoup;
		if(force<1) {
			parler("J'abandonne !");
			
		}else {
			parler("Aïe");
		}
		if(!isInvariantVerified(force)) {
			force=0;
		}
	}
	
	public void sEquiper(Equipement equipement) {
		if(nbEquipements==2) {
			System.out.println("Le soldat "+nom+" est deja bien équipé");
		}
		else if(nbEquipements==1&&this.equipement[0]==equipement) {
				System.out.println("Le soldat "+nom+" possède deja "+equipement);
		}else {
			if(nbEquipements==1) {
				this.equipement[1]=equipement;
				nbEquipements++;
				System.out.println("Le soldat "+nom+" s'équipe aevc un "+equipement);
			}else {
				this.equipement[0]=equipement;
				nbEquipements++;
				System.out.println("Le soldat "+nom+" s'équipe aevc un "+equipement);
			}
		}
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain Minus = new Romain("Minus",6);	
		Equipement casque = Equipement.CASQUE;
		Equipement bouclier = Equipement.BOUCLIER;
		Minus.sEquiper(casque);
		Minus.sEquiper(casque);
		Minus.sEquiper(bouclier);
		Minus.sEquiper(bouclier);
	}
}
