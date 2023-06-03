package Class26;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task4 {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(50);
        numbers.add(50);
            int sum=0;
        for (int i = 0; i < numbers.size(); i++) {
            sum=sum+ numbers.get(i);
        }
        System.out.println(sum);




    }
}
