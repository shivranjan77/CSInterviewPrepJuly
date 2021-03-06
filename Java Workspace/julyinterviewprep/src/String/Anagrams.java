package String;

public class Anagrams {
	static boolean isAnagramOld(String s1,String s2)
	{
		if(s1.length()!=s2.length()) return false;
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		for(int i=0;i<s1.length();i++)
		{
			arr1[s1.charAt(i)-'A']++;
			arr2[s2.charAt(i)-'A']++;
		}
		//Check if both frequency arrays are equal
		for(int i=0;i<26;i++)
		{
			if(arr1[i]!=arr2[i]) return false;
		}
		return true;
	}
	static boolean isAnagramNew(String s1,String s2)
	{
		if(s1.length()!=s2.length()) return false;
		int arr[] = new int[26];
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)-'A']++; //Increment value for first String.
			arr[s2.charAt(i)-'A']--; //Decrement value for second String.
		}
		//Check if both frequency arrays are equal
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "LISTEN";
		String s2 = "SILENT";
		System.out.println(isAnagramNew(s1,s2));
	}

}
