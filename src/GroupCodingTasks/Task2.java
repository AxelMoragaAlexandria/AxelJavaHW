package GroupCodingTasks;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values.
         After the array is created, calculate the sum of all stored elements in that array.
         */

        int[] numbers={60,30,50,20,90,80};

        int sum=0;
        for (int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }

        System.out.println("The sum of all the elements is "+sum);








    }
}
