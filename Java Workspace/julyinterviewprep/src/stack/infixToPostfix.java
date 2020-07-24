package stack;

import java.util.*;

public class infixToPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		String res = "";
		String res=new String();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			//If it is a operand then add to String
			if(Character.isDigit(c))
			{
				res = res+c;
			}
			else {
				while(!st.isEmpty() && Precedence(st.peek())>=Precedence(c)) //Buzurg Pada hai top pe
				{
					res = res + st.pop(); //Add higher precedence to result
				}
				st.push(c);		
			}
		}
		while(!st.isEmpty())
		{
			res=res+st.pop(); //Remove all operators and add to list
		}
		System.out.println(res);
		
	}
	static int Precedence(char c)
	{
		if(c=='+' || c=='-') return 1;
		if(c=='/' || c=='*') return 2;
		return -1;
	}

}
