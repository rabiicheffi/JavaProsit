package tn.esprit.gestionzoo.entities;

public  abstract class AnimalAquatique extends Animal{
    protected String habitat;

   public  AnimalAquatique (){};
    public AnimalAquatique(String family,String name,int age,boolean isMammal,String habitat)
    {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }


     public  abstract  void swim();

    @Override
    public boolean equals(Object obj)
    {
    if(obj==null) return false;

    if(obj instanceof AnimalAquatique a)
        return this.age==a.age && this.name.equals(a.name) && this.habitat.equals(a.habitat);

    return false;
    }

    @Override
    public String toString() {
        return super.toString() + " || Habitat : "+this.habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
