import java.util.Arrays;

public class Exo2 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println(searchName(names, "Bob"));
        System.out.println(searchName(names, "Eve"));
        System.out.println(searchName(names, "David"));
    }

    public static int searchName(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(target)) {
                return i;
            }
        }
        return -1;  // Return 1 if the name is not found
    }
}