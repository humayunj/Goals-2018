import java.io.*;




class Output 
{

    public static void main(String[] main)
    {
       PrintWriter pw = new PrintWriter(System.out,true);
       pw.println("This is a string");
       int i = -1;

       pw.println(i);
       double d = 4.5e-7;
       pw.println(d);
    }
}