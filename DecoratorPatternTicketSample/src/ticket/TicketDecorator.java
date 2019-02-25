package ticket;

public abstract class TicketDecorator extends Ticket{
	
	protected Ticket ticket;
	

	 @Override
	 public abstract String getTicketName();
}
