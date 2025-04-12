package test;
import java.util.Scanner;

import calculator.Algorithm;
import calculator.MyFirstCalculator;



public class RunCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create scanner object

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        input.close();

            System.out.println("Sum is; "+ Algorithm.addition(number1, number2));
    }
}
