import java.io.*;



class Input
{


    public static void main(String[] args) throws IOException
        {
            String[] s = new String[100];
            BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Lines of text, 'stop' to quit.");
           
            for (int i = 0; i< 100;i++)
            {
                s[i] = br.readLine();
                if (s[i].equals("stop")) break;


            }
            System.out.println("\nHere is your file:");
            for (int i = 0; i < 100;i++) {
                if (s[i].equals("stop")) break;
                System.out.println(s[i]); 
            }

        }

}