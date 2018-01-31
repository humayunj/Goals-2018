import java.io.*;

//Copy Files and USE ARM -try with Resouce
class ARM
{

    public static void main(String[] args) {
        if (args.length != 2) { System.out.println("Specify from to"); return;}
        int c;
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                c = fin.read();
                if (c!=-1) fout.write(c);
            } while (c != -1);
        }
        catch (IOException e) { System.out.println("I/O Error: "+e);
        }
       
    }


}