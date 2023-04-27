package Class13;

public class Task1_ {
    public static void main(String[] args) {

        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */
        String word = "This is reverse i want to reverse";
        String[] words = word.split(" ");

         for (String s : words) {




                for (int i = s.length() - 1; i >= 0; i--) {
                    System.out.print(s.charAt(i));

                }
                System.out.print(" ");
        }
    }
}
