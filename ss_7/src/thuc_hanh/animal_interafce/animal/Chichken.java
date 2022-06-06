package thuc_hanh.animal_interafce.animal;

import thuc_hanh.animal_interafce.interfaces.Edible;

public class Chichken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck_Cluck!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
