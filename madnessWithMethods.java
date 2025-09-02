import java.util.Scanner;

public class madnessWithMethods {
    public static void main(String[] args) {

        int num1;
        int num2;// creates values
        String name;

        Scanner scanner = new Scanner(System.in);//creates the detection system
        System.out.print("Enter first number: ");//prompts the user
        num1 = scanner.nextInt();//detects the input
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        scanner.nextLine();

    // calls the method
       int num3 = add(num1,num2);// argument
        System.out.print("sum of num1 and num2 is: " + num3);


        System.out.print("\nEnter your name  : ");
        name = scanner.nextLine();
        String statement = hello(name);
        System.out.print(statement);
    }




    //parameters must match argument
    static int add(int num1,int num2) {
        int num3 = num1 + num2 ;
        return num3;
    }

    static String hello(String name) {
        String statement = "Hello there " + name;
        return statement;
    }

}