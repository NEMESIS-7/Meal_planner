package Meal_Planner;

import java.util.*;
import java.time.*;
public class DIETUPDATED2 {
    public static void main(String[] args) {
        //initializing the scanner object
        Scanner input = new Scanner(System.in);
        //initializing the random object
        Random random = new Random();
        //initializing the time object to return the current time and store to the variable time with methods to prevent the second and nanoseconds from showing
        LocalTime time = LocalTime.now().withSecond(0).withNano(0);
        System.out.println("The time is " + time);
        //initializing the time object to store the time for midnight and noon to the variables midnight and noon
        int hour = time.getHour();

        switch (hour) {
            //morning
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
                randomizer(input, random, "breakfast");
                break;

            //afternoon
            case 12: case 13: case 14: case 15: case 16: case 17:
                randomizer(input, random, "lunch");
                break;
            //evening
            case 18: case 19: case 20: case 21: case 22: case 23:
                randomizer(input, random, "supper");
                break;
            default:
                System.out.println("Invalid input. Try again.");
        }
    }



    //method to handle the menu updating and output of random foods
    public static void randomizer(Scanner input, Random random, String mealtype){
        try {  //handling the event that a user might enter letters instead of digits
            System.out.println("You will be having " + mealtype + ". How many " +  mealtype + " menu items do you have in mind?: ");
            int nummenu = input.nextInt();
            input.nextLine();                               //consuming the newline character

            String[] Menu = new String[nummenu];            //initializing an empty string array
            for (int i = 0; i < Menu.length; i++) {         // updating the array with the menu items
                System.out.println("Enter the menu item");
                Menu[i] = input.nextLine();                 //storing the menu items to the available indexes
            }
            int randomfood = random.nextInt(nummenu);       //initializng a random object to generate random numbers bound to the nummber of menu items
            System.out.println("You will be having " + Menu[randomfood] + " for supper.");

        } catch (Exception e) {
            System.out.println("enter digits only");
        }
    }
}
