package org.examplejava.GenericsandCollections;
import java.util.*;

public class Collections {

    @SafeVarargs
    public final <T> void genericMethod(T... gen) {
        for (T g : gen) {
            System.out.println("Generico: " + g);
        }
    }



    public static void main(String[] args) {

        Collections collections = new Collections();

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(9999);
        hashSet.add(999);
        hashSet.add(99);

        Iterator<Integer> i = hashSet.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        collections.genericMethod(5, "Letas", 109, "ABC", 982);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(6786);
        list.add(123123);
        list.add(973537);
        list.add(123332);
        list.add(10);

        java.util.Collections.sort(list);
        System.out.println(list);

    }

}
