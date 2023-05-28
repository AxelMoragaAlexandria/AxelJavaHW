package GroupProject2CodingTasks;

public class Task3 {
    /*
    Question #3
    Count the Number of Words in a String:
    Write a function to count the number of words in a given string.
     Words are separated by spaces or punctuation.
     For example, the input "Hello, world!" should return 2.
     */

    public int NumberofWord(String word){
           int count=0;

        String []arr= word.split(" ");

        for (int i = 0; i < arr.length; i++) {
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        int result=obj.NumberofWord("Hello Nice");
        System.out.println(result);

    }





}
