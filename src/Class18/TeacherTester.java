package Class18;

public class TeacherTester {
    public static void main(String[] args) {
        PianoTeacher obj=new PianoTeacher();
        obj.teacherName="Ms.Williams";
        obj.subject="Music";
        obj.HasRoom=true;
        obj.numOfStudents=56;
        obj.HasBadStudent=true;
        obj.isGivingOut();
        obj.yelling();


        System.out.println();
        ChemistryTeacher obj2= new ChemistryTeacher();
        obj2.teacherName="Ms.Sparell";
        obj2.subject="Chemistry";
        obj2.numOfStudents=55;
        obj2.HasRoom=true;
        obj2.HasBadStudent=false;
        obj2.isTeaching();
        obj2.BreakTime();
        System.out.println();

        MathTeacher obj3=new MathTeacher();
        obj3.teacherName="Mr.Bittner";
        obj3.subject="Math";
        obj3.HasRoom=true;
        obj3.numOfStudents=35;
        obj3.isTeaching();
        obj3.isGivingOut();

    }
}
