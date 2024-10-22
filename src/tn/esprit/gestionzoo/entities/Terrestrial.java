package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;

    public Terrestrial(String familly, String name, int age, boolean isMammal,int nbrLegs) {
        super(familly,name,age,isMammal);
        this.nbrLegs = nbrLegs;
    }


}
