package cartes;

public class Botte extends Probleme{

	
	public Botte(Type type) {
		super(type);
	}
	
	public toString() {
		Type type = getType();
		return type.botte();
	}
}
