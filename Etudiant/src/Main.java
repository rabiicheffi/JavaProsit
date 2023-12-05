import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args)
    {
        Etudiant et=new Etudiant(1,"ahmed",16);
        Etudiant et1=new Etudiant(2,"fayez",28);

        List<Etudiant> listEtudiants=new ArrayList<Etudiant>();
        StudentManagement sm = new StudentManagement();

        listEtudiants.add(et);
        listEtudiants.add(et1);
        sm.displayEtudiants(listEtudiants,e -> System.out.println(e)) ;
        sm.returnEtudiantsNames(listEtudiants,(e)->e.getNom());
        listEtudiants.add(sm.createEtudiant(()->new Etudiant(3,"mohamed",17)));
        System.out.println("Moins de 18 ans");
        sm.displayEtudiantsByFilter(listEtudiants,e->e.getAge()<18, e->System.out.println(e));


    }
}
