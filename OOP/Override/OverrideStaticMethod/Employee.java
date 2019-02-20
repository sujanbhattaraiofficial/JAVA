public class Employee
{
    int id;
    String name;
    String post;
    double salary;

    public Employee() // default constructor
    {
        this.id = 0;
        this.name = "unknown";
        this.post = "unknown";
        this.salary = 00000.0;

    }
    public Employee(int id, String name, String post, double salary)
    {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String toString() 
    {
        return "Id is : " + id + " , name is : " + name + " , post is : " + post + " and salary is : " + salary ;
    }

    public static void main(String[] args) {
        Employee obj = new Employee(1,"sujan bhattarai","manager",20.00);
        System.out.println(obj);
    }
}
  
