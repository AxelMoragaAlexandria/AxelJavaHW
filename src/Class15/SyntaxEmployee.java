package Class15;

public class SyntaxEmployee {

/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */

    String empID;
    double Salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee Employee1=new SyntaxEmployee();

            Employee1.empID="YQ119350";
            Employee1.Salary=150000;
        System.out.println(Employee1.empID);
        System.out.println(Employee1.Salary);
            System.out.println(SyntaxEmployee.CEO);
            SyntaxEmployee Employee2=new SyntaxEmployee();
            Employee2.empID="AZ300231";
            Employee2.Salary=125000;
        System.out.println(Employee2.empID);
        System.out.println(Employee2.Salary);
        System.out.println(SyntaxEmployee.CEO);
    }


}
