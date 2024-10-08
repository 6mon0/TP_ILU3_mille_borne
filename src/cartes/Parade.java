package cartes;

public class Parade extends Bataille {

    public Parade(Type type) {
        super(type);  // This initializes the type in the superclass (Bataille)
    }

    @Override
    public String toString() {
        return type.getParade();  // Handle null type
    }
}