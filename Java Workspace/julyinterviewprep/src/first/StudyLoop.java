package first;

public class StudyLoop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Loop
		int i;
		for(i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		//Loop Breaks When I becomes 101
		System.out.println("After Loop" + i);
		for(i=0;i<100;i++)
		{
			System.out.println(i);
		}
		System.out.println("After Loop 2: " + i);
		
		//While Loop
		int n=5;
		while(n>0)
		{
			System.out.println("Hello");
			n--;
		}
		System.out.println(n);
		
		//Do-While Loop
		n=5;
		do{
			System.out.println("Hi");
			n--;
		}while(n>0);
		
		//Diff bw while & Do While
		n=0;
		while(n>0)
		{
			System.out.println("In While");
			n--;
		}
		//Do-While Loop
		//It runs atleast once.
		n=0;
		do{
			System.out.println("Inside Do-While");
			n--;
		}while(n>0);
		
		for(int j=6;j>0;j-=2)
		{
			System.out.print(j+" ");
		}
	}

}
