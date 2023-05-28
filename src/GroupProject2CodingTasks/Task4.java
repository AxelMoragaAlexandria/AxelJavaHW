package GroupProject2CodingTasks;

import java.util.Arrays;

public class Task4 {
    /*
    Question #4
    Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
    meaning they contain the same characters in a different order.
    For example, "listen" and "silent" are anagrams.
     */

        public static boolean isAnagrams(String w1,String w2){
            if(w1.length()!=w2.length()){
                return false;
            }

           char[]array1=w1.toCharArray();
            char[]array2=w2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            return Arrays.equals(array1,array2);
        }

    public static void main(String[] args) {


        if(isAnagrams("listen","silent")){
            System.out.println("Both words are Anagrams");
        }else{
            System.out.println("Both word are not Anagrams");
        }
        
    }






}



