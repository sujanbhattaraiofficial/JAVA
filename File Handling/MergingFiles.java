import java.io.*;
public class MergingFiles
{
    public static void main(String[] args) {
        try
        {
            FileWriter fw = new FileWriter("ABC.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Sujan Bhattarai");

            bw.flush();
            bw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            File f = new File("XYZ.txt");
            PrintWriter pw =  new PrintWriter(f);

            FileReader fr = new FileReader("ABC.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while(line!=null)
            {
                if(line!=null)
                {
                    pw.println(line);
                    line = br.readLine();
                }
            }
            pw.flush();
            br.close();
            pw.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}