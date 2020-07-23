package stack;
import java.util.*;
public class ClassStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		System.out.println(s.isEmpty());
		s.push(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.peek());
		for(Integer x:s) //For-each Loop, Enhanced For Loop
		{
			System.out.print(x+" ");
		}
	}

}
