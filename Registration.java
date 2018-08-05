import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Registration {
	public static ArrayList<String> name_ar = new ArrayList<String>();
	public static ArrayList<String> password_ar = new ArrayList<String>();
	public static String name = null;
	public static String password = null;
	
	public static void register_Me()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		name = sc.nextLine();
		name_ar.add(name);
		System.out.println("Enter your password :");
		password = sc.nextLine();
		password_ar.add(password);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***Registration Successful!***");
		
		
		
	}
	public static String name()
	{
		return name;
	}
	public static ArrayList<String> name_ar()
	{
		return name_ar;
	}
	public static ArrayList<String> password_ar()
	{
		return password_ar;
	}

}
