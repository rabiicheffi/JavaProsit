import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class SocieteArrayList implements IGestion<Employe>{

    List <Employe> employees;

    SocieteArrayList()
    {
        employees= new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe employe) {

        employees.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {

        for (Employe e: employees) {

            if(e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {

        return employees.contains(employe);

    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employees.remove(employe);
    }

    @Override
    public void displayEmploye() {

        for (Employe e :employees) {
            System.out.println(e);
        }

    }

    @Override
    public void trierEmployeParId() {

        Collections.sort(employees);

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {



        Collections.sort(employees,new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        });
        Collections.sort(employees,new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });




    }
}
