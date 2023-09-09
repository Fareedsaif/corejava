package loops;

public class ReverseString {
	public static void main(String[] args) {

//	public static void main(String[] args) {
//	StringBuffer s=new StringBuffer("WELCOME");
//	System.out.println("String: " +s);
//	s.reverse();
//	System.out.println("Reverse String: " +s);
	
	
	//using loop
	String s="EDUBRIDGE";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i)	;
	}
	
	System.out.println("Reverse String: " +rev);
}  }    