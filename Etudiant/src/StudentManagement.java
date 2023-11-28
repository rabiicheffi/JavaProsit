import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management {
    @Override
    public void displayEtudiants(List<Etudiant> Etudiants, Consumer<Etudiant> con) {
        for(Etudiant e:Etudiants) {
            con.accept(e);
        }
    }
    @Override
    public void displayEtudiantsByFilter(List<Etudiant> Etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for(Etudiant e:Etudiants) {
            if(pre.test(e))
                con.accept(e);
        }
    }
    @Override
    public String returnEtudiantsNames(List<Etudiant> Etudiants, Function<Etudiant, String> fun) {
        String names="";
        for (Etudiant e:Etudiants) {
            names+=fun.apply(e);}
        return names;
    }

    @Override
    public Etudiant createEtudiant(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants, Comparator<Etudiant> com) {

        List<Etudiant> et=new ArrayList<>((Collection) com);
        et.addAll(Etudiants);
        return et;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return null;
    }
}
