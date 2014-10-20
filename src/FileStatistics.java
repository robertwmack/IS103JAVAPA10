import java.io.File.*;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.io.*;

public class FileStatistics
{
	public static void main(String[] args)
	{
		try
		{
		File filePath =new File("H:\\chap13lab\\FileStatistics.txt");
		System.out.println("File Path " + filePath.getAbsolutePath());
		
		long dateTime = filePath.lastModified();
		Date d = new Date(dateTime);
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy, HH:mm:ss");
		String dateString = sdf.format(d);
		System.out.println("File Name = " + filePath.getName());
		System.out.println("Containing folder = " + filePath.getParent());
		System.out.println("Size of File " + filePath + " = " + filePath.length() + "kb");
		System.out.println("Last modified Date and Time: " + dateString);
		}
	
	catch(Exception e)
		{
		System.out.println(e);
		}
	}
}