package GroupProject2CodingTasks;

public class Task1 {
    /*
    Question #1
    Reverse a String: Write a function to reverse a given string.
    For example, given the input "Hello", the output should be "olleH".
     */

    public String revereStr(String word){
        String empty="";

        for (int i =word.length()-1; i>=0 ; i--) {
            empty=empty+word.charAt(i);
        }

        return empty;
    }
    public static void main(String[] args) {

        Task1 obj=new Task1();
        String result=  obj.revereStr("Hello");
        System.out.println(result);




    }
}
