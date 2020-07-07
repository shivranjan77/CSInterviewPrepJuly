package polymorphism;

class Shape{ //Parent Class, Base Class
	double pi = 3.14;
	double getSquare(int r) {
		return r*r;
	}
}
class Circle extends Shape{ //Child Class, Derived Class
	void area(int r)//Overridden method
	{
		System.out.println(pi*getSquare(r));
	}
}
class Sphere extends Circle // Multi-Level Inheritance 
{
	void area(int r)//Overriding Method
	{
		super.area(r);//Super is used to refer to the immediate parent class
		System.out.println(4*pi*getSquare(r));
	}
}
public class PolyPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere s = new Sphere();
		s.area(10);
	}

}
