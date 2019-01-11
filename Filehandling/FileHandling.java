
package filehandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileHandling {
    
   
    public static void main(String[] args) {
         Path path = Paths.get("C://Users//stha//Desktop");
         
    try(Stream<path> subPaths = Files.walk(path)){
        
    subPaths.forEach(System.out::println);
}
    catch(IOException e)
    {
        e.printStackTrace();
    }

    
        
    }
    
}
