package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        

        //create animal object
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Dog myDog = new Dog();


        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}
