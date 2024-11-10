package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal [] animals;
    private String name;
    private String city;
   private final int nbrCages;
    private int currentAquaticCount=0;

   private Aquatic []aquaticAnimals;

    public Zoo(String name, String city) {
        this.animals=new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages=25;
        this.aquaticAnimals=new Aquatic[10];

    }

    public void displayZoo() {
        System.out.println("Name of the tn.esprit.gestionzoo.entities.Zoo: " + name + ", The City of the tn.esprit.gestionzoo.entities.Zoo : " + city + ", Number  of cages : " + nbrCages);
    }

    public Boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("The tn.esprit.gestionzoo.entities.Zoo is full. Cannot add more animals.");
            return false;
        }
        for (Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.getName().equals(animal.getName())) {
                System.out.println("tn.esprit.gestionzoo.entities.Animal  " + animal.getName() + " is already exist in the tn.esprit.gestionzoo.entities.Zoo.");
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


        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " removed from the tn.esprit.gestionzoo.entities.Zoo.");
            return true;
        } else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " not found in the tn.esprit.gestionzoo.entities.Zoo.");
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
        System.out.println("Animals in tn.esprit.gestionzoo.entities.Zoo are :");
        boolean vide = true;
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getName());
                vide = false;
            }
        }
        if (vide) {
            System.out.println("No animals found in the tn.esprit.gestionzoo.entities.Zoo.");
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo name cannot be empty. Setting default name.");
            this.name = "Unnamed tn.esprit.gestionzoo.entities.Zoo";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void addAquaticAnimal(Aquatic aquatic) {

        if (currentAquaticCount < aquaticAnimals.length) {
            aquaticAnimals[currentAquaticCount] = aquatic;
            currentAquaticCount++;
            System.out.println("Ajouté un animal aquatique : " + aquatic.toString());
        } else {
            System.out.println("Impossible d'ajouter un animal aquatique, le tableau est plein.");
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.swimmingDepth > maxDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;


        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }



}
