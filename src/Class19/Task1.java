package Class19;

public class Task1 {
    /*
    Create 1 class in which create a methods that will calculate the area of Rectangle and Square.
    Method name must be called calculateArea
     */


        public static void calculateArea(int a,int b){
            System.out.println(a*b);
        }

        public static void calculateArea(int a){
            System.out.println(a*a);
        }


    public static void main(String[] args) {
            Task1.calculateArea(5,6);
            Task1.calculateArea(5);

    }
}
