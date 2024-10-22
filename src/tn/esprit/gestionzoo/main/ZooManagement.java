package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";
    public static void main(String[] args) {
        Scanner zooname = new Scanner(System.in);
        ZooManagement zooManagement=new ZooManagement();
        System.out.print("Entrez le nom du zoo : ");
        zooManagement.zooName = zooname.nextLine();
        System.out.println("Veuillez entrer un nombre de cages ");
        while (!zooname.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre de cages ");
            zooname.next();
        }
        zooManagement.nbrCages = zooname.nextInt();
        System.out.println(zooManagement.zooName+" comporte "+zooManagement.nbrCages+" cages");
        zooname.close();

        Animal lion=new Animal("Lions","Simba",20,true);
        Zoo myZoo=new Zoo("Singapore tn.esprit.gestionzoo.entities.Zoo","Singapore");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
        /*
        toString() affiche cette résultat tn.esprit.gestionzoo.entities.Zoo@7cd84586 cela signifie package.class avec le hashCode
        le compilateur dans ce cas fait l'appel implicite de cette méthode
         */
        Animal tigre = new Animal("Felidae", "Tigre", 7, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 15, true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);
        Animal dauphine= new Animal("Delphinidae", "Dauphin", 12, true);
        myZoo.addAnimal(dauphine);
        int foundIndex = myZoo.searchAnimal(elephant);
        int IdenticalIndex = myZoo.searchAnimal(tigre);
        System.out.println("Search result : Index " + foundIndex);
        System.out.println("Search result : Index " + IdenticalIndex);
        myZoo.removeAnimal(dauphine);
        System.out.println("Is my zoo full:"+myZoo.isZooFull());
        myZoo.displayAnimalsInfo();

        Dolphin dauphin = new Dolphin("Delphinidae", "Dauphin", 5, true, "Océan", 40.5f);

        Penguin penguin = new Penguin("pengo", "penguino", 8, true, "Aractic", 30.0f);
        Aquatic aquatic= new Aquatic("Delphinidae", "Dauphin", 5, true, "Océan");
        System.out.println(dauphin.toString());
        System.out.println(penguin.toString());
        System.out.println(aquatic.toString());


        dauphin.swim();
        penguin.swim(); //la méthode swim de penguin est hérité de la classe mère Aquatic
        aquatic.swim();



    }




}
