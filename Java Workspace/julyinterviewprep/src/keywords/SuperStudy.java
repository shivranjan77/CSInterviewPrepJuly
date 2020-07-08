package keywords;
class carLoan
{
	int rate;
	carLoan()
	{
		System.out.println("Hi I'm constructor of carLoan");
	}
	carLoan(int rate)
	{
		this.rate = rate;
	}
	void printRate() {
		System.out.println(this.rate);
	}
}
class homeLoan extends carLoan{
	int rate;
	homeLoan(){
		System.out.println("Hi I'm constructor of homeLoan");
		System.out.println(super.rate);
	}
	homeLoan(int rate)
	{
		super(12);// 3 - To invoke the constructor of parent class(must be 1st line of child constructor)
		this.rate = rate;
	}
	void printRate() {
		System.out.println(this.rate);
//		System.out.println("Parent Rate: "+super.rate);// 1 - Using super to access instance variable of parent class
		super.printRate(); // 2 - Using super to invoke methods of the parent class
	}
}
public class SuperStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homeLoan hl = new homeLoan(8);
		hl.printRate();
	}

}
