package test_fonctionnel;

import Personnage.Gaulois;
import Personnage.Romain;
import Personnage.Druides;

public class TestGaulois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois Asterix = new Gaulois("Asterix",8);
		Gaulois Obelix =new Gaulois("Obelix",16);
		Asterix.parler("Bonjour Obelix");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler("Oui très bonne idée");
		Romain minus =new Romain("minus",6);
		System.out.println("Dasn la foret , "+Asterix+" et "+Obelix+" tombent nez a nez sur le romain "+minus.getNom());
		for(int i=0;i<3;i++) {
			Asterix.frapper(minus);
		}
		Romain brutus = new Romain("Brutus",14);
		Druides Panoramix = new Druides("Panoramix",2);
		Panoramix.fabriquerPotion(4, 3);
		Panoramix.booster(Obelix);
		Panoramix.booster(Asterix);
		for(int i=0;i<4;i++) {
			Asterix.frapper(brutus);
		}
	
	}

}
