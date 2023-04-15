package Class10;

public class HW2 {
    public static void main(String[] args) {

/*
Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
 */

        String[][]cars={
                {"Tesla","Ford","Jeep"},
                {"BMW","Porsche"},
                {"Kia","Hyundai","Genesis"},
                {"Ferrari","Lamborghini"}
        };

        for (int row = 0; row < cars.length; row++) {
            for (int column = 0; column <cars[row].length; column++) {
                System.out.print(cars[row][column]+" ");

            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for (String[] car : cars) {
            for (String s : car) {
                System.out.print(s+" ");
            }
            System.out.println();
        }


    }
}
