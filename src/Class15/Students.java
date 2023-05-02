package Class15;

import Class14.Student;

public class Students {
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */



    String name;
    String ID;
    static int numberOfStudent;


    public static void main(String[] args) {
        Students Student1=new Students();
        Student1.name="Axel";
        Student1.ID="AS10102";
        Student1.numberOfStudent++;

        Students Student2= new Students();
        Student2.name="Alex";
        Student2.ID="AL3493";
        Student2.numberOfStudent++;

        Students Student3= new Students();
        Student3.name="Leo";
        Student3.ID="LE56011";
        Student3.numberOfStudent++;
        Students Student4= new Students();
        Student4.name="Neymar";
        Student4.ID="NE220101";
        Student4.numberOfStudent++;

        System.out.println("Total number of students: "+ numberOfStudent);






    }

}
