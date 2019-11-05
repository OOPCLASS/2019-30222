package pack;

public class SavingsAccount extends Account implements Updateable {

	private double interest=0.0;
	
	public SavingsAccount(int number) {
		super(number);
	}
 
	 public void addInterest (double interest)
	 {
		 if(interest<=0)
		 {
			 System.err.println("SavingsAccount.addInterst(..): can't have a negative interest ");
		 }
		 else
	     {
			 this.interest+=interest;
		 }
	 }
	 
	 public double getInterest ()
	 {
		 return this.interest;
	 }

	@Override
	public void update() {
		this.addInterest(65);
	}
	 
	 
	

}
