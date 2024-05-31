import java.util.Scanner;
import java.util.Random;
public class DIETUPDATED {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What do you want to take, breakfast, lunch or supper?: " );
        //storing and converting user choice to lowercase to prevent issues
        String food = input.next().toLowerCase();
        //consuming the newline character left in the input buffer to prevent issues
        input.nextLine();
        //instance of the random class to generate random integers
        Random random = new Random();

        switch(food){
            //handling the first case where the user wants to have breakfast
            case "breakfast":
                System.out.print("How many breakfast menu items do you have in mind?: ");
                //read the integer input from the user and stores it to the variable breakfastmenu
                int breakfastmenu = input.nextInt();
                //consuming the newline character in the input buffer
                input.nextLine();
                //initializing a string array whose length is determined by the integer value in the breakfastmenu variable
                String[] breakfast = new String[breakfastmenu];
                //for loop to assign string values, ie the breakfast items the user wants to the indexes in the array
                for (int i = 0; i < breakfastmenu; i++ ){
                    System.out.println("Enter the breakfast menu item: ");
                    breakfast[i] = input.nextLine();
                }
                //selecting a random index from the array and printing the value contained in it
                int randombreakfast = random.nextInt(breakfastmenu);
                System.out.println("You will be having " + breakfast[randombreakfast] + " for breakfast.");
                break;

            case "lunch":
                System.out.print("How many lunch menu items do you have in mind?: ");
                //reading the integer input from the user and storing it to the variable lunchmenu
                int lunchmenu = input.nextInt();
                //consuming the newline character
                input.nextLine();
                //initializing a string array whose length is determined by the integer value in lunchmenu
                String[] lunch = new String[lunchmenu];
                //for loop to iterate through indexes in the array and assing a string value to each
                for (int m = 0; m < lunchmenu; m++){
                    System.out.println("Enter the lunch menu item: ");
                    lunch[m] = input.nextLine();
                }
                //generating a random index from the array and printing the string value in that index
                int randomlunch = random.nextInt(lunchmenu);
                System.out.println("You will be having " + lunch[randomlunch] + " for lunch.");
                break;

            case "supper":
                System.out.print("How many supper menu items do you have in mind?: ");
                //reading the integer value in the input buffer and storing it to the variable suppermenu
                int suppermenu = input.nextInt();
                //consuming the newline character
                input.nextLine();
                //initializing a string array to store the lunchmenu items chosen by the user; the length of the array is determined by the integer value in the lunchmenu variable
                String[] supper = new String[suppermenu];
                //for loop to iterate through the indexes in the array and assign an input string vallue to each
                for (int n = 0; n < suppermenu; n++){
                    System.out.println("Enter the supper menu item" );
                    supper[n] = input.nextLine();
                }
                //generating a random index from the array and printing the string value stored in that array
                int randomsupper = random.nextInt(suppermenu);
                System.out.println("You will be having " + supper[randomsupper] + " for supper.");
                break;
            //handling the event where the user does not enter any of the given options
            default:
                System.out.println("invalid choice, please choose between Breakfast, Lunch or Supper.");
        }
    }
}
