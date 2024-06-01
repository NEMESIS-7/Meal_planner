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

        switch(hour) {
            //morning
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
            System.out.println("It's morning. How many breakfast menu items do you have in mind?: ");
            try {
                //storing the number of breakfast items the user wants; this will be used as the length of the string array storing the breakfast menu items
                int breakfastmenu = input.nextInt();
                //consuming the newline character to prevent problems when input.nextLine() is called
                input.nextLine();
                //initializing a string array to store the breakfast menu items; the length is determined by the number in the variable breakfast menu
                String[] breakfast = new String[breakfastmenu];
                //for loop to iterate through the indexes in the array, storing the breakfast menu items
                for (int i = 0; i < breakfastmenu; i++) {
                    System.out.println("Enter the breakfast menu item: ");
                    breakfast[i] = input.nextLine();
                }
                //initializing the random object to return a random integer bound to the integer value in the variable breakfast menu; the random integer will be used to reference a random index in the array
                int randombreakfast = random.nextInt(breakfastmenu);
                //printing the breakfast item with the randomly generated index
                System.out.println("You will be having " + breakfast[randombreakfast] + " for breakfast.");
                break;
            }
            catch (Exception e) {
                System.out.println("enter digits only");
            }
            //afternoon
            case 12: case 13: case 14: case 15: case 16: case 17: case 18:
            System.out.println("it's noon. How many lunch menu items do you have in mind?: ");
            try {
                int lunchmenu = input.nextInt();
                input.nextLine();
                String[] lunch = new String[lunchmenu];
                for (int m = 0; m < lunchmenu; m++) {
                    System.out.println("Enter the lunch menu item: ");
                    lunch[m] = input.nextLine();
                }
                int randomlunch = random.nextInt(lunchmenu);
                System.out.println("You will be having " + lunch[randomlunch] + " for lunch.");
            }
            catch (Exception e) {
                System.out.println("enter digits only");
            }
            //evening
            case 19: case 20: case 21: case 22: case 23:
            System.out.println("it's evening. How many supper menu items do you have in mind?: ");
            try {
                int suppermenu = input.nextInt();
                input.nextLine();
                String[] supper = new String[suppermenu];
                for (int n = 0; n < suppermenu; n++) {
                    System.out.println("Enter the supper menu item");
                    supper[n] = input.nextLine();
                }
                int randomsupper = random.nextInt(suppermenu);
                System.out.println("You will be having " + supper[randomsupper] + " for supper.");
                break;
            }
            catch (Exception e) {
                System.out.println("enter digits only");
            }
            default:
                System.out.println("invalid input");
        }
    }
}