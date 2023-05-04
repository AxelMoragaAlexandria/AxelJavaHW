package Class16;

public class Task3 {

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name
     */

    private String vowel(String s){

        String empty="";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                empty=empty+s.charAt(i);
            }

        }
        return empty;
    }

    public static void main(String[] args) {
            Task3 obj=new Task3();
          String answer= obj.vowel("Today is a nice day");
        System.out.println(answer);
    }




}
