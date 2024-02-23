import java.util.Scanner;
public class notesFeb23 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Nombre d'eleves");
        int nb=sc.nextInt();
        int [] notes=new int[nb];
        String [] noms=new String[nb];
        int []mention = new int[4];
        int[]limsup= {100,90,80,70};
        int[]liminf={90,80,70,0};

        String []men={"Excellent","Tres Bien","Assez bien","Mediocre"};

        for(int i=0;i<nb;i++)
        {
            System.out.println("nom de l'eleve "+(i+1)+" sa note");
            noms[i]=sc.next();
            notes[i]=sc.nextInt();
            if (notes[i]>=90){
                mention[0]++;//excelelnt
            }
            else if(notes[i]>=80){
                mention[1]++;//tres bien
            }
            else if(notes[i]>=70){
                mention[2]++; //assez bien
            }
            else{
                mention[2]++;//mediocre
            }
        }
        /*
        IMPUP ^^^

        affichage VVV
         */
        for(int m=0;m<4;m++){
            if(mention[m]>0){
                System.out.println(men[m]+" (" + mention[m]+ ")");
                for(int i=0;i<nb;i++){
                    if((notes[i]<limsup[m])&&(notes[i]>=liminf[m])){
                        System.out.printf("%-10s",noms[i]);
                        System.out.printf("%d",notes[i]);
                        System.out.println("%");
                    }
                }
            }
        }
        sc.close();
    }
}
