import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("please enter a number");
        a = sc.nextInt();
        if (0 > a) {
            System.out.println("invalide");
        }
        if (0 == a) {
            System.out.println("invalide");
        }
        if (10 == a) {
            System.out.println("invalide");
        }
        if (20 == a) {
            System.out.println("invalide");
        }
        if (30 == a) {
            System.out.println("invalide");
        }
        if (30 < a) {
            System.out.println("invalide");
        }

        if (a < 10) {
            System.out.println("bleu");
        }
        if (a > 10) {
            if (a < 20) {
                System.out.println("rouge");

            }
            System.out.println("vert");

        }


    }

}