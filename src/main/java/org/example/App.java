package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int gender = 0;
        int consumedAlcoholOunces = 0;
        int weightInPounds = 0;
        int hoursSinceLastDrink = 0;
        double alcoholDistributionRatio = 0.66;
        double bloodAlcoholContent;
        boolean isNumeric = false;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter a 1 if you are a male or a 2 if you are a female: " );
        while(isNumeric == false) {
            try {
                gender = Integer.parseInt(input.next());
                isNumeric = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Numbers only please.");
                isNumeric = false;
            }
        }
        isNumeric = false;
        if(gender == 1) alcoholDistributionRatio = 0.73;
        System.out.print( "How many ounces of alcohol did you have? " );
        while(!isNumeric) {
            try {
                consumedAlcoholOunces = Integer.parseInt(input.next());
                isNumeric = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Numbers only please.");
                isNumeric = false;
            }
        }
        isNumeric = false;
        System.out.print( "What is your weight in pounds? " );
        isNumeric = false;
        while(!isNumeric) {
            try {
                weightInPounds = Integer.parseInt(input.next());
                isNumeric = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Numbers only please.");
                isNumeric = false;
            }
        }
        System.out.print( "How many hours has it been since your last drink? " );
        isNumeric = false;
        while(!isNumeric) {
            try {
                hoursSinceLastDrink = Integer.parseInt(input.next());
                isNumeric = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Numbers only please.");
                isNumeric = false;
            }
        }
        bloodAlcoholContent = (consumedAlcoholOunces * 5.14 / weightInPounds * alcoholDistributionRatio)
                - 0.015 * hoursSinceLastDrink;
        System.out.println("Your BAC is: " + bloodAlcoholContent);
        if(bloodAlcoholContent < 0.08)
            System.out.println("It is legal for you to drive");
        else
            System.out.println("It is illegal for you to drive");
    }
}
