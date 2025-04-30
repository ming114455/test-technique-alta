package fr.altaprofits.exercice;

import java.util.HashSet;

import fr.altaprofits.exercice.animal.Animal;
import fr.altaprofits.exercice.mode.Naviguer;
import fr.altaprofits.exercice.mode.Rouler;
import fr.altaprofits.exercice.mode.Voler;

public class Ferme {
	private HashSet<Animal> aList = new HashSet<>();
	
	public void entre(Animal a) {
		aList.add(a);
	}
	
	public long getNombreVolerDansFerme() {
		return this.aList.stream().filter(a -> a instanceof Voler).count();
	}
	
	public long getNombreNaviguerDansFerme() {
		return this.aList.stream().filter(a -> a instanceof Naviguer).count();
	}
	
	public long getNombreRoulerDansFerme() {
		return this.aList.stream().filter(a -> a instanceof Rouler).count();
	}
}
