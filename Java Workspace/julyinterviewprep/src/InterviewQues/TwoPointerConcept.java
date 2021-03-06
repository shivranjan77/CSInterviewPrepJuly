package InterviewQues;

public class TwoPointerConcept {
	static boolean isPairSum(int arr[],int sum)
	{
		int l = 0;
		int r = arr.length-1;
		while(l<r)
		{
			if(arr[l]+arr[r]==sum) return true;
			else if(arr[l]+arr[r]<sum) 
			{
				l++;
			}
			else {
				r--;
			}
			
		} //Time Complexity - O(n)
		return false;
	}
//	static boolean isPairSum(int arr[],int sum)
//	{
//		int n = arr.length;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i]+arr[j]==sum) return true;
//			}
//		} //Time Complexity - O(n^2)
//		return false;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,35,50,75,80};
		int n = arr.length;
		int sum = 135;
		System.out.println(isPairSum(arr,sum));
	}

}
