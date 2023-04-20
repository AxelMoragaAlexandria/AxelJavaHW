package GroupCodingTasks;

public class Task4 {
    public static void main(String[] args) {

      /*
      Create a 2D array of integers.
      Develop a program which will calculate the sum of even and odd numbers for that array.
       */


        int[][]numbers={
                {1,2,3,4,5,6},
                {7,8,9,10,11},
                {12,13,14,15},
                {55,58,69,72,79,86}
        };

        int evensum=0;
        int oddsum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column <numbers[row].length; column++) {
                if(numbers[row][column]%2==0){
                    evensum=evensum+numbers[row][column];
                } else if (numbers[row][column]%2==1) {
                    oddsum=oddsum=numbers[row][column];
                }

            }

        }

        System.out.println("The sum of even numbers is "+evensum);
        System.out.println("The sum of even numbers is "+oddsum);






    }
}
