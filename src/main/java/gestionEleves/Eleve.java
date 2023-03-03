package gestionEleves;

import java.util.ArrayList;
import java.util.Objects;

public class Eleve extends GroupeEleves{
    private String nom;
    private ArrayList<Double> listeNotes;
    private Double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
    }

    public Double getMoyenne() {
        return moyenne;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Double> getListeNotes() {
        return listeNotes;
    }
    public void ajouterNote(double note) throws NoteInvalide {
        if (note<0||note>20)
            throw new NoteInvalide("La note inseree est invalide");
        else listeNotes.add(note);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Eleve){
            Eleve eleve=(Eleve) o;
            return this.nom.equals(eleve.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return nom + " (" + moyenne + ")";
    }
}
