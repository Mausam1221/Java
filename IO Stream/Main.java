import java.io.FileInputStream;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) {
        try{
            FileInputStream InputStream =new FileInputStream("file.txt");
            int data = InputStream.read();
            while(data !=-1){
                data=InputStream.read();
            }
            InputStream.close();
        }
        catch(IOException e){
            //handle the exception
        }
    }
}