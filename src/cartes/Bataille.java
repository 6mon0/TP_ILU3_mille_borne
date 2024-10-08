package cartes;

public abstract class Bataille extends Probleme {
    protected Type type;

    public Bataille(Type type) {
        super(type);  // Ensure this is set in Probleme
        this.type = type;  // Initialize the type variable here
    }
}