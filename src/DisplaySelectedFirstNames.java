import java.util.Scanner;
import java.io.*;
import java.nio.*;

public class DisplaySelectedFirstNames extends Exception
{
	public static void main(String[] args)
	{
		try
		{
			String fname = "";
			String str;
			String[] str1 = new String[3];
			String[] str2 = new String[3];
			String delimiter = ", ";
			String[] result = new String[3];
			int i = 1;
			
			FileInputStream input = new FileInputStream("Employee.txt");
			DataInputStream in = new DataInputStream(input);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			
			System.out.println("Enter name of person you want >>> ");
			Scanner sc = new Scanner(System.in);
			fname = sc.nextLine();
			
		while((str = reader.readLine()) != null)
		{
			str1 = str.split(delimiter);
			str2 = str1;
			
			if(fname.equals(str2[i]))
			{
				System.out.println(str);
			}
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	class FirstNameNotFoundException extends Exception
	{
		public FirstNameNotFoundException()
		{
			super("FirstNameNotFound");
		}
		
	public FirstNameNotFoundException(String message)
		{
		super(message);
		}
	}	