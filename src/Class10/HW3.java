package Class10;

public class HW3 {
    public static void main(String[] args) {
/*
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
 Retrieve all values from that array using 2 different loops
 */

       String[][]groceryList={
               {"Broccoli","Carrots","Celery","Spinach"},
               {"Strawberry","Blueberries","Mangos"},
               {"Cheese","Milk","Yogurt"},
               {"Chocolate","SourPatch","Gushers","FruitByTheLoop"}
        };
        for (int row = 0; row <groceryList.length; row++) {
            for (int column = 0; column <groceryList[row].length; column++) {
                System.out.print(groceryList[row][column]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (String[] Bag : groceryList) {
            for (String s : Bag) {
                System.out.print(s+" ");

            }
            System.out.println();
        }







    }
}
