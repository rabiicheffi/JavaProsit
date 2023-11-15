public class Main {

    public static void main(String[] args)
    {
        SocieteArrayList so=new SocieteArrayList();
        Employe e =new Employe(5,"rabii","test","Depart1",2);
        Employe e2 =new Employe(2,"mohamed","ahmed","Depart2",2);
        Employe e3 =new Employe(1,"mohamed","fedi","Depart2",2);

        so.ajouterEmploye(e);
        so.ajouterEmploye(e2);
        so.ajouterEmploye(e3);
        System.out.println("Avant tri");
        so.displayEmploye();
        System.out.println(so.rechercherEmploye(e3));
        so.trierEmployeParId();
        System.out.println("Apres Tri Par Id");
        so.displayEmploye();

        System.out.println("\nApres Tri Par Dep Et Grade");
        so.trierEmployeParNomDepartementEtGrade();
        so.displayEmploye();





    }
}
