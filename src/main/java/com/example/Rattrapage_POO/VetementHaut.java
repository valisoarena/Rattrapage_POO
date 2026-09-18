package com.example.Rattrapage_POO;

public class VetementHaut extends Vetement{
    private TypeManche typeManche;

    public VetementHaut(String nom, Taille taille, double prixUnitaire, String materiel, TypeManche typeManche) {
        super(nom, taille, prixUnitaire, materiel);
        this.typeManche = typeManche;
    }

    public TypeManche getTypeManche() {
        return typeManche;
    }

    public void setTypeManche(TypeManche typeManche) {
        this.typeManche = typeManche;
    }
}
