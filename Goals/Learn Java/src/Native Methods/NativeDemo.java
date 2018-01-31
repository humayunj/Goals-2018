

public class NativeDemo
{
    int i;
    public static void main(String args[]) throws Exception
    {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("This is ob.i before native Method:" + ob.i);
        ob.test();
        System.out.println("This is ob.i after native method:"+ob.i);
        System.in.read();
    }
    public native void test();
    static {
        System.loadLibrary("NativeDemo");
    }
}