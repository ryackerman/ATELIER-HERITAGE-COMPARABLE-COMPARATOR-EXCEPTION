package gestionEleves;

import java.util.ArrayList;
import java.util.Objects;

public class Eleve implements Comparable<Eleve>{
    private String nom;
    private ArrayList<Double> listeNotes;
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes=new ArrayList<Double>();
        this.moyenne=0.0;
    }
    public void calculeMoyenne(){
//        double m=0;
//        for (double note:listeNotes){
//            m+=note;
//        }
//        if(listeNotes.size()>0) moyenne=m/listeNotes.size();
//                else moyenne=0.0;
        if(listeNotes.size()==0){
            moyenne=0.0;
            return;
        }
        double sum=0.0;
        for (double note:listeNotes){
            sum+=note;
        }
        moyenne=sum/listeNotes.size();
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
        if (note<0 || note>20)
            throw new NoteInvalide("La note inseree est invalide");
        listeNotes.add(note);
        calculeMoyenne();
        //this.moyenne=listeNotes.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
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


    //Partie 3

    public int compareTo(Eleve e){
        if (this.moyenne<e.moyenne) return -1;
        else if (this.moyenne>e.moyenne) return 1;
        else return 0;

        //return Double.compare(this.moyenne, eleve.moyenne);
    }
}
