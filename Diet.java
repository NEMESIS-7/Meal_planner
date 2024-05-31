import java.util.Scanner;
import java.util.Random;

public class Diet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] breakfast = {"OATS", "TEA AND BREAD", "CORN PORRIDGE", "RICE PORRIDGE", "COFFEE", "PANCAKES", "CORN FLAKES", "WAAKYE"};
        String[] lunch = {"RICE AND SOUP", "FRIED YAM", "KENKEY AND FRIED FISH", "DRINK AND BISCUIT", "RICE AND STEW", "FRUIT SALAD" };
        String[] supper = {"BANKU AND OKRO", "FUFU AND LIGHT SOUP", "OMOTUO AND GROUDNUT SOUP"};

        System.out.println("What do you want to take, Breakfast, Lunch or Supper?:" );
        String food = input.next().toLowerCase();
        Random random = new Random();

        switch(food){
            case "breakfast":
                int randombreakfast = new Random().nextInt(breakfast.length);
                System.out.println("you will be having " + breakfast[randombreakfast] + " for breakfast.");
                break;

            case "lunch":
                int randomlunch = new Random().nextInt(lunch.length);
                System.out.println("you will be having " + lunch[randomlunch] + " for lunch.");
                break;

            case "supper":
                int randomsupper = new Random().nextInt(supper.length);
                System.out.println("you will be having " + supper[randomsupper] + " for supper.");
                break;

            default:
                System.out.println("invalid choice, please choose between breakfast lunch or supper.");
        }



    }
}
