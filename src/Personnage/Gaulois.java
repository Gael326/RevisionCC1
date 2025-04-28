package Personnage;


import Personnage.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	private Village village=null;
	
	public Gaulois(String nom , int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public void sePresenter() {
		if(village!=null&&this.village.getChef()==this) {
			System.out.println(prendreParole()+"Bonjour , je m'appelle "+nom+" Je suis le chef du village : "+this.village.getNom());
		}
		if(village!=null&&this.village.getChef()!=this){
			System.out.println(prendreParole()+"Bonjour , je m'appelle "+nom+" J'habite le village : "+this.village.getNom());
		}
		if(this.village==null) {
			System.out.println(prendreParole()+"Bonjour , je m'appelle "+nom+" Je suis un gitan ");
		}
	}
	
	
	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans la machoire de "+romain.getNom());
		romain.recevoirCoup(force*effetPotion/3);
		this.effetPotion=1;
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
		return "Le gaulois "+nom+" : ";
	}
	
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		System.out.println(Asterix);
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void setVillage(Village village) {
		this.village=village;
	}
	
}
