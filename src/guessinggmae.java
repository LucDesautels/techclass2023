import java.util.Scanner;

public class guessinggmae {
    public static void main(String[] args) {
        // Generate a random integer between 1 (inclusive) and 100 (exclusive)
        int randomInteger = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("please enter a number"); //asks the user to enter a number
       while(1==1) {
           a = sc.nextDouble(); //sets variable 'a' to the next thing the user types
           if (a == randomInteger) {
               System.out.println("You Won! The number was "+randomInteger);
               return;
           } else if (a > randomInteger) {
               System.out.println("Lower");
           } else if (a < randomInteger) {
               System.out.println("Higher");
           }
           System.out.println("enter a new number");
       }

    }
}
