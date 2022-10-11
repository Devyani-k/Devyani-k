package basicprogrammes1;

/*Parent class*/

class demoparent
{
/* Global variable declared OF PARENT CLASS*/
	
	public int teachid;
	double salary;
	public String teachname,address;
	
/*static variable declare*/
	
	final static int age;
	
	/*static variable value is given here */
	static 
	{
		age=25;
	}
	
	/*constructor without parameterless*/
	
	public demoparent()
	{
		System.out.println("Parameter less constructor");
		System.out.println(" ");
	}
	
	/*constructor with one parameter and Using this() statement calling here */
	
	public demoparent(int teachid)
	{
		//this() using here
		
		this("Devyani",50000);
		System.out.println("Constuctor with 1 parameter ");
		System.out.println("Teacher id "+teachid);
		System.out.println(" ");
	}
	
	/*Constructor of this () statement giving value here*/
	
	public demoparent(String teachname, double salary)
	{
		System.out.println("Constructor with this() statement value ");
		System.out.println("Teacher name "+teachname);
		System.out.println("Teacher salary "+salary);
		System.out.println(" ");
	}
	
	/*Constructor using this.keyword*/
	
	public demoparent(int teachid,String teachname)
	{
		System.out.println("Constructor using this.keyword");
		this.teachid=teachid;
		this.teachname=teachname;
		System.out.println(" ");
	}
	
	/*static method without parameter*/
	
	static void show()
	{
		System.out.println("This is parametator less static method");
		int teachid=2045;
		String teachname="Sunanda";
		System.out.println("Teacher id "+teachid);
		System.out.println("Teacher name "+teachname);
		System.out.println("");
	}
	
	/*Static method overloading with parameter*/
	
	static void show(int teachid)
	{
		System.out.println("This is one parametator static method");
		int teacherid=teachid;
		String teachname="Priyanka";
		System.out.println("Teacher id "+teacherid);
		System.out.println("Teacher name "+teachname);
		System.out.println("");
		System.out.println("");
	}
	
	/*Method overloading with parameter*/
	
	public void display(int teachid,String teachname)
	{
		int teacherid=teachid;
		String teachername=teachname;
		int age=90;
		System.out.println("------------------Method Overloading with local variables --------------");
		System.out.println(" Teacher id "+teacherid);
		System.out.println("Teacher name "+teachername);
		System.out.println("Teacher age "+age);
		System.out.println("");
		
	}
	
	/*non static method with parameter with this.keyword value here*/
	
	public void display(double salary,String address)
	{
		double sal=salary;
		String addr=address;
		
		/*this keyword values are printing here with static variable value*/
		System.out.println("---------- method we are using this.keyword and static block value of a constructor-------------");
		System.out.println("Teacher id "+teachid);
		System.out.println("Teacher name "+teachname);
		System.out.println("Teacher age "+age);
		System.out.println("Teacher Salary "+sal);
		System.out.println("Teacher address "+addr);
		System.out.println("");
	}
	
	/*non static block of parent class */
	{
		System.out.println("");
		System.out.println("non static block of parent class ");
		System.out.println("");
	}
}

/*Child Class */

public class demoparentchildclass {
	
	/*global variable */
	int studid;
	String studname,studaddress;
	double fees;
	
	/*Static variable*/
	
	final static int studage;
	
	/*static variable initializing value*/
	static
	{
		studage=15;
	}

	/*Child class constructor without parameter less*/
	public demoparentchildclass()
	{
		System.out.println("Child class constructor without paremeter ");
		System.out.println("");
	}
	/*Constuctor with 1 parameter with this() statement */
	
	public demoparentchildclass(int studid)
	{
		this(5000,"Dev");
		System.out.println("Child class constructor with 1 paremeter ");
		System.out.println("Student id "+studid);
	}
	
	/*Constructor with 2 paremeter using this()*/
	public demoparentchildclass(double fee,String studname)
	{
		System.out.println("Child class constructor with 2 paremeter using this() statement");
		System.out.println("student name "+studname);
		System.out.println("Student Fee "+fee);
		System.out.println("");
                
	}
	
	/*Constructor using this.keyword */
	public demoparentchildclass(int studid,String studname)
	{
		System.out.println("Child class constructor with 2 paremeter using this.keyword ");
		this.studid=studid;
		this.studname=studname;
		System.out.println("");
	}
	
	/*child class static method without parametator*/
	static void show()
	{
		System.out.println("Student This is parametator less method");
		int studid=45;
		String studname="Heer";
		System.out.println("Student id "+studid);
		System.out.println("student name "+studname);
		System.out.println("");
	}
	
	/*Static method overloading */
	static void show(int studid)
	{
		System.out.println("Student This is parametator less method");
		int studentid=studid;
		String studname="Sahil";
		System.out.println("Student id "+studentid);
		System.out.println("student name "+studname);
		System.out.println("");
	}
	
	/*child class Method overloading */
	public void display(int studid,String studname)
	{
		int studentid=studid;
		String studentname=studname;
		int age=90;
		System.out.println("------------------Student Method Overloading with local variables --------------");
		System.out.println("Student id "+studentid);
		System.out.println("Student name "+studentname);
		System.out.println("Student age "+age);
		System.out.println("");
		
	}
	
	/*non static method with parameter*/
	public void display(double fee,String studaddress)
	{
		//method parameter giving value to local variable
		double fees=fee;
		String addr=studaddress;
		
		/*this keyword values are printing here*/
		System.out.println("---------- Student method we are using this.keyword and static block value of a constructor-------------");
		
		//this.keyword value is printing here
		System.out.println("student id "+studid);
		System.out.println("Student name "+studname);
		
		//static variable value is printing here
		System.out.println("student age "+studage);
		
		//method parameter value are printing here using local variable
		System.out.println("Student Salary "+fees);
		System.out.println("Student address "+addr);
		System.out.println("");
	}
	
	/*Main method body and execution program code is here*/

	public static void main(String[] args) {
		
		//variable declared of parent class
		
		int teachid=2500;
		String teachname="Ashwini",teachaddress="Ahmednagar";
		double salary=5000.05;
		
		//variable declared of child class
		int studid=25;
		String studname="Pandhurang",studaddress="Pandharpur";
		double studfee=5000.05;
		
		//Parent class object/instance creating and giving values too constuctor
		
		demoparent dp1=new demoparent();
		demoparent dp2= new demoparent(teachid);
		demoparent dp3=new demoparent(teachid,teachname);
		
		//parent class method calling by parent class object/instance
		
		dp1.show();
		dp2.show(teachid);
		dp1.display(teachid,teachname);
		dp3.display(salary,teachaddress);
		
		//Child class object/instance creating and giving value too constuctor 
		
		demoparentchildclass dc1= new demoparentchildclass();
		demoparentchildclass dc2=new demoparentchildclass(studid);
		demoparentchildclass dc3=new demoparentchildclass(studid,studname);
		
		//child class method calling by child class object/instance
		
		dc1.show();
		dc2.show(studid);
		dc1.display(studid,studname);
		dc3.display(studfee,studaddress);


	}
	/*non static block of parent class */
	{
		System.out.println("");
		System.out.println("non static block of child class ");
		System.out.println("");
	}

}
