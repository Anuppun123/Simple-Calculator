package test;

public class Overloading {
    public static void main(String[] args) {
        
        Overloading overload = new Overloading();
        System.out.println("The sum is: "+ overload.add(4, 7, 6));
    }

    int add(int a, int b) {
        int e = a + b;
        return e;
    }
    
    int add(int a, int b, int c) {
        int d = a + b +c;
        return d;
}

}
