

public class Teacher{

    private int id;
    private String name;
    private String department;
    private int salary;
    private String courseTeaching;
    private int salaryEarned;

    public Teacher(int id, String  name,
                    String department, 
                    int salary, String courseTeaching ){

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.courseTeaching = courseTeaching;
        this.salaryEarned=0;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public int getSalary(){
        return salary;
    }

    public String getCourseTeaching(){
        return courseTeaching;
    }

    //adds to salary earned and removes money from school
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateMoneySpent(salaryEarned);
    }

    @Override
	public String toString(){
		return name + " " + id + " " + department + " " + salaryEarned;
	}


}
