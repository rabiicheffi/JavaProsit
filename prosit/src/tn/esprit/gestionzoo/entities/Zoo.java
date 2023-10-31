package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.AnimalAquatique;

public class Zoo {
    Animal[] animals;
    private int nbr_animal;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;

    private AnimalAquatique[] aquaticAnimals=new AnimalAquatique[10];
    private  int NBR_AnimalAquatic=0;



    public Zoo()
    {

    }
    public void addAquaticAnimal(AnimalAquatique aquatique)
    {
        boolean test=false;
        int i=0;

            while (i < aquaticAnimals.length && !test) {
                if (aquaticAnimals[i] == null) {
                    if(aquatique  instanceof Penguin peng) {

                        aquaticAnimals[i] = peng;
                    } else if (aquatique instanceof  Dolphin dol) {
                        aquaticAnimals[i]=dol;
                        
                    }
                    test = true;
                    NBR_AnimalAquatic++;
                } else
                    i++;
            }

    }

    public void afficherSwim()
    {
        for (int i=0;i<NBR_AnimalAquatic;i++)
        {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth()
    {
        float max=0;

        for (int i=0;i<NBR_AnimalAquatic;i++)
        {
            if(aquaticAnimals[i] instanceof Penguin p)
            {
                if(p.getSwimmingDepth()>max)
                    max=p.getSwimmingDepth();
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType()
    {
        int dolph=0,pengu=0;

        for (int i=0;i<NBR_AnimalAquatic;i++) {

            if(aquaticAnimals[i] instanceof Penguin)
                pengu++;
            else if(aquaticAnimals[i] instanceof Dolphin)
            dolph++;
        }
        System.out.println("Le Nombre de Penguin est : "+pengu+" || Le nombre de Dolphin est : "+dolph);
        }


    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        if(!name.isEmpty())
            this.name = name;
        this.city = city;
    }

    public void displayZoo() {

        System.out.println(this.name + this.city);
    }

    public void setName(String name)
    {
        if(!name.isEmpty())
            this.name=name;
    }
    public boolean addAnimal(Animal animal) {

        if (!isZooFull()) {

            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    nbr_animal++;

                    return true;
                }


            }
        }
        return false;
    }

    public void showAnimal() {
        for (int i = 0; animals[i] != null; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; animals[i] != null; i++) {
            if (animal.getName() == animals[i].getName()) {
                return i;
            }

        }
        return -1;

    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; animals[i] != null; i++) {
            if (i == searchAnimal(animal)) {
                Animal[] newAnimal = new Animal[animals.length - 1];
                System.arraycopy(animals, 0, newAnimal, 0, i);
                System.arraycopy(animals, i + 1, newAnimal, i, animals.length - i - 1);
                nbr_animal--;
                return true;

            }
        }
        return false;

    }

    public boolean isZooFull() {
       /* if (this.nbr_animal < this.NBR_CAGES)
            return false ;
        return true;*/
        //return !(this.nbr_animal < this.NBR_CAGES) ;
        //return !(this.nbr_animal < this.NBR_CAGES) ;
        return !(this.nbr_animal < this.NBR_CAGES) ? true : false;
    }


    @Override
    public String toString() {
        return this.name;

    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbr_animal < z2.nbr_animal)
            return z2;
        return z1;

    }
}