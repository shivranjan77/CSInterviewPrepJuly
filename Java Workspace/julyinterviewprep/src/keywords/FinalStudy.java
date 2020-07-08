package keywords;
class A
{
	final int x; //Final Variables - Value once assigned cannot be changed
	//Values can be assigned only at the time of declaration or inside constructors.
	A()
	{
		x = 5;
	}
	final void fun() //Final methods cannot be overridden in subclasses
	{
		System.out.println("Fun of A");

	}
}
final class B extends A //Final class cannot be inherited
{
//	void fun()
//	{
//		System.out.println("Fun of B");
//	}
}
//class c extends B{
//}
public class FinalStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
