package ticket;

public class Main {

	public static void main(String[] args) {
		Ticket planeTicket = new PlaneTicket();
		System.out.println("Your Ticket's Name: "+ planeTicket.getTicketName());
		System.out.println("Your Ticket's Price: "+ planeTicket.getPrice());
		
		Ticket planeTicket2 = new PlaneTicket();
		planeTicket2 = new Breakfast(planeTicket2);
		System.out.println("Your Ticket's Name: "+ planeTicket2.getTicketName());
		System.out.println("Your Ticket's Price: "+ planeTicket2.getPrice());
		planeTicket2 = new Drink(planeTicket2);
		System.out.println("Your Ticket's Name: "+ planeTicket2.getTicketName());
		System.out.println("Your Ticket's Price: "+ planeTicket2.getPrice());
		planeTicket2 = new Lunch(planeTicket2);
		System.out.println("Your Ticket's Name: "+ planeTicket2.getTicketName());
		System.out.println("Your Ticket's Price: "+ planeTicket2.getPrice());
		
		Ticket ferryTicket = new FerryTicket();
		System.out.println("Your Ticket's Name: " + ferryTicket.getTicketName());
		System.out.println("Your Ticket's Price: "+ ferryTicket.getPrice());

		Ticket ferryTicketWithBreakfastLunchDrink = new Breakfast(new Lunch(new Drink(ferryTicket)));
		System.out.println("Your Ticket's Name: " + ferryTicketWithBreakfastLunchDrink.getTicketName());
		System.out.println("Your Ticket's Name: " + ferryTicketWithBreakfastLunchDrink.getPrice());
		
		

	}

}
