package gestionEleves;

public class Main {
    public static void main(String[] args) throws NoteInvalide {
        Eleve e1=new Eleve("Khalid");
        e1.ajouterNote(14.5);
        e1.ajouterNote(18.5);

        Eleve e2=new Eleve("Mohamed");
        e2.ajouterNote(10.5);
        e2.ajouterNote(17);

        Eleve e3=new Eleve("Mohamed");
        e3.ajouterNote(11);
        e3.ajouterNote(14);
        e3.ajouterNote(19);


        GroupeEleves g=new GroupeEleves();
        g.ajouterEleve(e1);
        g.ajouterEleve(e2);
        g.ajouterEleve(e3);


        System.out.println("nbr des eleves:"+g.nombre());
        g.lister();


        System.out.println("Recherche de l'eleve Khalid:");
        Eleve khalid=g.chercher("Khalid");
        if (khalid!=null){
            System.out.println("Khalid found : "+khalid);
        }else {
            System.out.println("Khalid not found");
        }



        //test de la methode compareTo
        int result=e1.compareTo(e2);
        if (result < 0) {
            System.out.println(e1.getNom() +" classed less than "+e2.getNom());
        }else if (result > 0) {
            System.out.println(e1.getNom() +" classed better than "+e2.getNom());
        }else {
            System.out.println(e1.getNom() +" et "+e2.getNom()+" ont la meme moyenne");
        }



        //test des methodes trierEleves() et meilleurEleve()

        //meilleurEleve()
        Eleve meilleur=g.meilleurEleve();
        System.out.println("le meilleur eleve est: "+meilleur.getNom());

        //trierEleves()
        g.trierEleves();
        System.out.println("Liste des élèves triée par ordre croissant de moyenne sont: \n");
        for (Eleve e:g.getList()){
            System.out.println(e);
        }
    }
}