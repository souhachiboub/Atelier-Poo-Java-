package tn.esprit.gestionzoo.entities;

@FunctionalInterface
public interface Herbivore<T>{
    void eatPlant (T plant);
}
