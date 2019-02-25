package ticket;

public abstract class Ticket {
	String ticketName = "";
	
	public String getTicketName() {
		return ticketName;
	}
	
	public abstract double getPrice();

}
