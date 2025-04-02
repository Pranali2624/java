import java.io.FileInputStream;

public class fileinputstream 
    
    {
        public static void main(String [] args)
        {
            try {
                
                FileInputStream input = new FileInputStream("new.txt");
                 int i=0;
                 
                    while((i=input.read())!= -1)
                    {
                        System.out.println((char)i);

                    }
                    input.close();
                }
                 catch (Exception e){
                System.out.println(e);
                 }
            }
        }
    

