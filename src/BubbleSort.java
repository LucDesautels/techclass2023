import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] monTab={23,1,234,6,9,2,98};
        int n=monTab.length;
        for(int i=0;i<(n-1); i++)
        {
            for(int j=0; j<(n-1);j++)
            {
                if (monTab[j]>monTab[j+1]){
                    int temp=monTab[j];
                    monTab[j]=monTab[j+1];
                    monTab[j+1]=temp;
            }
            }
        }

        System.out.println(Arrays.toString(monTab));
    }
}
