package classConcepts;

class OuterClass
{
	
	public static void display() {
		System.out.println("Value Displayed");
	}
	
	static class InnerClass
	{
		public static void show() {
			System.out.println("Value Showed");
		}
	}
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		
		OuterClass obj=new OuterClass();
		obj.display();
		
		//OuterClass.InnerClass obj1=obj.new InnerClass();
		OuterClass.InnerClass obj1=new OuterClass.InnerClass();
		obj1.show();
		
		
		
	}

}
