package tn.esprit.gestionzoo.entities;

public class Penguin extends AnimalAquatique{

    private float swimmingDepth;

    public Penguin(){};
    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth){

            super(family,name,age,isMammal,habitat);
            this.swimmingDepth=swimmingDepth;
        }

    @Override
    public void swim()
    {
        System.out.println("This Penguin is swimming");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSwimming Depth : "+this.swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

}
