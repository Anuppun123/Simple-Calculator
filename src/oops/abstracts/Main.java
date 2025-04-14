package oops.abstracts;

public class Main extends Animal {
    public static void main(String[] args) {
        Main main = new Main();
        main.sleep();
        main.animalSound();
        
    }
    public void animalSound(){
        System.out.println("Animal Sound");
    }

}
