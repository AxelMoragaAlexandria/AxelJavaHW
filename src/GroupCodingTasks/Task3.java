package GroupCodingTasks;

public class Task3 {
    public static void main(String[] args) {

    /*Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.
     */

        int[][]digits={
                {1,2,3,4,5,6},
                {7,8,9,10,11},
                {12,13,14,15},
                {55,58,69,72,79,86}
        };


        for (int row = 0; row < digits.length; row++) {
            for (int column = 0; column <digits[row].length; column++) {
                if(digits[row][column]%2==0){
                    System.out.print(digits[row][column]+" ");
                }

            }
            System.out.println();
        }
    }
}
