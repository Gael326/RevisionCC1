package Personnage;

public class Druides {
	String nom;
	int force;
	
	public Druides(String name, int force) {
		this.nom=name;
		this.force=force;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole()+texte);
	}
	
	private String prendreParole() {
		return "Le Druide "+nom+" : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion){
		Chaudron.remplirChaudron(quantite, forcePotion);
		parler("j'ai concocté "+Chaudron.quantitePotion+" doses de potion magique. Elle a une force de "+Chaudron.forcePotion+".");
	}
	
	public void booster(Gaulois gaulois) {
		if(Chaudron.resterPotion()) {
			if(gaulois.getNom()=="Obelix"){
				parler("Non "+gaulois.getNom()+" Non !... Et tu le sais très bien !");
			}else {
				gaulois.boirePotion(Chaudron.prendreLouche());
				parler("Tiens "+gaulois.getNom()+" un peu de potion magique");
			}
		}else {
			parler("Désolé "+ gaulois+" il n'y a plus une seule goute de potion");
		}
	}
	
	
}
