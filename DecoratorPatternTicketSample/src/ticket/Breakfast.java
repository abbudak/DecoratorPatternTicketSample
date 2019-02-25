package ticket;

public class Breakfast extends TicketDecorator{
	
	public Breakfast(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String getTicketName() {
		return ticket.getTicketName() + ", with Drink added";
	}

	@Override
	public double getPrice() {
		return ticket.getPrice() + 2;
	}

}
