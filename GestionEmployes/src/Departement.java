public class Departement implements Comparable<Departement> {

    private  int id;
    private String nomDepartement;
    private int nbrEmployes;

    public int getId() {
        return id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

     Departement(int id, String nomDepartement, int nbrEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmployes = nbrEmployes;
    }

    Departement(){}

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmployes=" + nbrEmployes +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(obj instanceof Departement dep)
            return dep.id==this.id && dep.nomDepartement.equals(this.nomDepartement);
        return false;
    }


    @Override
    public int hashCode() {
        return this.id-nomDepartement.hashCode();
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.getId();
    }
}
