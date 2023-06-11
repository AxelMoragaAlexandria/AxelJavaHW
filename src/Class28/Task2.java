package Class28;


/*
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.
 */
public class Task2 {

    public static void checkUserName(String username){
        if(username.length()<5){
            throw new RuntimeException("Username needs to be longer");
        }else{
            System.out.println("Username is good ");
        }
    }

    public static void main(String[] args) {

       try{
           checkUserName("axl");
       }catch(Exception e){
           e.printStackTrace();
       }





    }



}
