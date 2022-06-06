package thuc_hanh.animal_interafce.animal;

import thuc_hanh.animal_interafce.interfaces.Edible;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2] ;
        animals[0] = new Chichken();
        animals[1] = new Tiger();
        for (Animal animal: animals) {
            System.out.println("\n"+ animal.makeSound());
            if(animal instanceof Chichken){
                Edible edible =(Chichken)animal;
                System.out.println("------\n"+edible.howtoEat());
            }
        }
    }
}
