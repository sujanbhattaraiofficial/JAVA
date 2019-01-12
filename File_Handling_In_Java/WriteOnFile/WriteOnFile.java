import java.io.*;
import java.io.IOException;


public class WriteOnFile
{
	public static void main(String[] args) {
		File f = new File("ABCD.txt");

		try
		{
			if (f.createNewFile()) {
				System.out.println("File Created SucceFully");
			}

			else
				System.out.println("Already Craeted");
		}

		catch(IOException e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}

		 

		try
		{
            if (f.exists()) {
			FileWriter w = new FileWriter("ABC.txt");
			w.write("Files in Java might be tricky, but it is fun enough!");
			w.close();
			System.out.println("SuccesFully Wrote on File Nanme="+f.getName());
		   }

		

		else {
			System.out.println("File is not Exist please try With existing file");
		  }
	   }
	   catch(IOException e)
	   {
	   	System.out.println("File Not Found");
	   	e.printStackTrace();
	    }

	   }
	}

