public class Etudiant {

    private int id;
    private String nom;
    private int age;

    Etudiant()
    {

    }
    Etudiant(int id,String nom,int age)
    {
        this.id=id;
        this.nom=nom;
        this.age=age;
    }
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
