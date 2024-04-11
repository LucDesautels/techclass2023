import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Exo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       System.out.println("The list: "+list);
        System.out.println("Sum = "+listSum(list));
        System.out.println("Average = "+listAverage(list));
        listoddonly(list);
        System.out.println("Only odd in list = "+list);
    }
    public static int listSum(List<Integer> list) {
        int listSum = 0;
        for (int i:list){
            listSum = listSum + i;
        }
        return listSum;
    }
    public static int listAverage(List<Integer> list) {
        int listAverage = 0;
        for (int i:list){
            listAverage = listAverage + i;
        }
        return listAverage/list.size();
    }
    public static int listoddonly(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2==0){
                it.remove();
            }

        }
        return listoddonly(list);
    }

}

