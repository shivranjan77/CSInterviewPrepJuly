package String;

public class FreqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HELLO";
		int arr[] = new int[26];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)-'A']++;
//			int x = s.charAt(i) - 'A';
//			arr[x]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
