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
        Students.numberOfStudent++;

        Students Student2= new Students();
        Student2.name="Alex";
        Student2.ID="AL3493";
        Students.numberOfStudent++;

        Students Student3= new Students();
        Student3.name="Leo";
        Student3.ID="LE56011";
        Students.numberOfStudent++;
        Students Student4= new Students();
        Student4.name="Neymar";
        Student4.ID="NE220101";
        Students.numberOfStudent++;

        System.out.println("Total number of students: "+ numberOfStudent);






    }

}
