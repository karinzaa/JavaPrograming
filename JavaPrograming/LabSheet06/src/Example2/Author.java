package Example2;


public class Author {
	private String name,email;
	private int debutYear;
	
	public Author(String name,String email,int debutYear) {
		this.name = name;
		this.email = email;
		this.debutYear = debutYear;
	}
	public Author(String name,String email) {
		this(name,email,0);
	}
	public Author(String name,int debutYear) {
		this(name,"",debutYear);
	}
	public Author(String name) {
		this(name,"",0);
	}
	public Author() {
		this("","",0);
	}
	public String toString() {
		return name + " (" + email + ")";
	}
	
}
