import java.util.Scanner;

public class MyFirstCalculator {
    public static void main(String[] args){
        // System.out.println(addition(2,8));
        // System.out.println(substraction(2,8));
        // System.out.println(multiply(2,8));
        // System.out.println(divide(20,7));
        
        Scanner input = new Scanner(System.in); // Create scanner object

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("The sum is "+ addition(number1, number2));
        System.out.println("The substraction is "+ substraction(number1, number2));
        System.out.println("The multiplication is "+ multiply(number1, number2));
        System.out.println("The division is "+ divide(number1, number2));

    }
    public static int addition(int a, int b){
       int sum = a + b;
        return sum;
    }
    public static int substraction(int a, int b){
        int sub = a - b ;
        return sub;
    }
    public static int multiply(int a, int b){
        int mult = a * b;
        return mult;
    }
    public static int divide(int a, int b){
        int div = a/b;
        return div;
    }

}
