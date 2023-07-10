/* Read Data from a File */
import java.io.*;
class fileReader
{
    public static void main(String[] args) {

        try
        {
            FileReader r=new FileReader("C:\\Users\\Abhi Gupta\\downloads\\AG.txt");
            try
            {
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.println((char)i);
                }
            }
            finally
            {
                r.close();
                System.out.println("file closed");
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled..!");
        }
    }
}
