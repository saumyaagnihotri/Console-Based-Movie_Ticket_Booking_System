import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Login {
	
	public static int login_flag =0;
	public static String name;
	public static void log_In() 
	{
		
		Scanner sc = new Scanner(System.in);
		String password;
		System.out.println("Enter your name :");
		name = sc.nextLine();
		System.out.println("Enter the password :");
		password = sc.nextLine();
		
		ArrayList<String> name_ar_temp = new ArrayList<String>(Registration.name_ar());
		ArrayList<String> password_ar_temp = new ArrayList<String>(Registration.password_ar());
		
		
		for(int i = 0; i< name_ar_temp.size(); i++)
			if((name.equals(name_ar_temp.get(i))==true)&&(password.equals(password_ar_temp.get(i))==true))
			{
				login_flag = 1;
			}
		System.out.println("Logging you in...\n\n");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(login_flag==1)
			System.out.println("***You are logged in.***");
		else
			System.out.println("Username and password do not match!!\nPlease register your account first.\n\n ");
	}
	public static int checklogin()
	{
		return login_flag;
	}
	public static String name()
	{
		return name;
	}
	

}
