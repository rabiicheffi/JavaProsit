package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagment {
        public static void main(String[] args) {
            //Scanner scanner = new Scanner(System.in);
            //int nbrCages ;
            //String zooName;
            //do {
            //   nbrCages = scanner.nextInt();
            //}while(nbrCages<2) ;
            //do {
            // zooName = scanner.nextLine();
            //}while (zooName.length() < 3 );
            // System.out.println( zooName + " comporte " +  nbrCages  +  " cages");

            //Animal lion = new Animal("XXX","lion",14,true);
            Animal lion1 = new Animal("XXX","lion",14,true);
            Animal lion2 = new Animal("XXX","lion",14,true);
            Animal lion3 = new Animal("XXX","lion",14,true);
            Animal lion4 = new Animal("XXX","lion",14,true);
            Zoo myZoo = new Zoo("ZooZoo","Tunis");
            Zoo myZoo2 = new Zoo("Zoo","Tunis");
            //sur la méthode main on gagne de l'espace et c'est plus facile de déclarer ?
            //myZoo.displayZoo();
            //lion.displayAnimal();
            //System.out.println(myZoo);
            //System.out.println(myZoo.toString()); //affichage d'un code ?
            //System.out.println(myZoo.name + myZoo.city + myZoo.nbrCages);
            //System.out.println(lion.family + lion.name + lion.age + lion.isMammal);
            myZoo2.addAnimal(lion1);
            myZoo2.addAnimal(lion2);
            myZoo2.addAnimal(lion3);
            myZoo.addAnimal(lion4);


            //myZoo.showAnimal();
            //System.out.println(myZoo.searchAnimal(lion));
            //System.out.println(myZoo.removeAnimal(lion));
            //System.out.println(myZoo.isZooFull());
            //System.out.println(myZoo.animalCount());
            //System.out.println(myZoo2.animalCount());
            //System.out.println("The zoo that has more animals is : " + newzoo);
            myZoo.comparerZoo(myZoo,myZoo2);

           // AnimalAquatique an=new AnimalAquatique("test","Penguinou",12,false,"Afrique");

            System.out.println("\nAnimal Aquatique :");
           // System.out.println(an);
            //an.swim();

            Dolphin dolph=new Dolphin("test","Penguinou",12,false,"Afrique",120);
            System.out.println("\nDolphin :");
            //System.out.println(dolph);*/
            dolph.swim();

            Penguin peng=new Penguin("test","Penguinou",12,false,"Afrique",10);
            System.out.println("\nPenguin :");
            Penguin peng1=new Penguin("test","Penguinou",12,false,"Afrique",25);
            Penguin peng2=new Penguin("test","Penguinou",12,false,"Afrique",5);
            //System.out.println(peng);
            peng.swim();

            //AnimalAquatique anim= (Dolphin)new Dolphin("test","Penguinou",12,false,"Afrique",120);

            System.out.println("HERE");
            myZoo.addAquaticAnimal(peng);
            myZoo.addAquaticAnimal(dolph);
            myZoo.addAquaticAnimal(peng1);
            myZoo.addAquaticAnimal(peng2);

         
            myZoo.afficherSwim();

            System.out.println("Le Maximum depth des Penguins est : "+myZoo.maxPenguinSwimmingDepth());
            myZoo.displayNumberOfAquaticsByType();





            /*Penguin peng=new Penguin();
            Dolphin dolph=new Dolphin();*/

        }
    }
