import java.util.Scanner; //imports a plug in which lets the program ask the user a question
public class TriangleCC {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;

        Scanner sc = new Scanner(System.in); //tels the plugin prepare and create a new scanner
        System.out.println("enter side 1"); //asks the user to enter a number
        side1 = sc.nextInt();
        System.out.println(" enter side 2"); //asks the user to enter a number
        side2 = sc.nextInt();
        System.out.println(" enter side 3"); //asks the user to enter a number
        side3 = sc.nextInt();

        int sidesum = side1+side2+side3;
if(sidesum !=180)
{
    System.out.println("INVALID");
    return;
}
if(side1==60){
    if (side2==60){
        if(side3==60){
            System.out.println("equilateral");
            return;
        }
    }

        }
if(side1==side2){
    System.out.println("Isocelises");
}
if(side3==side2){
            System.out.println("Isocelises");
        }
        if(side1==side3){
            System.out.println("Isocelises");
        }



    }


    }
