import java.util.Scanner;
import java.io.*;
import java.nio.*;

public class DisplaySavedEmployeeList
{
	public static void main(String[] args)
	{
		try
		{
			String s = "";
			FileInputStream input = new FileInputStream("Employee.txt");
			
			DataInputStream in = new DataInputStream(input);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			s = reader.readLine();
			
			while(s != null)
			{
				System.out.println(s);
				s = reader.readLine();
			}
			in.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}