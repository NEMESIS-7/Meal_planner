import java.time.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //instantiating a scanner object to take input
        Random random = new Random();               //instantiating a random object to generate random numbers
        LocalTime time = LocalTime.now();           //instantiating a time object to return the current time
        System.out.println("The time is: " + time.withSecond(0).withNano(0));     //printing the current time
        LocalTime midnight = LocalTime.MIDNIGHT;       //using the midnight method from the time class to store midnight to the variable midnight
        LocalTime noon = LocalTime.NOON;                //using the noon method from the time class to store noon to the variable noon

        if (time.isAfter(midnight) && time.isBefore(noon)) {        //checking if time is between midnight and noon, in which case the time is assumed to be morning
            System.out.println("It's morning. How many breakfast menu items do you have in mind? (enter an integer value): ");
                randomizer(input, random, "breakfast");    //passing the parameters to the randomizer variable
        } else if (time.isAfter(noon) && time.isBefore(LocalTime.of(18, 0))) {      //checking if time is between noon and 18:00, in which case the time is assumed to be afternoon
            System.out.println("it's afternoon. How many lunch menu items do you have in mind?: ");
                randomizer(input, random, "lunch");         //passing the parameters to the randomizer variable
        } else {                                                     // if all conditions are not satisfied, the time is assumed to be evening
            System.out.println("it's evening. How many supper menu items do you have in mind?: ");
            randomizer(input, random, "supper");            //passing the parameters to the randomizer variable
        }
    }


    public static void randomizer(Scanner input, Random random, String mealType) {          //method to perform the randomization;suggestions
if (input.hasNextInt()) {                                                           //continues only if user input has only integers, handling the event that a user might enter letter instead of digits
            int Menu = input.nextInt();                     //storing user input to the variable Menu
            input.nextLine();                               //consuming the newline character
            String[] menu = new String[Menu];               //initializing an empty string array whose length is determined by the value in Menu
            for (int i = 0; i < Menu; i++) {                //for loop storing to each index of the array
                System.out.println("Enter the menu menu item: ");
                menu[i] = input.nextLine();
            }
            int randomMenu = random.nextInt(Menu);           //generating a random number which will further serve as a random index
            System.out.println("You should have " + menu[randomMenu] + " for " + mealType + '.');   //printing the suggestion
        } else {                                             //in the event that input contains letters
            System.out.println("The input does not contain only integer values; enter only integer values.");
        }
    }
}

