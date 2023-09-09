package collections;

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
		return o1.bookname.compareTo(o2.bookname);  //we can compare by authorname also in comparator
	}
	

}

//class SortByauthor implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		return o1.authorname.compareTo(o2.authorname);  //we can compare by authorname also in comparator
//	}
//	
//
//}
public class Comparatorex {

	public static void main(String[] args) {
		List<Book> l=new ArrayList<Book>();
		l.add(new Book("rose", "Fareed", 2000));
		l.add(new Book("lotus", "inam", 2012));
		l.add(new Book("jasmine", "Ali", 1987));
		Collections.sort(l,new SortByname());
		for (Book b:l) {
			System.out.println(b);
		}
		
		
		
	}

}
