import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	int ch;
	
	do
	{
		System.out.println("\n\n-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t\t\tEnter your choice:");
		System.out.println("-----------------------------------------------------------\n\n");
		System.out.println("1.LOGIN");	
		System.out.println("2.REGISTRATION");
		System.out.println("3.BOOK TICKETS");
		System.out.println("4.BOOKING DETAILS");
		System.out.println("5.EXIT\n\n\n");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
	ch = Integer.parseInt(br.readLine());
	switch(ch)
	{
	case 1: Login.log_In(); break;
	case 2: Registration.register_Me(); break;
	case 3:
	if(Login.checklogin()==0)
	{
		System.out.println("Please login first to book tickets.");
		break;
	}
	else
		{
		bookTickets.movieSelect(); break;
		}
		
	case 4: bookingDetails.generateDetails(); break;
	case 5:System.out.println("...Exit Successful.");
		   System.exit(0); break;
	default:System.out.println("Invalid Choice.");break;
	}
	}while(true);
	}

}
