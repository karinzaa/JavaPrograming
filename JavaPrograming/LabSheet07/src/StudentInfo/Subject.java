package StudentInfo;

public class Subject {
	private String id;
	private String name;
	private int credit;
	
	public Subject(String id,String name,int credit) {
		this.id = id;
		this.name = name;
		this.credit = credit;
	}
	
	public Subject(String id,String name) {
		this(id,name,0);
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getType() {
		if(credit == 1) {
			return "Laboratory";
		}
		if (credit == 3) {
			return "Lecture";
		}
			return "";
	}
	
	
}
