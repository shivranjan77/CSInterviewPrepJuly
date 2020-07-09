package AccessModifiersOne;

public class A {
	int x = 10; // default or package private
	public int y = 15;
	protected int z = 20;
	private int a = 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.a);
	}

}
