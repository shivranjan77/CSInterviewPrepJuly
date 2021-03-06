package stack;
import java.util.*;

class evaluatePostfix {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t>0)
		{
		    String s = sc.nextLine();
		    Stack<Integer> st = new Stack<>();
		    for(int i=0;i<s.length();i++)
		    {
		        char c = s.charAt(i);
		        //If operand then push to stack
		        if(Character.isDigit(c)) //If b/w 0-9
		        {
		            st.push(c-'0'); //Character to Integer
		        }
		        else//Operator found
		        {
		            int right = st.pop();
		            int left = st.pop();
		          //  int res = calculate(left,right,c);
		            switch(c)
		            {
		                case '+':
		                    st.push(left+right);
		                    break;
		                case '-':
		                    st.push(left-right);
		                    break;
		                case '*':
		                    st.push(left*right);
		                    break;
		                case '/':
		                    st.push(left/right);
		                    break;
		            }
		          //  st.push(res);
		        }
		    }
		    System.out.println(st.pop());
		    t--;
		}
	}
// 	static int calculate(int left, int right, char c)
// 	{
// 	    if(c=='+') return left+right;
// 	    if(c=='-') return left-right;
// 	    if(c=='*') return left*right;
// 	    if(c=='/') return left/right;
// 	    return -1;
// 	}
}