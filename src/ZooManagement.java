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
    }


}
