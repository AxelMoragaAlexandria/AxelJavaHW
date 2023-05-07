package Class17;

public class Task2 {
    /*
 Write a java class that have 4 constructors with 4 different access levels of
 constructors(private,public,default,protected)
 and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
 3 - from different class inside different package and observe result.
     */

    String name;
    int age;
    double weight;

   private Task2(String name,int age, double weight){
       this.name=name;
       this.age=age;
       this.weight=weight;
   }
    public Task2(String name){
        this.name=name;

    }
    Task2(String name,double weight){
        this.name=name;
        this.weight=weight;
    }
    protected Task2(String name, int age){
        this.name=name;
        this.age=age;

    }


    public static void main(String[] args) {
        Task2 obj=new Task2("Axel",19,190.5); //PRIVATE CONSTRUCTOR

       /*
        FOR PUBLIC CONSTRUCTOR pls go into package class 16 and click on Tester Class
         */

    }




}
