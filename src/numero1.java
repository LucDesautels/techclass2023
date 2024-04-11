import java.util.Arrays;

public class numero1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int largest = Arrays.stream(arr).max().getAsInt();
        System.out.println("The largest number in the array is: " + largest);
    }
}
