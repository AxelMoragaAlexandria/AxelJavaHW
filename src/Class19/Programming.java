package Class19;

public class Programming {
    /*
    Create a class named 'Programming'.
     While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
     If some String is passed to it, then in place of "programming languages" the value variable should be printed.
      Example, if we pass "Java", then "I love Java" should be printed.
     */

    String word;
        Programming(){
            System.out.println("I love programming languages");
        }

        Programming(String word) {
             this.word=word;
            System.out.println("I love "+word);

        }



    public static void main(String[] args) {
                 Programming obj=new Programming("Python");
                 Programming obj2=new Programming("Java");
                Programming obj3=new Programming("C++");
                 Programming obj4=new Programming();



    }


}
