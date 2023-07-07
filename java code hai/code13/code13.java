// WAP to write some text to a file and then read this file and print it
import java.io.*;
public class code13
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        String s="This is line 1\n This is line 2";

        FileOutputStream fout= new FileOutputStream("text.txt");

        for(int i=0;i<s.length();i++)
        {
            fout.write(s.charAt(i));
        }

        fout.close();

        FileInputStream fin=new FileInputStream("text.txt");
        int c;
        while((c=fin.read())!=-1)
        {
            System.out.print((char)c);
        }

        fin.close();
    }
}