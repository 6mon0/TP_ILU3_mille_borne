package cartes;

public class Configuration extends Carte {
	private Carte carte;
    private int nbExemplaires;

    public Configuration(Carte carte, int nbExemplaires) {
        this.carte = carte;
        this.nbExemplaires = nbExemplaires;
    }

    public Carte getCarte() {
        return carte;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }
    
    
    public static class JeuDeCartes {
        private Configuration[] typesDeCartes;

        public JeuDeCartes(Configuration[] typesDeCartes) {
            this.typesDeCartes = typesDeCartes;
        }

        public String affichageJeuDeCartes() {
            StringBuilder affichage = new StringBuilder("JEU :\n");
            for (Configuration config : typesDeCartes) {
                affichage.append(config.getNbExemplaires())
                         .append(" ")
                         .append(config.getCarte().toString())
                         .append("\n");
            }
            
            return affichage.toString();
        }
        
        public Carte[] donnerCartes() {
            int totalCartes = 0;
            for (Configuration config : typesDeCartes) {
                totalCartes += config.getNbExemplaires();
            }

            Carte[] toutesLesCartes = new Carte[totalCartes];

            int index = 0;
            for (Configuration config : typesDeCartes) {
                for (int i = 0; i < config.getNbExemplaires(); i++) {
                    toutesLesCartes[index] = config.getCarte();
                    index++;
                }
            }
            return toutesLesCartes;
        }
    }
}
