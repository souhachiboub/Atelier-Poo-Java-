package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public Penguin(String familly, String name, int age, boolean isMammal,String habit, float swimmingDepth) {
        super(familly, name, age,isMammal,habit);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin [habitat=" + habit + ", swimmingDepth=" + swimmingDepth + "]";
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }
}
