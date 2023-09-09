package thread;
class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread1");
		for (int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
}


class Thread2 extends Thread{
	

	public void run() {
		System.out.println("Thread2");
		for (int i=6;i<=10;i++) {
			System.out.println(i);
		}
	}
}


class Thread3 extends Thread{
	public void run() {
		System.out.println("Thread3");
		int num=10;
		for (int i=0;i<=num;i++) {
			System.out.println(num +"*" + i+ "=" + (num*i));
		}
	}
}
public class ThreadusingInheritance {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t=new Thread1();	
		Thread2 t2=new Thread2();		
		Thread3 t3=new Thread3();	
		
//		t.setPriority(1);
//		t2.setPriority(7);
//		t3.setPriority(2);
//		
//		System.out.println("AFTER priority");
		t.start();
		Thread.sleep(5000);
		t2.start();
		t3.start();
		
		
	
	
		
	}

}
