import java.io.*;

//Copy Files
class FIO
{

    public static void main(String[] args) {
        if (args.length != 2) { System.out.println("Specify from to"); return;}
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int c;
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                c = fin.read();
                if (c!=-1) fout.write(c);
            } while (c != -1);
        }
        catch (IOException e) { System.out.println("I/O Error: "+e);
        }
        finally {
            try {
                if (fin!=null) fin.close();
                if (fout!=null) fout.close();
            } catch (IOException e) {
                System.out.println("Error closing files "+ e);
            }
        }
    }


}