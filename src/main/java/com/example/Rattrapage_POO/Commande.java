package com.example.Rattrapage_POO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {
    private Date dateCommande;
    private String description;
    private int quantiteVetement;
    private List<Vetement>vetementsCommande;
    private List<Client>clients;

    public Commande(Date dateCommande, String description, int quantiteVetement, List<Vetement> vetementsCommande,List<Client> clients) {
        this.dateCommande = dateCommande;
        this.description = description;
        this.quantiteVetement = quantiteVetement;
        this.vetementsCommande = vetementsCommande;
        this.clients = clients;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantiteVetement() {
        return quantiteVetement;
    }

    public void setQuantiteVetement(int quantiteVetement) {
        this.quantiteVetement = quantiteVetement;
    }

    public List<Vetement> getVetementsCommande() {
        return vetementsCommande;
    }

    public void setVetementsCommande(List<Vetement> vetementsCommande) {
        this.vetementsCommande = vetementsCommande;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public double coutTotal(){
        double resultat = 0;
        for(Vetement v:vetementsCommande){
            resultat += v.getPrixUnitaire();
        }
        return resultat;
    }
}
