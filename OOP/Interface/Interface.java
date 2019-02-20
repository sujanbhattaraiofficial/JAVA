interface A
{
   public void show(); // Defining Interface Method.
}

 class B implements A
{
   public void show()
    {
        System.out.println("Interface Method implements in class B");
    }
}
public class Interface
{
    public static void main(String[] args) {
        B obj = new B(); // we cannot create object of interface.
        obj.show();
    }
}
