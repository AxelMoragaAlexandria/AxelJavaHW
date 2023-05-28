package GroupProject2CodingTasks;
/*
Questions #7
We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
Provide implementation of abstract method in classes 'A' and 'B'.
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
Test your code
 */
public abstract class Marks {

    public abstract double getPercentage();

}
class A extends Marks{
    double mathPercentage;
    double sciencePercentage;
    double englishPercentage;


    A(double mathPercentage,double sciencePercentage,double englishPercentage){
        this.mathPercentage=mathPercentage;
        this.sciencePercentage=sciencePercentage;
        this.englishPercentage=englishPercentage;
    }
    @Override
    public double getPercentage() {
            double result=(mathPercentage+sciencePercentage+englishPercentage)/3;

            return result;
    }
}

class B extends Marks{
    double mathPercentage;
    double sciencePercentage;
    double englishPercentage;
    double civicPercentage;

    B(double mathPercentage,double sciencePercentage,double englishPercentage,double civicPercentage){
        this.mathPercentage=mathPercentage;
        this.sciencePercentage=sciencePercentage;
        this.englishPercentage=englishPercentage;
        this.civicPercentage=civicPercentage;


    }

    public double getPercentage(){
        double result=(mathPercentage+sciencePercentage+englishPercentage+civicPercentage)/4;
        return result;
    }
}
class MarksTester{
    public static void main(String[] args) {
        Marks StudentA=new A(85,55.5,98);
       double result= StudentA.getPercentage();
        System.out.println("Student A average grade is: "+result);
        Marks StudentB=new B(34,75,90,95);
        double result2=StudentB.getPercentage();
        System.out.println("Student B average grade is: "+ result2);



    }
}

