package test;

public class Array {
    public static void main(String[] args) {
        // String[] names = {"Sandip", "Nabin", "Anup", "Sam"};

        // Create object
        String[] names = new String[5];
        names[0] = "Sandip";
        names[1] = "Anup";
        names[2] = "Hari";
        names[3] = "Nabin";
        names[4] = "Sam";

        for (String i : names) {
            System.out.println(i);
        }
    }

}
