package arrays;

public class ArrayStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 - Array Creation Expression
//		int arr[] = new int[5];
//		int []arr = new int[5];
		int arr[]; //Array Declaration Expression
		arr = new int[5]; //Creation of array object
		for(int i = 0;i<5 ;i++) //<=length-1 or <length
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0;i<5 ;i++)
		{
			arr[i] = i+1; //assigning values
		}
		for(int i = 0;i<5 ;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//2 - Array initializers list
		int A[] = {1 , 2 , 3};
		int n = A.length; // Calculating length of array
		for(int i = 0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
//		A = {1,2,3,4}; Not Allowed
		A = new int[]{1,2,3,4}; //Anonymous Arrays, generally used when reinitializing
		for(int i = 0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		int B[] = new int[2*A.length];
		for(int i = 0 ;i<A.length;i++)
		{
			B[i] = A[i];
		}
		B[4] = 5;
		B[5] = 6;
		A = B;
		for(int i = 0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}

}
