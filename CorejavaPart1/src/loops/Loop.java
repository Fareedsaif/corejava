package loops;

public class Loop {
	public static void main(String[] args) {

//	public static void main(String[] args) {
//		for (int i=0;i<=10;i++) {
//			System.out.println(i);
//		}
		//reverse loop
//		for (int i=10;i>=1;i--) {
//		System.out.println(i);
//	}
//		
//	//	while
//		
//		int i=11;
//		while(i<=20) {
//			System.out.println(i);
//			i++;
//		}
//		
		
		// do while
	
//		int i=0;
//		do {
//			System.out.println(i);
//			i++;
//		}
//			while(i<=10);
		//print even no till 50
		
//		for (int i=0;i<=51;i++) 
//		{
//			if
//			(i%2==0)	
//		System.out.println(i);
//	}
	//	print 1 to 10 sum
//		int sum=0;
//		for (int i=0;i<=10;i++)
//		{
//		sum=sum+i;
//		}
//		System.out.println(sum);	
		
		
		//reverse no	
				int number=123,reverse=0;
				
				while(number!=0) {
					int remainder=number%10;
					reverse=reverse*10+remainder;
					number=number/10;
				}
				System.out.println("The reverse of the given number is : "+reverse);
		
		
		
		
		
		
		
	}}