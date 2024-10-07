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
        Zoo myZoo=new Zoo("Singapore Zoo","Singapore",25);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
        /*
        toString() affiche cette résultat Zoo@7cd84586 cela signifie package.class avec le hashCode
        le compilateur dans ce cas fait l'appel implicite de cette méthode
         */

    }


}
