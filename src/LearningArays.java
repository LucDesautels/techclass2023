public class LearningArays {
    public static void main(String[] args) {
        String[] cars= {"Volvo","BNW","FORD","Mazda"};
        int[]prices={10,20,30,40};
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        System.out.println("----------------");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
