
/* Write a program that asks the user to input their age as an integer number.
The program then tells the user:
        - In what age category they fall (children: 14 years or under, youth: 15-24 years, adults: 25-64 years, seniors: 65 or more years),
        - Whether they are legally allowed to drink beer (Denmark: 16 or over),
        - And if they are not allowed to drink beer, how many years they have to wait (e.g., a 14year old would need to wait 2 years).
*/

/* Scanner is a class that provides methods for inputting words, numbers, and other data.
Scanner is provided by java.util, which is a package that contains various “utility classes”.
Before you can use Scanner, you have to import it like this: */
import java.util.Scanner;


public class AgeAnalyzer {

    public static void main(String[] args) {
        int age;                                //declare variable 'age' which has the type integer
        Scanner in = new Scanner(System.in);    //We need to initialize (assign a variable for the first time) the Scanner, here we declare a Scanner variable names 'in' and create a Scanner that reads input from System.in
        System.out.print("How old are you?");   //When we run the program, the question will be printet out "How old are you"

        age = in.nextInt();     //The Scanner class provides a method called 'nextLine' that reads a line of input from the keyboard and returns a String.

        System.out.print("You are " + age + "!");   //Print out the age the user has written.

        //If statements that print out which category the user is in

        if (age <= 14) {        //If statement that tells if the age is less than or equal to 14...
           System.out.println(" You are a child");      //Print out "You are a child"
        } else if (age <= 24) {
            System.out.println(" You are young");
        } else if (age <= 64) {
            System.out.println(" You are an adult");
        } else {
            System.out.println(" You are a senior");
            
        }

        //If-statements if they are or not are allowed to drink beer

        if (age > 16) {     //if the user is above 16 then print:
             System.out.println("You are allowed to drink beer");
        } else {            //If they are not above 16, print:
            System.out.println("You are not legally allowed to drink beer");
            System.out.println("You have to wait " + (16-age) + " years!");     //print statement, how many years the user has to wait til they can drink beer.
        }
    }
}