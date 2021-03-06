package InterviewQues;

public class MaxSumSubarraySizek {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[] = {1,4,2,10,23,3,1,0,20};
//		int n= arr.length;
//		int k = 4;
//		int max_sum = Integer.MIN_VALUE;
//		for(int i=0;i<=n-k;i++) { //n-k times
//			int sum = 0;
//			for(int j=i;j<i+k;j++)  //k times
//			{
//				sum=sum+arr[j];
//			}
//			max_sum = Math.max(max_sum, sum);
//		} //O(n^2)
//		System.out.println(max_sum);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,2,10,23,3,1,0,20};
		int n= arr.length;
		int k = 4;
		int sum = 0;
		for(int i=0;i<k;i++)
		{
			sum = sum+arr[i];
		}
		int max_sum = sum;//Let max = sum of first window
		
		for(int i=k;i<n;i++)
		{
			sum = sum+arr[i]-arr[i-k];
			max_sum = Math.max(max_sum, sum); //Returns max of 2 values..
		} //O(n)
		System.out.println(max_sum);
	}

}
