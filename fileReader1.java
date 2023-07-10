/* Read Data from a File */
import java.io.*;
class fileReader
{
    public static void main(String[] args) throws IOException {

          FileReader r=new FileReader("C:\\Users\\Abhi Gupta\\downloads\\AG.txt");
           
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.println((char)i);
                }
    }
}
