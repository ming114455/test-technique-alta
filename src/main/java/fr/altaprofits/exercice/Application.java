package fr.altaprofits.exercice;

import fr.altaprofits.exercice.animal.Canard;
import fr.altaprofits.exercice.animal.Pigeon;
import fr.altaprofits.exercice.vehicule.Avion;
import fr.altaprofits.exercice.vehicule.Helicoptere;
import fr.altaprofits.exercice.vehicule.JetSki;
import fr.altaprofits.exercice.vehicule.Moto;

public class Application {
    public static void main(String[] args) {
        Hangar hangar = new Hangar();

        Moto moto1 = new Moto();
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Helicoptere helico1 = new Helicoptere();
        JetSki jetSki1 = new JetSki();

        hangar.entre(moto1);
        hangar.entre(avion1);
        hangar.entre(avion2);
        hangar.entre(helico1);
        hangar.entre(jetSki1);

        hangar.imprimerToutDansConsole();

        System.out.println("Nombre de v�hicule dans le hangar : " + hangar.nombreDeVehiculeDansHangar());
        System.out.println("Nombre de v�hicule dans l'a�roport : " + hangar.nombreDeVehiculesDansAeroport());
        System.out.println("Nombre de v�hicule dans le garage : " + hangar.nombreDeVehiculesDansGarage());
        System.out.println("Nombre de v�hicule dans le port : " + hangar.nombreDeVehiculeDansPort());

        avion1.seDeplace(10, 30);
        avion1.seDeplace(30, 60);
        avion2.seDeplace(25, 55);
        helico1.seDeplace(23, 11);
        jetSki1.seDeplace(3, 9);
        
        
        
        // nouveau Ferme
        Pigeon pigeon = new Pigeon();
        Canard canard = new Canard();
        
        Ferme ferme = new Ferme();
        ferme.entre(pigeon);
        ferme.entre(canard);
        
        long nombreVolerDansHangarEtFerme = hangar.getNombreVolerDansHanger() + ferme.getNombreVolerDansFerme();
        System.out.println("Nombre de voler dans hangar et ferme : " + nombreVolerDansHangarEtFerme);
        
        long nombreNaviguerDansHangarEtFerme = hangar.getNombreNaviguerDansHanger() + ferme.getNombreNaviguerDansFerme();
        System.out.println("Nombre de naviguer dans hangar et ferme : " + nombreNaviguerDansHangarEtFerme);
        
        long nombreRoulerDansHangarEtFerme = hangar.getNombreRoulerDansHanger() + ferme.getNombreRoulerDansFerme();
        System.out.println("Nombre de rouler dans hangar et ferme : " + nombreRoulerDansHangarEtFerme);
        
    }
}
