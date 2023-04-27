package Class13;

public class Task2_ {
    public static void main(String[] args) {

        /*
        How would you check if String is palindrome or not? aba=> true
                            Abbc =>false
         */

        String word="racecar";
            String empty="";
        for (int i =word.length()-1; i >=0 ; i--) {
                   empty=empty+word.charAt(i);
        }

        if(empty.equalsIgnoreCase(word)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }







    }
}
