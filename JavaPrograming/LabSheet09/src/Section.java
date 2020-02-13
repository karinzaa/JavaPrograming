
public class Section extends Student {
	
	public Section(String id,String fname,String lname,int section) {
		super(id ,fname,lname,0,section);
	}
	public String getTime() {
	if(getSection() == 4) {
		return "08.00 - 11.00";
		}
	if(getSection() == 5) {
		return "14.00 - 17.00";
		}
	 return null;
	}
	
	public String toString() {
		return getId() + " " + "THU" + " " + getTime() + " " + getName();
	}

}
