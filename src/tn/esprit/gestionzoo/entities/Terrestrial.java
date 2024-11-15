package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    protected int nbrLegs;

    public Terrestrial(String familly, String name, int age, boolean isMammal,int nbrLegs) {
        super(familly,name,age,isMammal);
        this.nbrLegs = nbrLegs;
    }


    @Override
    public void eatPlantAndMeet(Food food) {
        if(food==Food.BOTH){
            System.out.println(super.getName()+"est un omnivore");
        }
    }
}
