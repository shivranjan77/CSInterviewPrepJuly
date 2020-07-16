package String;

public class StringRev {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "CipherSchools";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "CipherSchools";
		//Two Pointer Approach
		char arr[] = s.toCharArray();
		int l = 0;
		int r = arr.length-1;
		while(l<r)
		{
			char temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		//Array has the reversed String
		String rev = new String(arr);
		System.out.println(rev);
	}

}
