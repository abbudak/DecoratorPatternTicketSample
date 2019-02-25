package ticket;

public class FerryTicket extends Ticket {
	
	public FerryTicket() {
		ticketName = "Ferry Ticket";
	}
	
	@Override
	public double getPrice() {
		return 5;
	}
}
