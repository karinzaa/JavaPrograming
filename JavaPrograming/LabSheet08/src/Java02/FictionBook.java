package Java02;
import java.util.Calendar;

public class FictionBook implements Author,Book {
		private String author_name,email,title;
		private int publicYear;
		
		public FictionBook(String title,int publicYear) {
			this.title = title;
			this.publicYear = publicYear;
		}
		public void setAuthorName(String name) {
			this.author_name = name;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean checkFormatName() {
			if(!author_name.contains(" ") || author_name.endsWith(" ") || author_name.startsWith(" ")) {
				return false;
			}
			return true;
		}
		@Override
		public String getFirstName() {
			String frName = author_name.substring(0,author_name.indexOf(" "));
			return frName;
		}
		@Override
		public String getLastName() {
			String lsName = author_name.substring(author_name.indexOf(" ")+1,author_name.length());
			return lsName;
		}
		@Override
		public String getTitle() {
			return title;
		}
		@Override
		public int totalPublicYear() {
			return Calendar.getInstance().get(Calendar.YEAR) - publicYear;
		}
		@Override
		public boolean checkEmail() {
			if(email.startsWith("@") || email.contains(" ")) {
				return false;
			}
			if(email.endsWith("@hotmail.com") || email.endsWith("@gmail.com")) {
				return true;
			}
			return false;
		}
		@Override
		public String toString() {
			return title + " write by " + getLastName().charAt(0) + "." + getFirstName() + "(" + email + ")\n"
					+ "Public for " + totalPublicYear() + " years.";
		}
}
