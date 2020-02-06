package StudentInfo;

public class ITStudent  extends Student{
	private int score;
	
	public ITStudent(String id,String name,Subject subject,int score) {
		super(id,name,subject);
		this.score = score;
	}
	
	public ITStudent() {
		super("","",null);
		this.score = 0;
	}
	
	public String getGrade() {
		if(score >= 80 && score <= 100) {
			return "A";
		}
		if(score >= 70 && score <= 79) {
			return "B";
		}
		if(score >= 60 && score <= 65) {
			return "C";
		}
		if(score >= 50 && score <= 59) {
			return "D";
		}
		return "F";
	}
	
	public String toString() {
		return "Enrolled" + getId() +" " + getName() +" (" + getSubject().getType() + ")";
	}
	
	
}
