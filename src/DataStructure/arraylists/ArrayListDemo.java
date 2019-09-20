package DataStructure.arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDemo {

    public static void main(String[] args) {
        // create an array list that contains 100 random integers
        // 1. create an array list
        // 2. store data into that array list
        // 3. *** Bonus *** print the array list

        try {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Random rand = new Random();

            // this for loop is assigning random integer values to the array list
            for (int i = 0; i < 100; i++) {
                arrayList.add(rand.nextInt());
            }

            // printing out all the random numbers from the array list, from 1-100
            System.out.println("\nFOR LOOP");
            for (int i = 0; i < 100; i++) {
                System.out.println(arrayList.get(i));
            }

            System.out.println("\nFOR EACH LOOP");
            for (Integer num : arrayList) {
                System.out.println(num);
            }

            System.out.println("\nITERATOR");
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
