package tn.esprit.gestionzoo.entities;

@FunctionalInterface
public interface Carnivore<T> {
    void eatMeat(T meat);

}
