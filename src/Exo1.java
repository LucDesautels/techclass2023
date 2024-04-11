import java.util.Arrays;

public class Exo1 {
    public static void main(String[] args) {
        int[] array12345 = {1, 2, 3, 4, 5};

        System.out.println(Exo1method(array12345));

    }
    public static int Exo1method(int[] array12345) {
        int Exo1method=0;
        for(int i:array12345) {
            Exo1method=Exo1method+i;
        }
return Exo1method;
    }
}
