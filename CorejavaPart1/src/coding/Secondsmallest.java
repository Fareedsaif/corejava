package coding;

public class Secondsmallest {
	static int getSecond(int[] arr) {
	//	int total=arr.length-1;
		int temp;
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i;j<arr.length-1;j++) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}	
return arr[1];
}

	public static void main(String[] args) {
		int[] arr= {23,54,22,33,90};
		System.out.println(getSecond(arr));
}}
