package test;

public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Hi, " + i);
            i++;

            String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
            for (String j : cars) {
                System.out.println(j);
            }

        }

    }

}
