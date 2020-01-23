package Java01;
import java.text.DecimalFormat;
public class Subject {
	private String subjId;
	private String subjString;
	private int credit;
	DecimalFormat fm = new DecimalFormat();
	public Subject(String subjId,String subjName,int credit) {
		this.subjId = subjId;
		this.subjString = subjName;
		this.credit = credit;
	}


	public Subject(String subjId,String subjName) {
		this.subjId = subjId;
		this.subjString = subjName;
	}
	
	public Subject(int credit) {
		this.credit = credit;
	}
	
	public Subject() {
		this("","",0);
	}
	
	public double totalprice() {
		return credit * 1500;
	}
	
	public String toString() {
		return "Subject : " + subjString +" (" +subjId+ ") "+fm.format(totalprice())+" Bath.\n";
	}
	
	
}
