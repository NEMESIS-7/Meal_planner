import java.util.*;
import java.time.*;
public class DIETUPDATED1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the time (hh:mm:ss): ");
        String time = input.nextLine();
        Random random = new Random();
            LocalTime time1 = LocalTime.parse(time);
            if (time1.isAfter(LocalTime.MIDNIGHT) && time1.isBefore(LocalTime.NOON)) {
                System.out.println("It's morning. How many breakfast menu items do you have in mind?: ");
                int breakfastmenu = input.nextInt();
                input.nextLine();
                String[] breakfast = new String[breakfastmenu];
                for (int i = 0; i < breakfastmenu; i++) {
                    System.out.println("Enter the breakfast menu item: ");
                    breakfast[i] = input.nextLine();
                }
                int randombreakfast = random.nextInt(breakfastmenu);
                System.out.println("You will be having " + breakfast[randombreakfast] + " for breakfast.");

            } else if (time1.isAfter(LocalTime.NOON) && time1.isBefore(LocalTime.of(18,0))) {
                System.out.println("it's noon. How many lunch menu items do you have in mind?: ");
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
                System.out.println("it's evening. How many supper menu items do you have in mind?: ");
                int suppermenu = input.nextInt();
                input.nextLine();
                String[] supper = new String[suppermenu];
                for (int n = 0; n < suppermenu; n++) {
                    System.out.println("Enter the supper menu item");
                    supper[n] = input.nextLine();
                }
                int randomsupper = random.nextInt(suppermenu);
                System.out.println("You will be having " + supper[randomsupper] + " for supper.");
            }
    }
}
