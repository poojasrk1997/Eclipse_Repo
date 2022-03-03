package classConcepts;

class A{
	public void show()
	{
		System.out.println("in A");
	}
	
}

class B extends A{
	
	public void show()
	{
		System.out.println("in B");
	}
	
}

class C extends A{
	
	public void show()
	{
		System.out.println("in C");
	}
	
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		A obj=new B(); //runtime polymorphism
		obj.show();
	
		obj=new C();
		obj.show();  //Dynamic method dispatch
		
	}

}
