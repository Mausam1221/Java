import java.io.FileOutputStream;
import java.io.IOException;

public class Mainn
{
    public static void main(String[] args)
    {
        try{
            FileOutputStream outputStream=new FileOutputStream("file.txt");
            outputStream.write("Hello World".getBytes());
            outputStream.close();
            outputStream.close();
        }
        catch(IOException e){
            //handle the exception
        }
    }
}
