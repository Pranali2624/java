
    
import java.io.FileWriter;
import java.io.Writer;
 public class  writer
{
public static void main(String[] args) {
    try{
    String data =" helllo welcome to the java programming";

    Writer output = new FileWriter("new.txt");
    output.write(data);
    output.close();
    }
    catch(Exception e){
        e.getStackTrace();
    }
}
}