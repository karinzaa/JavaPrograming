
public class Student {
	
	private String id,fname,lname;
	private double grade;
	private int section;
	
	public Student(String id,String fname,String lname,double grade,int section){
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.grade = grade;
		this.section = section;
	}
	public Student(){
		this("","","",0,0);
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return fname + " " + lname;
	}
	public double getGrade() {
		return grade;
	}
	public int getSection() {
		return section;
	}
	

}
