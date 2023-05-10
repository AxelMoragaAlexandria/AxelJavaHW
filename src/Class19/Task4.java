package Class19;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */


    private static void subtract(int a, int b){
        System.out.println(a-b);
    }
    private static void subtract(double a, double b){
        System.out.println(a-b);
    }
    private static void subtract(int a, int b,int c){
        System.out.println(a-b-c);
    }

    public static void main(String[] args) {
        subtract(10,5);
        subtract(25.5,10.5);
        subtract(200,50,100);
    }







}
