import java.util.Scanner;

public class exemple2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("please enter first number");
        a = sc.nextInt();
        int b;
        System.out.println("please enter second number");
        b = sc.nextInt();
        int c;
        if (a>b){
            c=a-b;

        }else{
            c=b-a;
        }
        System.out.println(c);
    }
    }
