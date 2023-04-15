package Class10;

public class HW6 {
    public static void main(String[] args) {

     /*
     Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
     african countries. Then print all values from that array using 2 different loops and calculate
     how many total countries been stored.
      */

        String[][]countries={
                {"United States","Canada","Guatemala","El Salvador","Costa Rica"},
                {"Argentina","Brazil","Paraguay","Uruguay","Peru"},
                {"Germany","Italy","Spain"},
                {"Indonesia","Cambodia"},
                {"Nigeria","Cameroon","South Africa","Uganda","Ethiopia"}

        };

        int counter=0;
        for (int row = 0; row < countries.length; row++) {
            for (int column = 0; column < countries[row].length; column++) {
                    counter++;
                System.out.print(countries[row][column]+" ");
            }
            System.out.println();
        }
        System.out.println(counter);

        System.out.println("-----------------");





        int counter1=0;
        for (String[] country : countries) {
            for (String s : country) {
                 counter1++;
                System.out.print(s+" ");

            }
            System.out.println();
        }
        System.out.println(counter1);












    }
}
