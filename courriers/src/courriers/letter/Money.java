package courriers.letter;

public class Money implements Content{

	private double amount;
	
	public String description() {
		// TODO Auto-generated method stub
		return "Money " + amount + "€.";
	}
	
	public double getAmount(){
		return amount;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}
}
