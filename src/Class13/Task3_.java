package Class13;

public class Task3_ {
    public static void main(String[] args) {

        /*
     How would you swap  2 strings without a temporary variable?
          */



        String a="Hi";
        String b="Bye";



        a=a+b; //HiBye
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println(a);
        System.out.println(b);















    }
}

