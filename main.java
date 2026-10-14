
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("welcome to my calculator program");
        Scanner input = new Scanner(System.in);

        while (true) { // Doing this the program kept quitting after doing one operation so i thought of
            // using a while loop just to keep the program running until the user decides to quit



            System.out.println("Enter your first number or typr Q to quit: ");
            String firstNumber = input.next();


            if (firstNumber.equals("Q") || firstNumber.equals("q")) {
                System.out.println("Exiting the program.");
                break;
            }

           double firstValue = Double.parseDouble(firstNumber); // this line of code converts the string input to a double value 
           // so that we can perform mathematical operations on it
           

            System.out.println("Enter your second number: ");
            double secondNumber = input.nextDouble();

            //  String firstInput = input.next();

            

            //   ***** TRYING BASIC OPERATIONS ****** 
            //System.out.println("Addition = " + (firstNumber + secondNumber));
            // System.out.println("Subtraction = " + (firstNumber - secondNumber));
            //System.out.println("Multiplication = " + (firstNumber * secondNumber));
            //System.out.println("Division = " + (firstNumber / secondNumber));



            System.out.println("choose an operation +, -, *, /");
            String operation = input.next();

            //.EQUALS() METHOD IS USED TO COMPARE STRINGS
            if (operation.equals("+")) {
                System.out.println("Addition:  " + (firstValue + secondNumber));
            } else if (operation.equals("-")) {
                System.out.println("subtraction:  " + (firstValue - secondNumber));
            } else if (operation.equals("*")) {
                System.out.println("multiplication:  " + (firstValue * secondNumber));
            }
            if (secondNumber == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else if (operation.equals("/")) {
                System.out.println("division:  " + (firstValue / secondNumber));
            }
             
           
        }
        //input.close();

    }
}