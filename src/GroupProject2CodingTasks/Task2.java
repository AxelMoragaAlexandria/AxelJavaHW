package GroupProject2CodingTasks;

public class Task2 {
    /*
    Questions #2
    Check if a String is Palindrome: Determine whether a given string is a palindrome,
     which means it reads the same forwards and backward.
      For example, "madam" is a palindrome.
     */


    public boolean Ispalindrome(String word){
        String empty="";
        boolean result=false;

        for(int i=word.length()-1;i>=0;i--){
                empty=empty+word.charAt(i);
        }
                if(empty.equalsIgnoreCase(word)){
                    return true;
                }
        return result;
        }

    public static void main(String[] args) {
        Task2 obj=new Task2();
           boolean result= obj.Ispalindrome("Madam");
        System.out.println(result);

    }
}
