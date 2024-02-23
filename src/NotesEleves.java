import java.util.Scanner;
public class NotesEleves {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
System.out.println("entrer le nombre d'eleves");
        int taille=sc.nextInt();
        String []noms=new String[taille];
        int [] notes=new int[taille];
            for(int i=0; i<taille;i++){
                System.out.println("nom de le eleve "+ i+1);
                noms[i]=sc.nextLine();

            }

    }
}
