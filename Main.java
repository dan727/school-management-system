import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Teacher hummel = new Teacher(1, "Hummel", "CS", 70000, "Programming");
        Teacher bell = new Teacher(2, "Bell", "CS", 50000, "Software Engineering I");
        Teacher lillis = new Teacher(3, "Lillis", "CS", 90000, "Data Structures");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(hummel);
        teacherList.add(bell);
        teacherList.add(lillis);

        Student daniel = new Student(1, "Daniel", "CS", 5);
        Student marcelino = new Student(2, "Marcelino", "CS", 3);
        Student markise = new Student(3, "Markise", "CS", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(daniel);
        studentList.add(marcelino);
        studentList.add(markise);


        School stowe = new School(teacherList, studentList);

        Teacher john = new Teacher(4, "John", "Math", 95000, "Calc I");
        stowe.addTeacher(john);

        daniel.payFees(5000);
        System.out.println("stowe has earned $" + stowe.getTotalMoneyEarned());

        marcelino.payFees(10000);
        System.out.println("stowe has earned $" + stowe.getTotalMoneyEarned());

        hummel.receiveSalary(hummel.getSalary());
        System.out.println("Stowe has paid " + "salary to " + hummel.getName() + " his salary is " + hummel.getSalary());
        System.out.println("stowe has  $" + stowe.getTotalMoneyEarned());

        System.out.println(daniel);

        System.out.println(stowe.getTeachers());
    }
}