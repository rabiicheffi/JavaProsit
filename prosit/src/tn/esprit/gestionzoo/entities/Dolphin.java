package tn.esprit.gestionzoo.entities;

public class Dolphin extends AnimalAquatique{

    private float swimmingSpeed;


    public  Dolphin(){};

    public void swim()
    {
        System.out.println("This Dolphine is swimming");
    }
    public Dolphin(String family,String name,int age,boolean isMammal,String habitat,float swimmingSpeed){

        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSwimming Speed : "+this.swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

}
