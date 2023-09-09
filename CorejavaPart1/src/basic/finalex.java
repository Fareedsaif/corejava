package basic;

public class finalex {
	final int j=23;
	 final void dis() {
		 
	 }
	 class finalex2 extends finalex {
		 void dis() {  // cant override method due to final keyword
			 
		 }
	 }
	public static void main(String[] args) {
		finalex f=new finalex();
		f.j=10;
		
	}

}
