package Class26;



/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */

import java.util.Collection;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {

        Collection<String>words=new LinkedList<>();
        words.add("Hi");
        words.add("My");
        words.add("Name");
        words.add("Is");
        words.add("Axel");


        String empty="";
        for(String w:words){
          empty=empty+w;
        }
        System.out.println(empty);








    }
}
