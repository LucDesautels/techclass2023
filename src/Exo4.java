public class Exo4 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Gridformat(matrix);
        System.out.println("Average of all elements: " + avgmethodexo4(matrix));
        System.out.println("Greatest element: " + FindGreatestElement(matrix));
    }

    public static void Gridformat(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double avgmethodexo4(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum / (matrix.length * matrix[0].length);
    }

    public static int FindGreatestElement(int[][] matrix) {
        int greatest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > greatest) {
                    greatest = matrix[i][j];
                }
            }
        }
        return greatest;
    }
}