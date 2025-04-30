package fr.altaprofits.exercice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;

import fr.altaprofits.exercice.mode.Naviguer;
import fr.altaprofits.exercice.mode.Rouler;
import fr.altaprofits.exercice.mode.Voler;
import fr.altaprofits.exercice.vehicule.Avion;
import fr.altaprofits.exercice.vehicule.Bateau;
import fr.altaprofits.exercice.vehicule.Helicoptere;
import fr.altaprofits.exercice.vehicule.JetSki;
import fr.altaprofits.exercice.vehicule.Moto;
import fr.altaprofits.exercice.vehicule.Vehicule;
import fr.altaprofits.exercice.vehicule.Voiture;

public class Hangar {
	
	private HashSet<Vehicule> vList = new HashSet<>();

	public void entre(Vehicule v) {
		vList.add(v);
	}

	public int nombreDeVehiculesDansAeroport() {
		int nombreDeVehiculesDansAeroport = 0;
		for (Vehicule v : vList) {
			if (v instanceof Avion || v instanceof Helicoptere) {
				nombreDeVehiculesDansAeroport = nombreDeVehiculesDansAeroport + 1;
			}
		}
		return nombreDeVehiculesDansAeroport;
	}

	public int nombreDeVehiculesDansGarage() {
		int nombreDeVehiculesDansGarage = 0;
		for (Vehicule v : vList) {
			if (v instanceof Moto || v instanceof Voiture) {
				nombreDeVehiculesDansGarage = nombreDeVehiculesDansGarage + 1;
			}
		}
		return nombreDeVehiculesDansGarage;	
	}

	public int nombreDeVehiculeDansPort() {
		int nombreDeVehiculeDansPort = 0;
		for (Vehicule v : vList) {
			if (v instanceof JetSki || v instanceof Bateau) {
				nombreDeVehiculeDansPort = nombreDeVehiculeDansPort + 1;
			}
		}
		return nombreDeVehiculeDansPort;
	}

	public int nombreDeVehiculeDansHangar() {
		return nombreDeVehiculeDansPort() + nombreDeVehiculesDansAeroport() + nombreDeVehiculesDansGarage();
	}

	private void imprimerDansConsole(Vehicule v) {
		System.out.println("Vehicule de type "  + v.getClass().getSimpleName());
		System.out.println(v);
	}

	private void imprimerDansFichier(Vehicule v, File f) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new FileOutputStream(f));
		printStream.println("Vehicule de type "  + v.getClass().getSimpleName());
		printStream.println(v);
	}
	
	public void imprimerToutDansConsole() {
		for (Vehicule v : vList)
			imprimerDansConsole(v);
	}

	public void imprimerToutDansFichier(File f) throws FileNotFoundException {
		for (Vehicule v : vList)
			imprimerDansFichier(v, f);
	}
	
	public long getNombreVolerDansHanger() {
		return this.vList.stream().filter(v -> v instanceof Voler).count();
	}
	
	public long getNombreNaviguerDansHanger() {
		return this.vList.stream().filter(v -> v instanceof Naviguer).count();
	}
	
	public long getNombreRoulerDansHanger() {
		return this.vList.stream().filter(v -> v instanceof Rouler).count();
	}


}
