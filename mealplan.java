import java.time.*;
import java.util.*;

public class mealplan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        LocalTime time = LocalTime.now(); // replace with your time variable
        System.out.println(time.withSecond(0).withNano(0));
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime noon = LocalTime.NOON;

        if (time.isAfter(midnight) && time.isBefore(noon)) {
            System.out.println("It's morning. How many breakfast menu items do you have in mind? (enter an integer value): ");
            if (input)
            if (input.hasNextInt()) {
                int breakfastmenu = input.nextInt();
                input.nextLine();
                String[] breakfast = new String[breakfastmenu];
                for (int i = 0; i < breakfastmenu; i++) {
                    System.out.println("Enter the breakfast menu item: ");
                    breakfast[i] = input.nextLine();
                }
                int randombreakfast = random.nextInt(breakfastmenu);
                System.out.println("You will be having " + breakfast[randombreakfast] + " for breakfast.");
            } else {
                System.out.println("The input does not contain only integer values.");
            }
        } else if (time.isAfter(noon) && time.isBefore(LocalTime.of(18,0))) {
            System.out.println("it's afternoon. How many lunch menu items do you have in mind?: ");

            if (input.hasNextInt()) {
                int lunchmenu = input.nextInt();
                input.nextLine();
                String[] lunch = new String[lunchmenu];
                for (int m = 0; m < lunchmenu; m++) {
                    System.out.println("Enter the lunch menu item: ");
                    lunch[m] = input.nextLine();
                }
                int randomlunch = random.nextInt(lunchmenu);
                System.out.println("You will be having " + lunch[randomlunch] + " for lunch.");
            } else {
                System.out.println("The input does not contain only integer values.");
            }
        } else {
            System.out.println("it's evening. How many suooer menu items do you have in mind?: ");
            if (input.hasNextInt()) {
                int suppermenu = input.nextInt();
                input.nextLine();
                String[] supper = new String[suppermenu];
                for (int m = 0; m < suppermenu; m++) {
                    System.out.println("Enter the supper menu item: ");
                    supper[m] = input.nextLine();
                }
                int randomlunch = random.nextInt(suppermenu);
                System.out.println("You will be having " + supper[randomlunch] + " for lunch.");
                // handle other cases
            }
        }
    }
}
