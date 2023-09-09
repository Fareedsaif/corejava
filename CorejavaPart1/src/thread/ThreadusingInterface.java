package thread;
class Thread11 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1");
		for (int i=10;i<=15;i++) {
			System.out.println(i);
		}
	}
}
		

public class ThreadusingInterface {

	public static void main(String[] args) {
		Thread11 t=new Thread11();
		Thread t1=new Thread(t);   //directly we cannot call the method in interface thread
		t1.start();
	}

}
