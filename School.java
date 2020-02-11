import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int moneySpent;




    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned = 0;
        moneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
        //for (Teacher t : teachers){
          //  return t.getName();
        //}
    }

    //adds teacher to school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    //add students to school
    public void addStudents(Student student) {
        students.add(student);
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //adds total money earned by school
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    //spent on teacher salary
    public static void updateMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    

   

    
}