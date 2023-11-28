import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Management {

    void displayEtudiants(List<Etudiant> Etudiants, Consumer<Etudiant> con);

    void displayEtudiantsByFilter(List<Etudiant> Etudiants, Predicate<Etudiant> pre,Consumer<Etudiant> con);
    String returnEtudiantsNames(List<Etudiant> Etudiants,Function<Etudiant, String> fun);
    Etudiant createEtudiant(Supplier<Etudiant> sup);
    List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants,Comparator<Etudiant> com);
    Stream<Etudiant> convertToStream(List<Etudiant> students);
}
