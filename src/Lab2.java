import com.sun.org.apache.xpath.internal.SourceTree;

import java.util. Scanner;
/**
 * Created by wilsonnorman on 2/1/2017.
 */
public class Lab2 {
    //The app prompts the user to enter an intger between 1 and 100
    // Display the associated result based on the range entered
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

       int userInput = 0;
       String answer = "yes";

       while(answer.equals("yes")) {
            System.out.println("Please enter a number from 1 to 100");
            userInput = scan.nextInt();

            if ((userInput % 2 != 0) && (userInput < 60)) {
                System.out.println("Odd");
            } else if ((userInput % 2 == 0) && (userInput >= 2) && (userInput <= 25)) {
                System.out.println("Even and less than 25 ");
            } else if ((userInput % 2 == 0) && (userInput >= 26) && (userInput <= 60)) {
                System.out.println("Even");

            } else if ((userInput % 2 == 0) && (userInput > 60)) {
                System.out.println(userInput + " And Even");
            } else if ((userInput % 2 != 0) && (userInput > 60)) {
                System.out.println(userInput + " And Odd");
            }

           System.out.println("next");
        }




        }
}