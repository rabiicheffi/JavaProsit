package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;
    public Animal (){};
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if(age>0)
            this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {

        System.out.println(this.family + this.name + this.age + this.isMammal);
    }

    public void setAge(int age)
    {
       if(age>0)
            this.age=age;

    }
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString() {
        return "Family: "+ this.family +" || Name: "+ this.name + " || Age : "+ this.age + " || isMammal : " + this.isMammal;

    }
}