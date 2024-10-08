package testsFonctionnels;
import cartes.Configuration;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Borne;
import cartes.Parade;
import cartes.Attaque;
import cartes.Botte;
import cartes.Type;
import cartes.Carte;

public class TestJeuCartes {
	
	
	public static void main(String[] args) {
        
		Carte borne25KM = new Borne(25);
	    Carte borne50KM = new Borne(50);
	    Carte borne75KM = new Borne(75);
	    Carte borne100KM = new Borne(100);
	    Carte borne200KM = new Borne(200);
	    
	    Carte feuVert = new Parade(Type.FEU);  // Feu Vert as a parade
        Carte finLimite = new FinLimite();  // Fin Limite as a parade
        Carte bidonEssence = new Parade(Type.ESSENCE);  // Bidon d'essence
        Carte roueSecours = new Parade(Type.CREVAISON);  // Roue de secours
        Carte reparation = new Parade(Type.ACCIDENT);  // Réparation

        Carte feuRouge = new Attaque(Type.FEU);  // Feu Rouge as an attack
        Carte limite50 = new DebutLimite();  // Limite 50 as an attack
        Carte panneEssence = new Attaque(Type.ESSENCE);  // Panne d'essence
        Carte crevaison = new Attaque(Type.CREVAISON);  // Crevaison
        Carte accident = new Attaque(Type.ACCIDENT);  // Accident

        Carte prioritaire = new Botte(Type.FEU);  // Prioritaire as a botte
        Carte citerne = new Botte(Type.ESSENCE);  // Citerne as a botte
        Carte increvable = new Botte(Type.CREVAISON);  // Increvable as a botte
        Carte asDuVolant = new Botte(Type.ACCIDENT);

        Configuration[] configurations = {
                new Configuration(borne25KM, 10),
                new Configuration(borne50KM, 10),
                new Configuration(borne75KM, 10),
                new Configuration(borne100KM, 12),
                new Configuration(borne200KM, 4),
                new Configuration(feuVert, 14),
                new Configuration(finLimite, 6),
                new Configuration(bidonEssence, 6),
                new Configuration(roueSecours, 6),
                new Configuration(reparation, 6),
                new Configuration(feuRouge, 5),
                new Configuration(limite50, 4),  // Limite 50 as an attack
                new Configuration(panneEssence, 3),
                new Configuration(crevaison, 3),
                new Configuration(accident, 3),
                new Configuration(prioritaire, 1),
                new Configuration(citerne, 1),
                new Configuration(increvable, 1),
                new Configuration(asDuVolant, 1)
            };
        
        Configuration.JeuDeCartes jeuDeCartes = new Configuration.JeuDeCartes(configurations);

        
        System.out.println(jeuDeCartes.affichageJeuDeCartes());

        /*
        Carte[] cartes = jeuDeCartes.donnerCartes();

        for (Carte carte : cartes) {
            System.out.println(carte);
        }*/
    }
}
