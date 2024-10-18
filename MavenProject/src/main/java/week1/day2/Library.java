package week1.day2;

public class Library {
	public static void bookTitle() {
		String Title="Harry Potter and the Sorcerer's Stone";
		System.out.println(Title+" Book Added Successfully");
		
	}
	public static void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library library=new Library();
		library.bookTitle();
		library.issueBook();
	
	}

}
