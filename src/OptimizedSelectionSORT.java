import java.util.Arrays;

public class OptimizedSelectionSORT {
    public static void main(String[] args) {
        int[] array= {2,45,1999999999,88,38274832,324};
        int newLowest=999999;
        int replaceSlot=0;
        int temp=0;
        for (int slot=0; slot<array.length;slot++)
        {//repeat for each slot
            newLowest=2147483647;

            for (int a=slot ;a<array.length;a++){
                if(array[a]<newLowest) {
                    newLowest = array[a];
                    replaceSlot = a;
                }
                if(array[slot]>newLowest){
                    temp=array[slot];
                    array[slot] =newLowest;
                    array[replaceSlot]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}

/*
Repeat array.legnth ammount of times:
    For each slot:
        Set new lowest to 999999
        If array[loopSlot] < newLowest
            set newLowest to array[LoopSlot]

*/
