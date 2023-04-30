package Class14;

public class Task__2 {

    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
     your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */


String createEmail(String firstName,String lastName, String emailType){

    String createEmail=firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
return createEmail;
}
    public static void main(String[] args) {
        Task__2 obj = new Task__2();
  String result= obj.createEmail("Axel","Moraga","yahoo");
        System.out.println(result);

    }
}
