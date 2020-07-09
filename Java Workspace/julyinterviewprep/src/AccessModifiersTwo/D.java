package AccessModifiersTwo;
import AccessModifiersOne.A;

public class D extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
//		System.out.println(A.x); // Default is not visible outside the package
		System.out.println(obj.y);
//		System.out.println(obj.z);
		D obj2 = new D();
		System.out.println(obj2.z); // We can access protected members using child class only, in external package
	}

}
