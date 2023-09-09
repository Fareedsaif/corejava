package thread;
class Customer
{
	int amount = 50000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw..");
		if(this.amount<amount)
		{
			System.out.println("Less balance ;waiting for deposit:");
			try {
				wait();  //its waits till deposit thread works
			}catch(Exception e)
			{
				
			}
		}
		this.amount-= amount;
		System.out.println(" withdraw completedd.."+ this.amount);

		
	}
	
	
	synchronized void deposit(int amount)
	{
		System.out.println("Going to Deposit..");
		this.amount+= amount;
		System.out.println(" Deposit completed.."+ this.amount);
		System.out.println("Balance amt: " + this.amount);
		notify(); //its notify to withdraw thread
	}
}

public class SyncBankExnotify {

	public static void main(String[] args) {
		 Customer c = new Customer();
		new Thread() {                            //new way to call thread
		public void run() {
			c.withdraw(10000);
		}	 
		}.start();
		
		 
		 
		 new Thread() {
			 public void run() {
					c.deposit(20000);
				}	 
				}.start();
				
		 }
}		 
			
		

	




	


