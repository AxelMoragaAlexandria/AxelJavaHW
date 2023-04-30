package Class14;

public class Task__1 {
    /*
    Create a method that will say
     Hello in different language based on the country that will passed when method is executed.
     */

  void country(String country){

        switch(country){
            case "United States":
                System.out.println("Hello!");
                break;
            case "Guatemala":
                System.out.println("Hola!");
                break;
            case "China":
                System.out.println("Nǐ hǎo!");
            case "Croatia":
                System.out.println("zdravo!");
                break;
            case "France":
                System.out.println("Bonjour!");
                break;
            case "Germany":
                System.out.println("Hallo!");
                break;
            case "Iraq":
                System.out.println("Marhaba!");
                break;
        }

    }

    public static void main(String[] args) {
                    Task__1 obj=new Task__1();
                    obj.country("Guatemala");


    }






}
