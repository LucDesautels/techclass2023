import java.sql.SQLOutput;
import java.util.Scanner;
public class TEMPLATE {
    public static void main(String[] args) {
        int[] data = {7,21,5,19,6,2};

        int k=0;
int a=0;
int b=0;
        int c=0;

while(k<6){
    if ((data[k]>4)&&(data[k])<8){
        a=a+data[k];
        b=b+1;
    }
    k=k+1;

}


c=a/b;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("k = "+ k);


    }
}
