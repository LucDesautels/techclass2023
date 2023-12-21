import java.util.Scanner;

public class quadrantselection {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in); //tels the plugin prepare and create a new scanner
        System.out.println("enter x coordinate"); //asks the user to enter a number
        x = sc.nextInt();
        System.out.println("enter y coordinate"); //asks the user to enter a number
        y = sc.nextInt();
if(x==0){
    System.out.println("INVALID");
    return;
}
if(y==0){
    System.out.println("INVALID");
    return;
}
        if(x>0){
            if(y>0){
                System.out.println("1");
            }else {
                System.out.println("4");
            }
        }else{
            if(y>0){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }

    }
}
