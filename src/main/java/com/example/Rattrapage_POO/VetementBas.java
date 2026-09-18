package com.example.Rattrapage_POO;

public class VetementBas extends Vetement{
    private int tourTaille;

    public VetementBas(String nom, Taille taille, double prixUnitaire, String materiel, int tourTaille) {
        super(nom, taille, prixUnitaire, materiel);
        this.tourTaille = tourTaille;
    }

    public int getTourTaille() {
        return tourTaille;
    }

    public void setTourTaille(int tourTaille) {
        this.tourTaille = tourTaille;
    }
}
