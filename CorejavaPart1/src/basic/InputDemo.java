package basic;

public class InputDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur name : ");
		String name=scanner.nextLine();
		System.out.println("name: "+name);
		System.out.println("Enter ur rollno: ");
		int rollno=scanner.nextInt();
		System.out.println("Rollno: "+rollno);
		System.out.println("Enter ur Percentage: ");
		float percentage=scanner.nextFloat();
		System.out.println("Percentage: "+percentage);
		System.out.println("-----Buffered Reader------ ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name : ");
		String fname;
		try {
			fname = br.readLine();
			System.out.println("Full name: "+fname);
		} catch (IOException e) {
			
		}
		
		System.out.println("Enter ur rollno: ");
		int rollno1=Integer.parseInt(br.readLine());
		System.out.println("Rollno: "+rollno1);
	}

}
