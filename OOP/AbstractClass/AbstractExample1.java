
abstract class AbstractExample
{
	private String name;
	private long page;
	private String p;

	public String getName() {
		return name;
	}

	
	public long getPage() {
		return page;
	}
	
	
	public String getP() {
		return p;
	}
	
	
	public AbstractExample(String name, long page, String p) {
		this.name = name;
		this.page = page;
		this.p = p;
	}
	public abstract void getBookType();
	
}
class Novel extends AbstractExample
{

	public Novel(String name, long page, String p) {
		super(name, page, p);
		
	}
	public void getBookType()
	{
		System.out.println("type is : " + getClass().getName());

		System.out.println(getName());
		System.out.println(getPage());
		System.out.println(getP());
		
	}
	
	
}
public class AbstractExample1
{
	public static void main(String[] args) {
		Novel obj =  new Novel("Sujan Bhattarai", 45678, "xyz");
		obj.getBookType();
	}
}