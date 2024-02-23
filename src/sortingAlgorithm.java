import java.util.Arrays;
import java.util.Scanner;
/*
To study
4 div 2    = 4/2 = 2
9 div 2 = 9/2 = 4
div doesnt include rest

4mod 2 = 4%2=0
9 mod 2 = 4 % 2 = 1
modulo is rest


*/
public class sortingAlgorithm {
    public static void main(String[] args) {
      int[] array= {2,45,1,88,999,324};
      int newLowest=999999;
      int replaceSlot=0;
      int temp=0;
           /*
      Repeat aray.legnth ammount of times:
        If array[i]<newLowest
               Set newLowest to array[i]
               Set replaceSlot to i
               set array[0] to array[i]
               set array[replaceSlot] to newlowest
        i++
    end loop
       */
   //   for(int i=0;i<array.length-1;i++){
     //     if(array[i]<newLowest){
     //         newLowest=array[i];
     //         replaceSlot=i;
   //           array[0]=array[i];
     //         array[replaceSlot]=newLowest;
//
     //       }
    //    }

      ///  newLowest=(array(0) + 1);
        for (int slot=0; slot<array.length;slot++)
        {//repeat for each slot
            newLowest=999999;
            for (int a=slot ;a<array.length;a++){
                 if(array[a]<newLowest) {
                     newLowest = array[a];
                     replaceSlot = a;
                 }

                 if(array[slot]>newLowest){ //if selected slot bigger than the lowest

                     temp=array[slot];
                  array[slot] =newLowest;
                  array[replaceSlot]=temp;

                 }


        }




/*
set lowest to 999
Repeat For each slot
Repeat array.legnth ammount of times{
See if next number is smaller than  lowest, if so set to lowest
}




 */
}

      /*
repeat array.legnth ammount of tiems
set a to 1
Find
       */



        System.out.println(Arrays.toString(array));


    }
}
