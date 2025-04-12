import java.util.Scanner;


public class MyFirstCalculator {
    public static void main(String[] args){
        // System.out.println(addition(2,8));
        // System.out.println(substraction(2,8));
        // System.out.println(multiply(2,8));
        // System.out.println(divide(20,7));
        
        Scanner input = new Scanner(System.in); // Create scanner object

        //1. create object 
        Algorithm algo = new Algorithm();

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        input.close();



        System.out.println("The sum is "+ algo.addition(number1, number2)); // it is from 1. create object
        System.out.println("The substraction is "+ Algorithm.substraction(number1, number2));
        System.out.println("The multiplication is "+ Algorithm.multiply(number1, number2));
        System.out.println("The division is "+ Algorithm.divide(number1, number2));
        System.out.println();

    }
    

}
