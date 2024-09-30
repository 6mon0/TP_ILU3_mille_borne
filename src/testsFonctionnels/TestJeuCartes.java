package testsFonctionnels;
import cartes.Configuration;
import cartes.Borne;
import cartes.Carte;
import cartes.Botte;
import cartes.Type;


public class TestJeuCartes {
	
	
	public static void main(String[] args) {
        
        Carte carte1 = new Borne(25);
        Carte carte2 = new Botte(Type.FEU); 

        Configuration config1 = new Configuration(carte1, 10); 
        Configuration config2 = new Configuration(carte2, 5);  

        
        Configuration[] configurations = {config1, config2};

        
        Configuration.JeuDeCartes jeuDeCartes = new Configuration.JeuDeCartes(configurations);

        
        System.out.println(jeuDeCartes.affichageJeuDeCartes());

        
        Carte[] cartes = jeuDeCartes.donnerCartes();

        for (Carte carte : cartes) {
            System.out.println(carte);
        }
    }
}
