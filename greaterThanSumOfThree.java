//SumOfUserNums.java
//AJJ 8/19/25
// resources https://www.w3schools.com/java/java_user_input.asp


// Get inputs from user and output the sum of inputs

import java.util.Objects;
import java.util.Scanner;

public class greaterThanSumOfThree {
    public static void main(String[] args) {

        int num1 = 1;//input1
        int num2 = 2;//input2
        int num3 = 3;//input3
        int sum;//sum of 3
        String yes;//user choice of function


//input 1st value
        Scanner scanner = new Scanner(System.in);     //create the scanner
        System.out.println("\n Enter Num1 value: ");  // prompt the user
        num1 = scanner.nextInt();                     // collects int from user and overwrites inital variable
        System.out.println("\n num 1 is: " + num1);   // returns the value to the user


//input 2nd value
        System.out.println("\n Enter Num2 value: ");
        num2 = scanner.nextInt();
        System.out.println("\n num 2 is: " + num2);


//input 3rd value
        System.out.println("\n Enter Num3 value: ");
        num3 = scanner.nextInt();
        System.out.println("\n num 3 is: " + num3);


//largest of all three
    //detects user choice
        System.out.println("Do you wish to get the largest value");
        yes = scanner.next();
    //runs function
        if (Objects.equals(yes, "yes")) {
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("\n The Largest Value is Num1 at: " + num1);
                } else {
                    System.out.println("\n The Largest Value is Num3 at: " + num3);
                }
            } else if (num2 > num3) {
                System.out.println("\n The Largest Value is Num2 at: " + num2);
            } else {
                System.out.println("\n The Largest Value is Num 3 at: " + num3);
            }
        }


//Sum of all three
    //detects user choice
        System.out.println("Do you wish to get the largest value");
        yes = scanner.next();
    //runs function
        if (Objects.equals(yes, "yes")) {
            sum = num1 + num2 + num3;
            System.out.println("\n The sum of all three is: " + sum);
        }

    }
}