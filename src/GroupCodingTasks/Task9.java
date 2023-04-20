package GroupCodingTasks;

public class Task9 {
    public static void main(String[] args) {

      /*
      . Write a java program to find the second-largest number in the array?
       */


        int[]number={95,10,40,90,383,};

        int secondLargest=number[0];
        int largestNumber=number[0];
        for (int i = 0; i <number.length ; i++) {
            if (number[i] > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = number[i];
            } else if (number[i] > secondLargest) {
                secondLargest = number[i];
            }

        }
        System.out.println(secondLargest);
    }
}
