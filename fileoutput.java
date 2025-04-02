import java.io.FileOutputStream;
public class fileoutput {
   
    public static void main(String[] args)
    {
        String data ="this is a output of this file.";
    
        try {
            FileOutputStream output = new FileOutputStream ("new.txt");
            byte[] array= data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            {
                System.out.println(e);
            }
        }
    }
    
}
