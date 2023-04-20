package GroupCodingTasks;

public class Task10 {
    public static void main(String[] args) {

        /*
        Write a program to print out duplicate elements from an Array of Strings?
         */

        String[] fruits={"Apple","Banana","Grapes","Blueberries","Raspberry"};

        for (int i = 0; i < fruits.length; i++) {
            for (int j =i+1; j < fruits.length ; j++) {
                if(fruits[i].equals(fruits[j]));
                    System.out.println(fruits[j]);

            }
        }
    }
}
