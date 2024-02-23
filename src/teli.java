import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class teli {
    public static void main(String[] args) {
        int tall=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("How tall?");
        tall=sc.nextInt();
        System.out.println();
        /*        set counter to 1

        Repeat untill counter = tall{
        Repeat counter ammount of times:
        sout *
        counter = counter +11;

        :
         */
        System.out.println("What char?");

        String a="a";
        Scanner ee=new Scanner(System.in);
        a=ee.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        if(tall<=1){
    System.out.println(a);
    return;
}

        for(int s=0;s<tall;s++)
        {//repeat x times:

            for(int c=0; c<=s;c++){
                System.out.print(a);

            }
            System.out.println();

        }

        for(int e=1;e<tall;e++)
        {//repeat x times:

            for(int c=tall;c>e;c--){
                System.out.print(a);

            }
            System.out.println();

        }

    }

}
