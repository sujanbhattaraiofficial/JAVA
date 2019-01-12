import java.io.*;
import java.io.IOException;

class FileProperty
{
	public static void main(String[] args) {
		File f = new File("Programme.txt");
		try
		{
			
			if (f.createNewFile()) {
				System.out.println("File Created sucessFullly");
			}
				else
					System.out.println("File Already Created");
				
			}

			catch(IOException e)
			{
				System.out.println("Än error Occured");
				e.printStackTrace();
			}

			if (f.exists()) {
				System.out.println("Absolute Path="+f.getAbsolutePath());
				System.out.println("Length Of FIle="+f.length());
				System.out.println("Name Of File="+f.getName());
				System.out.println("Writeable: " + f.canWrite()); 
                System.out.println("Readable " + f.canRead()); 
				
			}

			else
              System.out.println("File Dosenot Exist");
		}
	}
