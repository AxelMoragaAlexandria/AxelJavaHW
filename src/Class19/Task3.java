package Class19;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void multiply(int a, int b){
        System.out.println(a*b);
    }
    static void multiply(int a, int b,int c){
        System.out.println(a*b*c);
    }
    static void multiply(double a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
                multiply(5,5);
                multiply(3,3,3);
                multiply(5.5,3.3);
    }







}
