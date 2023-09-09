package javaEigth;
interface Validate{
	boolean isvalidate(String username,String password);
}

 
	 public class Source{
	public static void main(String[] args) {
		Validate v= (String username,String password)->{if ( username.equals("ABC") &&  password.equals("DEF")) {
		return true;}
		else {
			return false;
		}
		};
		Source s=new Source();
		System.out.println(v.isvalidate("ABC", "DEr"));
		
	

}
}