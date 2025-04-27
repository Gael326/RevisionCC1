package Personnage;

public class Chaudron {
	
	
	
	static int  quantitePotion=0;
	static int forcePotion=0;
	
	private Chaudron() {
			}
	
	
	public static void remplirChaudron(int quantite, int forcepotion) {
		quantitePotion=quantite;
		forcePotion=forcepotion;
	}
	
	public static Boolean resterPotion() {
		if(quantitePotion==0){
			return false;
		}
		return true;
	}
	
	public static int prendreLouche() {
		if(quantitePotion>0) {
			quantitePotion--;
		}else {
			forcePotion=0;
		}
		return forcePotion;
	}
	
}
