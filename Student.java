

public class Student{

    private int id;
    private String name;
    private String major;
    private int grade;
    private int feePaid;
    private int feeTotal;




    public Student(int id, String name, String major, int grade){
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
        feePaid=0;
        feeTotal=30000;
    }



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String getMajor() {
		return major;
	}


	public int getGrade() {
		return grade;
	}

	public int getFeePaid() {
		return feePaid;
	}


	public int getFeeTotal() {
		return feeTotal;
	}


    public void payFees(int fees){
		feePaid += fees;  
		School.updateTotalMoneyEarned(feePaid);
    }

	public int getRemaingFees(){
		return feeTotal-feePaid;
	}

	@Override
	public String toString(){
		return name + " " + id + " " + major + " " + feePaid + " " + feeTotal;
	}



}