package jeu;

import cartes.Carte;
public class Sabot {
	
	private Carte[] cartes;
	private int nbCartes;
	
	public Sabot(Carte[] cartes) {
        this.cartes = cartes; 
        this.nbCartes = cartes.length;  
    }

    
    public boolean estVide() {
        return nbCartes == 0; 
    }

}
