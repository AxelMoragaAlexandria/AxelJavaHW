package GroupCodingTasks;

public class Task7 {
    public static void main(String[] args) {

        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */

        int number=0;
        int number2=1;
        for (int i = 0; i <=10; i++) {
            System.out.print(number+" ");
            int nextNum=number+number2;
            number=number2;
            number2=nextNum;
        }


    }
}

