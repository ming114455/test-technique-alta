package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public abstract class Vehicule {
	static int idIndex = 0;
	final String reference;
	Point position;
	
	public Vehicule(String prefix) {
		this.position = new Point(0,0);
		this.reference = prefix + "-" + ++idIndex;
	}
	
	public void seDeplace(int x, int y) {
		Point destination = new Point(x,y);
		System.out.printf("Véhicule de type %s (Ref : %s), se déplace de la position %s vers %s\n", this.getClass().getSimpleName(), reference, position, destination);
        position = destination;
	}
	
}
