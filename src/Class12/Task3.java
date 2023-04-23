package Class12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


           Scanner scan=new Scanner(System.in);
        System.out.println("What is the Mom's first name");
        String mom=scan.nextLine();
        System.out.println("What is Dad's first name");
        String dad=scan.nextLine();
        System.out.println("What is the gender expected");
        String gender=scan.nextLine();
        String babyname;

       if(gender.equalsIgnoreCase("Boy")){
           babyname=dad.substring(0,3)+mom.substring(mom.length()-2);
           System.out.println(babyname);
       }else if(gender.equalsIgnoreCase("Girl")){
           babyname=mom.substring(0,2)+dad.substring(dad.length()-3);
           System.out.println(babyname);
       }else{
           System.out.println("Error Try again");
       }








    }
}
