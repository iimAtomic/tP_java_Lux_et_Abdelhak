package com.tpdeluxetabdel.luxetabdelapp;

public class chaine {
    private String contenu;
    private chaine suivant;

    public chaine(String contenu) {
        this.contenu = contenu;
        this.suivant = null;
    }

    public String getContenu() {
        return contenu;
    }

    public chaine getSuivant() {
        return suivant;
    }

    public void setSuivant(chaine suivant) {
        this.suivant = suivant;
    }

    // Ajouter un élément à la fin
    public void ajouterFin(String contenu) {
        chaine temp = this;
        while (temp.suivant != null) {
            temp = temp.suivant;
        }
        temp.suivant = new chaine(contenu);
    }

    // Supprimer le premier élément et retourner son contenu
    public String supprimerDebut() {
        if (this.suivant != null) {
            String contenu = this.suivant.contenu;
            this.suivant = this.suivant.suivant;
            return contenu;
        } else {
            throw new IllegalStateException("La liste est vide");
        }
    }

    // Rechercher un élément
    public boolean contient(String recherche) {
        chaine temp = this.suivant; // On commence par le suivant pour ignorer la tête
        while (temp != null) {
            if (temp.contenu.equals(recherche)) {
                return true;
            }
            temp = temp.suivant;
        }
        return false;
    }

    // Calculer la taille
    public int taille() {
        int taille = 0;
        chaine temp = this.suivant; // On commence par le suivant pour ignorer la tête
        while (temp != null) {
            taille++;
            temp = temp.suivant;
        }
        return taille;
    }

    // Vérifier si la liste est vide
    public boolean estVide() {
        return this.suivant == null;
    }
}
