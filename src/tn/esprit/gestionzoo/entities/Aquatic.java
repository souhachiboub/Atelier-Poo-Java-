package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected String habit;


    public Aquatic(String familly, String name, int age, boolean isMammal,String habit) {
        super(familly, name, age,isMammal);
        this.habit = habit;

    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habit + "]";
    }

    public abstract void  swim();

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }


        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        Aquatic aquatic = (Aquatic) obj;


        return super.getAge() == aquatic.getAge() &&
                Objects.equals(super.getName(), aquatic.getName()) &&
                Objects.equals(habit, aquatic.habit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habit,super.getName(),super.getAge());
    }
}
