package cartes;

public enum Type {
    FEU("Feu Rouge", "Feu Vert", "Véhicule Prioritaire"),
    ESSENCE("Panne d'Essence", "Citerne", "Camion-citerne"),
    CREVAISON("Crevaison", "Roue de Secours", "Increvable"),
    ACCIDENT("Accident", "Réparations", "As du Volant"),;

    private final String attaque;
    private final String parade;
    private final String botte;

    // Enum constructor
    Type(String attaque, String parade, String botte) {
        this.attaque = attaque;
        this.parade = parade;
        this.botte = botte;
    }

    // Getters
    public String getAttaque() {
        return attaque;
    }

    public String getParade() {
        return parade;
    }

    public String getBotte() {
        return botte;
    }
}
