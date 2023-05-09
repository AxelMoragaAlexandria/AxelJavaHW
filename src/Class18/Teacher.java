package Class18;

public class Teacher {
    /*
    Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher.
    Test all 4 classes

     */
   protected String teacherName;
    protected String subject;
    protected boolean HasRoom;
   protected int numOfStudents;
   protected boolean HasBadStudent;


  public void isTeaching(){
        System.out.println(teacherName+" is teaching the class");
    }
   public void isGivingOut(){
        System.out.println(teacherName+" is giving out papers for the Homework");
    }
    public void yelling(){
        System.out.println(teacherName+" is yelling at a student");
    }
   public void BreakTime(){
        System.out.println(teacherName+" Students are on break eating their snacks");
    }








}
