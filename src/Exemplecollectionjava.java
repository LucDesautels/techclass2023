import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Exemplecollectionjava {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("Avec les elements ajoutes: "+list);


        list.remove("B");
        System.out.println("Apres avoir enleve B: " + list);

        String element = list.get(0);
        System.out.println("Element a l'indice 0: " + element);

        System.out.println("Parcourir la collection: ");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        //Size
        int size = list.size();
        System.out.println("Taille de la liste: " + size);

        boolean isEmpty = list.isEmpty();
        System.out.println("Est vide ? "+ isEmpty);

        list.clear();
        System.out.println("After erasing list " + list);

        //add all the elements from one collection to another
        List<String> list2 = new ArrayList<String>();
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list.addAll(list2);
        System.out.println("apres ajout des elements de list2: " + list);






    }
}
