import java.util.HashMap;
import java.util.Map;

public class AffectationHashMap {

    Map<Employe,Departement> myMap;

    AffectationHashMap()
    {
        myMap=new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e , Departement d)
    {
        myMap.put(e,d);
    }

    public void afficherEmployeDepartement()
    {
        for (Map.Entry<Employe,Departement> entry : myMap.entrySet())
        {
            System.out.println("Key : "+entry.getKey()+"Value : "+entry.getValue()+"\n");
        }
    }
}
