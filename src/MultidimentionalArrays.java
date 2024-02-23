import java.util.Scanner;

public class MultidimentionalArrays {
    public static void main(String[] args) {

        int StudentCount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien d'eleves???");
        StudentCount = sc.nextInt();
        String[] names= new String[StudentCount];


        int[] grades=new int[StudentCount];
       for (int i=0;i<(StudentCount);i++)
        //Repeat StudentCount ammount of times:
       {
           System.out.println("donner le Nom de l'eleve " + (i + 1) + ".");
           Scanner NN = new Scanner(System.in);
           names[i] = NN.nextLine();
           System.out.println("Donner le grade de l'eleve "+(i+1)+"." );
           Scanner Ng = new Scanner(System.in);
           grades[i] = Ng.nextInt();


       }
        for (int v=0;v<grades.length;v++)
        {
            System.out.println(names[v]+" a le grade de "+grades[v]);


        }


        }


    }
