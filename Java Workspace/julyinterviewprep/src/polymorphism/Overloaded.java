package polymorphism;
class Shapes{ 
	double pi = 3.14;
	double getSquare(int r) {
		return r*r;
	}
	void calculate(int r)
	{
		System.out.println(pi*getSquare(r));
	}
//	int calculate(int r) Only return type different not allowed, Parameters must differ
//	{
//		return 10;
//	}
	void calculate(String s)//Method Overloading
	{
		System.out.println(s);
	}
	double calculate(int r,int h)//Method Overloading
	{
		return pi*getSquare(r)*h;
	}
	
}
public class Overloaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s = new Shapes();
		s.calculate(4);
		s.calculate("Hello");
		System.out.println(s.calculate(5, 5));
		
	}

}
