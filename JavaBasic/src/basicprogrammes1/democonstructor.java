package basicprogrammes1;

public class democonstructor 
 {
	
	/* Global variable declared */
	
	public int empid;
    double salary;
	public String empname,address;
	
/*static variable declare*/
	
	final static int age;
	
	/*Constructor without parametator */
	public democonstructor()
	{
		System.out.println("--------Constructor without parametator-------------------");
		System.out.println("Employee details as follows");
	}
	
	/*This.Keyword using constructor */
	public democonstructor(int empid,String empname) {
		// this keywords using
		System.out.println("-----------Constructor using this.keyword----------------------");
		this.empid=empid;
		this.empname=empname;
		System.out.println("");
		
	}

/*Constructor with 1 parametator */
	
	public democonstructor(int empid)
	{
		this(20000.5,"Devyani");
		System.out.println("----------Constructor with 1 parametator--------------------");
		System.out.println("employee id "+empid);
	}
	
/*constructor overloading */
	
	public democonstructor(double sal,String nm) 
	{
		System.out.println("----------Constuctor using this() with overloading ----------");
		System.out.println("Employee name "+nm);
		System.out.println("Employee salary "+sal);
		System.out.println("");
	}
	

	
	
	/*static block */
	
	static
	{
		age=30;
	}
	
	/*static method without parametator*/
	static void display()
	{
		System.out.println("This is parametator less method");
		int empid=2045;
		String empname="pinkey";
		System.out.println("employee id "+empid);
		System.out.println("employee name "+empname);
		System.out.println("");
	}
	
	/*Method overloading */
	public void display(int empid,String empname)
	{
		int id=empid;
		String name=empname;
		int age=90;
		System.out.println("------------------Method Overloading with local variables --------------");
		System.out.println("Employee id "+id);
		System.out.println("employee name "+name);
		System.out.println("Employee age "+age);
		System.out.println("");
		
	}
	
	
	
	/*non static method with parametator*/
	public void display(double salary,String address)
	{
		double sal=salary;
		String addr=address;
		
		/*this keyword values are printing here*/
		System.out.println("---------- method we are using this.keyword and static block value of a constructor-------------");
		System.out.println("Employee id "+this.empid);
		System.out.println("Employee name "+this.empname);
		System.out.println("Employee age "+age);
		System.out.println("Employee Salary "+sal);
		System.out.println("Employee address "+addr);
		System.out.println("");
	}
	

	public static void main(String[] args) {
		// variable declared
		int empid=2500;
		String empname="Ashwini",address="japan";
		double salary=5000.05;
		
		// creating constructor object/instance and calling it
		
		democonstructor dc1=new democonstructor();
		democonstructor dc2=new democonstructor(empid);
		democonstructor dc3=new democonstructor(empid,empname);
		
		//from object/instance calling method of class
		
		display();
		dc1.display(empid, empname);
		dc3.display(salary, address);
		
		

	}
	
	/*non static block */
	{
		System.out.println();
		System.out.println("This is non static block of program");
		System.out.println();
		
	}

}
