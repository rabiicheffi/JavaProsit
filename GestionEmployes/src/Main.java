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

        //Avec HashSet
        System.out.println("Avec HashSet");
        DepartementHashSet depart=new DepartementHashSet();
        Departement d=new Departement(1,"Departement1",5);
        Departement d1=new Departement(5,"Departement2",10);
        Departement d2=new Departement(2,"Departement2",10);
        Departement d3=new Departement(4,"Departement2",10);
        depart.ajouterDepartement(d);
        depart.ajouterDepartement(d1);
        depart.ajouterDepartement(d2);
        depart.ajouterDepartement(d3);

        depart.displayDepartement();

        System.out.println("\n Apres Tri");
        System.out.println(depart.trierDepartementById());


    }
}
