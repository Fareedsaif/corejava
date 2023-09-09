package thread;

class Printfunction {
	synchronized void printEven(int n) throws InterruptedException {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

	}

	synchronized void printFibonacci(int n) {
		int  a = 0, b = 0, c = 1;
		for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
		
        }
	}

	synchronized void printPrime(int n) {
		for (int i = 1; i <= n; i++) {
			if(i%2!=0) {
				System.out.println(i);
				
				
			}
		}
		

	}
}

public class SynchronizedEx1 {

	public static void main(String[] args) {
		Printfunction p = new Printfunction();
		new Thread() {
			public void run() {
				try {
					p.printEven(50);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		}.start();

		new Thread() {
			public void run() {
              p.printFibonacci(20);
			}
		}.start();
		new Thread() {
			public void run() {

			}
		}.start();

	}
}
