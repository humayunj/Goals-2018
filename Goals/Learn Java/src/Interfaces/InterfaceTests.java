

interface MyInterface
{
    void show();
    void showExt();
}

class MyClass implements MyInterface
{
    public void show(){ System.out.println("Hello");}
    public void showExt() { System.out.println("Hello World!!");}
}


public class InterfaceTests
{

    public static void main(String[] args)
    {
        MyClass cls = new MyClass();
        cls.show();;
        cls.showExt();
    }
}