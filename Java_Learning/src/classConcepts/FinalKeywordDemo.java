package classConcepts;

class X      //Once you declare class as final another class cannot extend the class i.e final class X
{
	//final int i=1; //It becomes constant once final keyword assigned
	
	public final void show()   //Nobody will override your method when you declare method as final
	{
		
		System.out.println("Show A");
	}
	
}
class Y //extends X
{
	public void show()//will get an error
	{
		
		
	}
}

/*class Y extends X 
 * Cannot extend class X if it is final if anybody wants to extend your class
 *  and create object will take credit on behalf of you in that case you can meke your class as final
{
	
}
*/

public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		X a=new X();
		a.show();

	}

}
