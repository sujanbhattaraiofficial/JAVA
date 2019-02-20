 abstract class A
{
    public abstract void print();// only Defining method in Abstract Class.
}

class B extends A
{
    public void print()
    {
        System.out.println("Abstract Method Implementing in class B");
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.print();
    }
}