package String;

public class Palindrome {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "MALAYALAM";
//		//Two Pointer Approach
//		char arr[] = s.toCharArray();
//		int l = 0;
//		int r = arr.length-1;
//		while(l<r)
//		{
//			char temp = arr[l];
//			arr[l] = arr[r];
//			arr[r] = temp;
//			l++;
//			r--;
//		}
//		//Array has the reversed String
//		String rev = new String(arr);
//		if(rev.equals(s))
//		{
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SNRRD";
		//Two Pointer Approach
		int l = 0;
		int r = s.length()-1;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				System.out.println("Not Palindrome");
				return;// Stop the function
			}
			l++;
			r--;
		}
		System.out.println("Palindrome");
	}

}
