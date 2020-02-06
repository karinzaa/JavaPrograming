package StudentInfo;

public class Student {
	private String id;
	private String name;
	private Subject subject;
	
	public Student(String id,String name,Subject subject) {
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	
	public Student() {
		this("","",null);
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		
	}
	
}
