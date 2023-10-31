package tn.esprit.gestionzoo.entities;

public class AnimalTerrestre extends Animal{

    private int nbrLegs;

    public AnimalTerrestre(String family,String name,int age,boolean isMammal,int nbrLegs)
    {
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbr)
    {
        this.nbrLegs=nbr;
    }
}
