package Class28;


/*
 Create a method to check age eligibility that will throw a runtime exception.
 Method should throw an exception age is less than 16.
 */
public class Task1 {

    public static void ageValid(int age)  {

        if(age<16){
            throw new RuntimeException("In order to be eligible, age needs to be 16 years or older");
        }
    }

    public static void main(String[] args) {

        try{
            ageValid(6);
        }catch(Exception e){
            e.printStackTrace();
        }


    }



}
