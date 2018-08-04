import java.io.*;

class Vector<T>
{
    private int Capacity = 2;
    private int Size = 0;
    private Object[] coll = new Object[2];
    
    public void Add(T obj)
    {
        if (Size >= Capacity) {
            Capacity *= 2;
            ResizeColl(Capacity);
        }
        setAt(Size,obj);
        Size++;
    }

    public T At(int i){
        if (i >= Size) return null;
        return (T)coll[i];
    }
    public int Size()
    {
        return Size;
    }

    private void ResizeColl(int NewSize)
    {
        Object[] t = new Object[NewSize];
        for (int i = 0; i < coll.length;i++)
        {
            if (i < t.length)
            t[i] = coll[i];
        }
        coll = t;
    }
    private void setAt(int i,T obj)
    {
        coll[i] = obj;
    }
}
public class VectorBasic
{
    public static void main(String[] args)
    {
        Vector<String> t = new Vector<String>();
        t.Add("Hello");
        t.Add("World");

        for (int i = 0; i < t.Size();i++) System.out.println(t.At(i));
    }
}