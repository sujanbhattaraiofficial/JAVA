package desktop;

import java.io.*;


 class Desktop
{
   
    public static void main(String[] args) 
    {
        int count=0;
        File file = new File("C://Users//stha//Desktop");
        
        File[] files = file.listFiles();
        
        for (File f : files) 
        {
            System.out.println(f.getName());
            count++;
            
        }
        
        System.out.println("Total No of files="+count++);
    }
}