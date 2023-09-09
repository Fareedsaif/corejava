package basic;

import java.util.*;

class Book {
	String bookname;
	String authorname;
	int year;
	public Book(String bookname, String authorname, int year) {
		super();
		this.bookname = bookname;
		this.authorname = authorname;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", authorname=" + authorname + ", year=" + year + "]";
	}
	
}
class SortByname implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.bookname.compareTo(o2.bookname);
	}
	
}
public class Comparatorex {

	public static void main(String[] args) {
		List<Book> l=new ArrayList<>();
		
		
	}

}
