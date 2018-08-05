
public class bookingDetails {
	
	public static void generateDetails() {
		
		if(Login.name()==null||bookTickets.movie_choice()==null||bookTickets.theater_choice()==null)
		{
			System.out.println("Oops..Something went wrong. Please try again!");
		}
		else
		{
		System.out.println("============================================================");
		System.out.println("\t\t\tYour booking details :");
		System.out.println("============================================================");
		System.out.println("NAME :\t\t\t\t" + Login.name());
		System.out.println("MOVIE BOOKED :\t\t\t" + bookTickets.movie_choice());
		System.out.println("THEATER :\t\t\t" + bookTickets.theater_choice());
		System.out.println("NUMBER OF TICKETS BOOKED :\t" + bookTickets.ticket_qty());
		System.out.println("_____________________________________________________________");
		System.out.println("\t\t\t\tTOTAL AMOUNT :");
		System.out.println("\t\t\t\t"+ bookTickets.amount());
		}
	}

}
