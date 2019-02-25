package ticket;

public class PlaneTicket extends Ticket {

	public PlaneTicket() {
		ticketName = "Plane Ticket";
	}
	
	@Override
	public double getPrice() {
		return 10;
	}

}
