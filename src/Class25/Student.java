package Class25;


import java.util.HashSet;
import java.util.Set;

public class Student {

   private String name;
  private String studentID;

  Student(String name,String studentID){
      this.name=name;
      this.studentID=studentID;
  }

  public void getName(){
      System.out.println(name);
  }

}

class StudentTester{
    public static void main(String[] args) {

        Set<Student>students=new HashSet<>();
        students.add(new Student("Axel","abc123$%"));
        students.add(new Student("Leandro","loc304&*"));
        students.add(new Student("Brandon","cvb950#^"));


        for(Student s:students){
            s.getName();
        }
    }
}

