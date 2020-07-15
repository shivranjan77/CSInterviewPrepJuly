package recursion;

public class fibonacci {
	static int fib(int n)
	{	
//		if(n==0) return 0;//return n;
//		if(n==1) return 1;//return n;
		if(n<=1) return n;
		
//		int a = fib(n-1);
//		int b = fib(n-2);
//		int ans = a+b;
//		return ans;
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(fib(n));
	}

}
