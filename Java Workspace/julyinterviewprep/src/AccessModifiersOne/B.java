package AccessModifiersOne;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
//		System.out.println(obj.a); Private is not visible outside the class
	}

}
