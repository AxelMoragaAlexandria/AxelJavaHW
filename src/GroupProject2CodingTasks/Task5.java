package GroupProject2CodingTasks;

public class Task5 {
    /*
    Questions #5
    Find the First Non-Repeating Character in a String:
     Given a string, find and return the first non-repeating character.
      For example, in the string "abracadabra", the first non-repeating character is 'c'.
     */

    public static char NonRepeatingChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < word.length(); j++) {
                if (i != j && currentChar == word.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return currentChar;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String str = "abracadabra";
        char firstNonRepeatingChar = NonRepeatingChar(str);

        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }
}




