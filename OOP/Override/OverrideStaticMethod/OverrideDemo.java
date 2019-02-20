class Animal
{
    public static void testStaticMethod()
    {
        System.out.println("Static Method In Animal Class");
    }

    public void testInstanceMethod()
    {
        System.out.println("Instance Method In Animal Class");
    }
}

class Cat extends Animal
{
    public static void testStaticMethod()
    {
        System.out.println("Static Method In Cat Class");
    }

    public void testInstanceMethod()
    {
        System.out.println("Instance Method In Cat Class");
    }
}
 
 class OverrideDemo
{
    public static void main(String[] args) {
        Cat obj = new Cat();
        Animal obj1 = obj;
        Animal.testStaticMethod();
        obj1.testInstanceMethod();
    }
}