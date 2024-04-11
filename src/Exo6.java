import java.util.ArrayList;
import java.util.List;

public class Exo6 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(22);
        numbers.add(30);
        numbers.add(49);
        numbers.add(50);
        numbers.add(104);


        System.out.println("Sum of all elements: " + sumElements(numbers));
        System.out.println("Maximum element: " + findMaxElement(numbers));
    }

    public static int sumElements(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int findMaxElement(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}