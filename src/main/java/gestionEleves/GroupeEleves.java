package gestionEleves;

import java.security.interfaces.ECKey;
import java.util.ArrayList;

public class GroupeEleves{
    private ArrayList<Eleve>listeEleves;

    public GroupeEleves() {
        listeEleves=new ArrayList<Eleve>();
    }

    public int nombre(){
        return listeEleves.size();
    }
    public ArrayList<Eleve> getList(){
        return listeEleves;
    }
    public void ajouterEleve(Eleve eleve){
        listeEleves.add(eleve);
    }
    public Eleve chercher(String nom){
        for (Eleve e:listeEleves){
            if (e.getNom().equals(nom)){
                return e;
            }
        }
        return null;
    }
    public void lister(){
        System.out.println("Liste des eleves:\n");
        for (Eleve e:listeEleves){
            System.out.println(e.toString());
        }
    }
}
