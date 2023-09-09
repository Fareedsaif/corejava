package basic;

public class IfelseFunc {
	static void grade(int m) {
		if (m<100 && m>90) {
			System.out.println("A+ Grade");
		}
		else if(m<90 && m>80) {
			System.out.println("A Grade");}
		else if(m<80 && m>70) {
			System.out.println("B Grade");}
		else if(m<70 && m>50) {
			System.out.println("c Grade");}
		else if(m<50 && m>40) {
			System.out.println("D Grade");}
		else if(m<=40) {
			System.out.println("Fail");}
	}
		
		

	public static void main(String[] args) {
		grade(34);
		
	
	}

}
