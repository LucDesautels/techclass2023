/*
Luc Desautels
On the original code it would crate an integer which would limmit it to whole numbers
*/

import java.util.Scanner; //imports a plug in which lets the program ask the user a question

public class Version2 {                     //What happens when you click the start button
    public static void main(String[] args) { //What happens when you click the start button
        Scanner sc = new Scanner(System.in); //tels the plugin prepare and create a new scanner
        double a; //create an variable called a
        System.out.println("please enter a number"); //asks the user to enter a number
        a = sc.nextDouble(); //sets variable 'a' to the next thing the user types

        if(a>0 && a<10){ //if a is bigger than 0 and smaller than 10,
            System.out.println("Rouge"); //reply with "red"

        } else if (a>10 && a<20) { //if a is bigger than 10 and smaller than 20,
            System.out.println("Bleu"); //reply with "blue"

        }  else if (a>20 && a<30) { //if a is bigger than 20 and smaller than 30,
            System.out.println("Vert");//reply with "blue"

        } else{                             //otherwise,
            System.out.println("invalide");//say invalid
        }
    }
}
//program ends