package ticket;

public class Drink extends TicketDecorator {
	
	public Drink(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String getTicketName() {
		return ticket.getTicketName() + ", with Drink added";
	}

	@Override
	public double getPrice() {
		return ticket.getPrice() + 1;
	}

}
