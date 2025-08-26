// stringsModule2
// AJones 8/26/25

import java.util.Objects;
import java.util.Scanner;

public class stringModule2 {
    public static void main(String[] args) {


//create variables
    String input1;//statement 1
    String input2;//statement2
    String combine1;//combined statements
    String yes;//user input to run functions
    int indexget;//user input to retrieve index #
    int indexstart;//user input to retrieve index #
    int indexend;//user input to retrieve index #


//retrieve statement 1
        Scanner input = new Scanner(System.in);
    System.out.println("\n please enter a statement");
    input1 = input.nextLine();
    System.out.println("\n Inputted statement is: " + input1);
    System.out.println("\n statement Size: " + input1.length());


//retrieve statement 2
    System.out.println("\n please enter a statement");
    input2 = input.nextLine();
    System.out.println("\n Inputted statement is: " + input2);
    System.out.println("\n statement Size: " + input2.length());


//Combine statements
    combine1 = input1 + input2;
    System.out.println("Your combined statement is: " + combine1);
    System.out.println("\n statement Size: " + combine1.length());


//Get index
    //detects if user wants to run this function
        System.out.println("\n Do you wish to get an index");
        yes = input.nextLine();

    //function to run
        if (Objects.equals(yes, "yes")) {
            System.out.println("\n please enter an index number");
            indexget = input.nextInt();
            input.nextLine(); // Common scanner issue, consumes the buffer line added by scanner use after input.nextInt()
            System.out.println("\n Your combined statement is: " + combine1);
            System.out.println("Your indexed Char is : " + combine1.charAt(indexget));
        }


//reverse the string
    //detects if user wants to run this function
        System.out.println("\n Do you wish to reverse the string");
        yes = input.nextLine();

    //function to run
        if (Objects.equals(yes, "yes")) {
            System.out.println("\n Your combined statement is: " + combine1);
            String reversed = new StringBuilder(combine1).reverse().toString();
            System.out.println("\n Your Reversed statement is: " + reversed);
        }


//get substring
    //detects if user wants to run this function
        System.out.println("\n Do you wish to get a substring");
        yes = input.nextLine();

    //function to run
        if (Objects.equals(yes, "yes")) {
            //get starting index from user
            System.out.println("\n Please enter a beginning index");
            indexstart = input.nextInt();
            //get ending index from user
            System.out.println("\n Please enter a ending index");
            indexend = input.nextInt();
            //output extracted substring
            System.out.println("\n Your combined statement is: " + combine1);
            System.out.println("\n Extracted substring is: " + combine1.substring(indexstart,indexend));
        }


//
    }
}