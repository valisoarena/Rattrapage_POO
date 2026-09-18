package com.example.Rattrapage_POO;

public class Vetement {
    private String nom;
    private Taille taille;
    private double prixUnitaire;
    private String materiel;

    public Vetement(String nom, Taille taille, double prixUnitaire, String materiel) {
        this.nom = nom;
        this.taille = taille;
        this.prixUnitaire = prixUnitaire;
        this.materiel = materiel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }
}
