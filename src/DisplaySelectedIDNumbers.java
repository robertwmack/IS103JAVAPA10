import java.util.Scanner;
import java.io.*;
import java.nio.*;

public class DisplaySelectedIDNumbers extends Exception
{
	public static void main(String[] args)
	{
		try
		{
			int empID = 0;
			String emp;
			String[] emp1;
			
			String delimiter = ",";
			String[] result = new String[5];
			int i = 2;
			
			FileInputStream input = new FileInputStream("Employee.txt");
			DataInputStream in = new DataInputStream(input);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			
			System.out.println("Enter the employee ID in the file or -1 to exit: ");
			Scanner sc = new Scanner(System.in);
			empID = sc.nextInt();
			if (empID == -1)
				return;
			int matches = 0;
		while((emp = reader.readLine()) != null)
		{
			emp1 = emp.split(delimiter);
			emp1[i] = emp1[i].replaceAll("\\s+","");
		if(empID == Integer.parseInt(emp1[i]))
			{
			System.out.println(emp);
			matches++;
			}
		}
		if (matches == 0)
			System.out.println("No matches found");
			reader.close();
		}
		
		catch(Exception e)
			{
			System.out.println(e);
			}
	}
}

	class EmployeeIDNotFoundException extends Exception
	{
		public EmployeeIDNotFoundException()
			{
			super("Employee ID Not Found!");
			}
	
	public EmployeeIDNotFoundException(String message)
		{
		super(message);
		}
	}
	