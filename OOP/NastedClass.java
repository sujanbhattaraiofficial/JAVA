class Outer
{
    int outer = 20;
    void display()
    {
        Inner obj = new Inner();
        obj.show();
    }
    class Inner
    {
        int inner = 30;
        void show()
        {
            System.out.println("OuterValue="+outer);
            System.out.println("InnerValue="+inner);
        }
    }
}
public class NastedClass
{
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.display();
    }
}