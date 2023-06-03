package Class26;

import java.util.*;

/*
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
public class PersonTester {
    public static void main(String[] args) {

        Map<Integer,Person>personMap=new TreeMap<>();
        personMap.put(2303,new Person("Axel","Moraga",90,150000));
        personMap.put(1853,new Person("Leandro","Moraga",45,145000));
        personMap.put(3898,new Person("Brandon","Vicente",34,125000));



        
         for(Map.Entry<Integer,Person> i:personMap.entrySet()){
                i.getValue().PrintInfo();
         }







    }
}
