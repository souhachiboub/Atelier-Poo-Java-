package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habit;


    public Aquatic(String familly, String name, int age, boolean isMammal,String habit) {
        super(familly, name, age,isMammal);
        this.habit = habit;

    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public String toString() {
        return "Aquatic [habitat=" + habit + "]";
    }
}
