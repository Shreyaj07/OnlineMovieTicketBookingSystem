package javaSourseCode;

public class TicketInput {

	String Type;
	int price;
	public TicketInput() {
		// TODO Auto-generated constructor stub
	}
	public TicketInput(String type, int price) {
		super();
		Type = type;
		this.price = price;
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
