/*
 Samantha McCormick
 CSC240 Java Programming
*/

package assignment1;

import java.util.*;

public class JavaConversionCalculator {

  public static void main(String[] args) {

    // The program starts by displaying, “Welcome to the Java Conversion Calculator.”
    System.out.println("Welcome to the Java Conversion Calculator.");

    // The program then outputs to the user the purpose of the program (converting feet to meters).
    System.out.println("This program will convert feet into meters.");

    // The program prompts for and accepts input from the user for the number of feet to be
    // converted.
    System.out.print("Enter the number of feet: ");

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    double feet = input.nextDouble();

    // The program will calculate the metric equivalent, in meters, of the user’s input.
    // (Use the formula meters = feet / 3.2808)
    final double CONVERSIONRATE = 3.2808;
    double meters = feet / CONVERSIONRATE;

    // Then, the program will output the result to the screen.
    System.out.println("The metric equivalent of " + feet + " feet is " + meters + " meters.");

    // Finally, the program will say goodbye to the user and terminate.
    System.out.println("Goodbye!");
  }

}
