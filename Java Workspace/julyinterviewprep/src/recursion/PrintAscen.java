package recursion;

public class PrintAscen {

	static void fun(int n)
	{
		if(n<=0) return; //A
		fun(n-1); //B
		System.out.print(n+" "); //C
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5); // Keep the recursion call same, but print in ascending order
	}


}
