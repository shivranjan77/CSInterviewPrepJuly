package inputFromUser;
import java.util.*;
public class ScannerStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		System.out.println(x);
//		double d = sc.nextDouble();
//		System.out.println(d);
//		String s = sc.next();
//		String s2 = sc.nextLine();
//		System.out.println(s);
//		System.out.println(s2);
		//next && nextLine give us string inputs
		//No need to parse if only numeric data
		int x = Integer.parseInt(sc.nextLine()); //String to int if possible
		System.out.println(x);
		float f = Float.parseFloat(sc.nextLine());
		System.out.println(f);
	}

}
