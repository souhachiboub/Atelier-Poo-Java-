package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;



    public Dolphin(String familly, String name, int age, boolean isMammal,String habit, float swimmingSpeed) {
        super(familly, name, age,isMammal,habit);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin [habitat=" + super.habit + ", swimmingSpeed=" + swimmingSpeed + "]";
    }
}
