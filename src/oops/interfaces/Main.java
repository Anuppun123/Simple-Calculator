package oops.interfaces;

public class Main implements Animal {
    public static void main(String[] args) {
        Main sound = new Main();
        sound.animalSound();

        // Main running = new Main();

        sound.run();

    }


    public void animalSound(){
        System.out.println("Singing");
    }
    public void run(){
        System.out.println("Running");
    }




}
