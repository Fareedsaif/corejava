package thread;
	
public class FinalizeMetod {
	public FinalizeMetod(String s) {
		super();
		this.s = s;
	}


	String s;
	

	public static void main(String[] args) {
		FinalizeMetod m1=new FinalizeMetod("abc");
		FinalizeMetod m2=new FinalizeMetod("abd");
		m1=null;
		m2=null;
		m1=m2;
		System.gc();  //remove and check
		
	}	
	

		protected void finalize() throws Throwable {
			System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
		}
		
	
}

