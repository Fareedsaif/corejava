package javaEigth;
interface StringSpacing{
	String Space(String str);
}

public class spacebtwn {

	public static void main(String[] args) {
		StringSpacing S=(String str)->{
			  for(int i=0;i<str.length();i++) {
				  char c=str.charAt(i);
				  System.out.print(c+" ");
			  }
			return str;
		  };
		S.Space("Welcome");
		

	}

}
