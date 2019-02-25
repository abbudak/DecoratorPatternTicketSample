package ticket;

public class Lunch extends TicketDecorator{
	public Lunch(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String getTicketName() {
		return ticket.getTicketName() + ", with Lunch added";
	}

	@Override
	public double getPrice() {
		return ticket.getPrice() + 3;
	}

}
