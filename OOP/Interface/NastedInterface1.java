interface A
{
    public void show1();
}

interface B extends A
{
    public void show2();
}
class C implements B
{
    public void show1()
    {
        System.out.println("Inside Interface A");
    }
    public void show2()
    {
        System.out.println("Inside Interface B");
    }
    public void show3()
    {
        System.out.println("Inside Class c");
    }

}
public class NastedInterface1
{
    public static void main(String[] args) {
        C obj = new C();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}