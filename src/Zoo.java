public class Zoo {

    Animal [] animals;
    String name;
    String city;
   final int nbrCages;

    public Zoo(String name, String city) {
        this.animals=new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages=25;

    }

    public void displayZoo() {
        System.out.println("Name of the Zoo: " + name + ", The City of the Zoo : " + city + ", Number  of cages : " + nbrCages);
    }

    public Boolean addAnimal(Animal animal) {

        for (Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.name.equals(animal.name)) {
                System.out.println("Animal  " + animal.name + " is already exist in the Zoo.");
                return false;
            }
        }


        int index = 0;
        for (Animal existingAnimal : animals) {
            if (existingAnimal == null) {
                animals[index] = animal;
                return true;
            }
            index++;
        }

        System.out.println("The Zoo is full.");
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            System.out.println("Animal " + animal.name + " removed from the Zoo.");
            return true;
        } else {
            System.out.println("Animal " + animal.name + " not found in the Zoo.");
            return false;
        }
    }

    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) {
                return false;
            }
        }
        return true;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int z1Count = 0, z2Count = 0;
        for (Animal animal : z1.animals) {
            if (animal != null) z1Count++;
        }
        for (Animal animal : z2.animals) {
            if (animal != null) z2Count++;
        }

        return z1Count >= z2Count ? z1 : z2;
    }
    public void displayAnimalsInfo() {
        System.out.println("Animals in Zoo are :");
        boolean vide = true;
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.name);
                vide = false;
            }
        }
        if (vide) {
            System.out.println("No animals found in the Zoo.");
        }
    }
}
