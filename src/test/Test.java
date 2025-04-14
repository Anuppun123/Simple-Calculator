package test;

public class Test {
    public static void main(String[] args) {
        OuterClass rollno = new OuterClass();

        System.out.println(rollno.rollNumber);

        OuterClass.InnerClass rollno2 = rollno.new InnerClass();
        System.out.println(rollno2.rollNumber2);
    }

}
