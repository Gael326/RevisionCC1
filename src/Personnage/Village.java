package Personnage;

import Personnage.Gaulois;

public class Village {
	
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef = new Gaulois("chef",9);
	private Gaulois[] villageois = new Gaulois[nbVillageois];
	private int nombreVillageois=0;
	
	
	
	public Village(String nom , int nb,Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = nb;
		this.chef=chef;
		villageois = new Gaulois[nbVillageois];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois  getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nombreVillageois]=gaulois;
		gaulois.setVillage(this);
		nombreVillageois++;
	}
	
	public Gaulois trouverVillageois(int NumVillageois) {
		if(NumVillageois-1>nbVillageois) {
			System.out.println("Il n'y a pas autant de villageois dans le village");
			return null;
		}
		return villageois[NumVillageois-1];
		
	}
	
	public void afficherVillage() {
		System.out.println("Dans le village "+nom+" du chef "+chef+" vivient les légendaire gaulois : ");
		int i=0;
		while(villageois[i]!=null&&i<nbVillageois) {
			System.out.println("- "+villageois[i]);
			i++;
		}
	
	}
	
	

	
	public static void main(String[] args) {
		Gaulois Abraracourcix = new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des irréductibles", 30,Abraracourcix);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(Asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		Gaulois Obelix =new Gaulois("Obelix",25);
		village.ajouterVillageois(Obelix);
		village.afficherVillage();
		Gaulois DoublePenis = new Gaulois("DoublePenis",4);
		Asterix.sePresenter();
		Obelix.sePresenter();
		DoublePenis.sePresenter();
		
	}
	
}
