package classConcepts;
/* 1 method
class gym implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("GYM");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}

	}
}
class yoga implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("YOGA");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}

	}
	
}*/



public class RunnableInterfaceDemo {

	public static void main(String[] args) {

		/*//2nd Method using Anonymous class while creating runnable
		Runnable g = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("GYM");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}

			}
		};
		Runnable y = new Runnable() 
		{
			public void run() 
			{
				for (int i = 0; i < 5; i++) {
					System.out.println("YOGA");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}

			}
		};
		*/
		
		
	//3rd method 	
		Runnable g = ()->
		{
				for (int i = 0; i < 5; i++) {
					System.out.println("GYM");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}

			};
		Runnable y = ()-> 
			{
				for (int i = 0; i < 5; i++) {
					System.out.println("YOGA");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
		};
		
		
		//4th method
		Thread t1 = new Thread(()->
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("GYM");
				
				try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	});
		Thread t2 = new Thread(()->
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("YOGA");
				
				try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	});
		
		t1.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		t2.start();

	}

}
