
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
public class DepartementHashSet implements IDepartement<Departement>{


    Set<Departement> dep = new HashSet<>();

    DepartementHashSet()
    {
    }

    @Override
    public void ajouterDepartement(Departement departement) {

        dep.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {

        for (Departement d : dep) {
            if(d.getNomDepartement().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {

        for (Departement d : dep)
        {
            if(d.equals(departement))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        dep.remove(departement);
        }



    @Override
    public void displayDepartement() {
        for (Departement de : dep) {
            System.out.println(de);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(dep);
}
}
