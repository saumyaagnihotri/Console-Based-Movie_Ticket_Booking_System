import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class bookTickets {
	
	public static int ch2;
	public static int ch3;
	public static int amount;
	public static int ticket_qty;
	public static int available_tickets = 5;
	public static void movieSelect() throws NumberFormatException, IOException
	{
		
	Scanner sc = new Scanner(System.in);
	BufferedReader br2 = new  BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("\t\t\t::::MOVIES::::\n\n");
	System.out.println("1. Titanic\t\t\t\t\tRs.200");
	System.out.println("2. Sanju\t\t\t\t\tRs.300");
	System.out.println("3. Mission: Impossible – Fallout\t\tRs.400");
	System.out.println("4. Padmaavat\t\t\t\t\tRs.700");
	System.out.println("5. The Chronicles of Narnia\t\t\tRs.200");
	System.out.println("\n***Select a movie.***");
	ch2 = Integer.parseInt(br2.readLine());
	if(ch2>5)
	{
		System.out.println("Invalid Choice!");
	}
	else
	{
		Theater(ch2);
	}
	}
	public static void Theater(int ch2)
	{
		System.out.println("\t\t\t::::THEATERS::::\n\n");
		System.out.println("1. Cinemax");
		System.out.println("2. PVR");
		System.out.println("3. Inox");
		System.out.println("4. Cinepolis");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("\n***Select the theater.***");
		ch3 = sc2.nextInt();
		if(ch3>4)
		{
			System.out.println("Invalid Choice");
		}
		else
		{
			checkTickets(ch2);
		}
	}
	public static void checkTickets(int ch2)
	{
		Scanner sc = new Scanner(System.in);
		int price = 0;
		switch(ch2)
		{
		case 1: price = 200;break;
		case 2: price = 300; break;
		case 3: price = 400;break;
		case 4: price = 700;break;
		case 5: price =200;break;
		
		}
		System.out.println("Enter the number of tickets to be booked :");
		ticket_qty =sc.nextInt();
		if(available_tickets < ticket_qty)
		{
			System.out.println("We're sorry, but there are no tickets available");
			System.exit(0);
		}
		
		int left_tickets = available_tickets - ticket_qty;
		
		amount = ticket_qty*price;
		System.out.println(".....Booking " + ticket_qty + " tickets.");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***Booking Successful!!***");
		
		
	}
	public static String movie_choice()
	{
		String mov = null;
		switch(ch2)
		{
		case 1: mov = "Titanic" ;break;
		case 2: mov = "Sanju" ;break;
		case 3: mov = "Mission: Impossible – Fallout" ;break;
		case 4: mov = "Padmaavat" ;break;
		case 5: mov = "The Chronicles of Narnia" ;break;
		}
		return mov;
	}
	public static String theater_choice()
	{
		String theat = null;
		switch(ch2)
		{
		case 1: theat = "Cinemax" ;break;
		case 2: theat = "PVR" ;break;
		case 3: theat = "Inox" ;break;
		case 4: theat = "Cinepolis" ;break;
		
		}
		return theat;
	}
	public static int amount()
	{
		return amount;
	}
	public static int ticket_qty()
	{
		return ticket_qty;
	}
	
	
	

}
