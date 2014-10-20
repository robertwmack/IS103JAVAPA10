import java.util.Scanner;
import java.io.*;
import java.nio.*;

public class WriteEmployeeList
{
	//test for change
	
	
	public static void main(String[] args)
	{
		try
		{
			String fname = "";
			String lname = "";
			int empID = 0;
			String delimit = ", ";
			int count = 1;
			
		FileOutputStream output = new
		FileOutputStream("Employee.txt");
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		
		do
			{
			System.out.print("Enter Employee ID >>> ");
			Scanner emp = new Scanner(System.in);
			empID = emp.nextInt();
			
			System.out.print("Enter employee's first name >>> ");
			Scanner input = new Scanner(System.in);
			fname = input.nextLine();
			System.out.print("Enter employee's last name >>> ");
			Scanner input1 = new Scanner(System.in);
			lname = input1.nextLine();
			
			String s = lname + delimit + fname + delimit + empID;
			writer.write(s);
			writer.newLine();
			count++;
			}
		
			while(count <= 5);
			writer.close();
		}
		
		catch(Exception e)
			{
			System.out.println(e);
			}
	}
}