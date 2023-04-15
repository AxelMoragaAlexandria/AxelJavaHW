package Class10;

public class HW4 {
    public static void main(String[] args) {
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
 */

        int[][] numbers={
                {5,10,15},
                {20,25,30},
                {9,44,33}
        };

int sum=0;

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                sum=sum+numbers[row][column];

            }

        }
        System.out.println(sum);


    }
}
