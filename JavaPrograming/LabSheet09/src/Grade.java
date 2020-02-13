
public class Grade extends Student {
	public Grade(String id,String fname,String lname,double Grade) {
		super(id ,fname,lname,Grade,0);
	}
	public String getStringGrade() {
		if(getGrade() == 4.00) {
			return "A";
			}
		if(getGrade() >= 3.50) {
			return "B+";
		}
		if(getGrade() >= 3.00) {
			return "B";
		}
		if(getGrade() >= 2.50) {
			return "C+";
		}
		if(getGrade() >= 2.00) {
			return "C";
		}
		if(getGrade() >= 1.50) {
			return "D+";
		}
		if(getGrade() >= 1.00) {
			return "D";
		}
		 return "F";
		}
@Override
	public String toString() {
		return getId() + " " + getStringGrade()  + " " + getName();
	}
}
