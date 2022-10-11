package basicprogrammes1;

//parent class
class company{
	
	//global variable declare here
	
	String companyname,owername;
	double annualamount;
	static int companyid;
	
	//static variable initializing value
	static {
		companyid=234908;
	}
	
	//constructor without parameter
	company()
	{
		System.out.println("Constructor Parameterless of Parent Class");
		System.out.println("*****************************************************************************************");
	}

	
	//constructor with 3 parameter and constructor overloading
	company(String oname,String cname,double anamount)
	{
		System.out.println("Constructor overloading of parent class");
		this.owername=oname;
		this.companyname=cname;
		this.annualamount=anamount;
		System.out.println("*********************************************************************************************");
		
	}
	
	//method without parameter
	public void display()
	{
		System.out.println("Company Details");
		System.out.println("*********************************************************************************************");
		
	}
	
	//method with 1 parameter and method overloading
  public void display(String city)
  {
	  //local variable declared and accessing value here from method parameter which will come from main method
	  String CityName=city;
	  
	  //static variable accessing here
	  System.out.println("Company ID "+companyid);
	  
	  //Using this.keywords and accessing value here
	  System.out.println("Company Name "+this.companyname);
	  System.out.println("Company Owner Name "+this.owername);
	  
	  //Without typing this.keyword we are accessing value of annualamount from constructor
	  System.out.println("Company Annual Amount "+annualamount);
	  
	  //local variable showing value here
	  System.out.println("Company City  "+CityName);
	  System.out.println("*************************************************************************************************");
	    
  }
}//parent class

//child class extends parent class
class employee extends company
{
	//global variable 
	double salary;
	String employeename,city,designation;
	
	//static variable
	static int employeeid;
	static {
		employeeid=345;
	}
	
	//constructor without parameter
		employee()
		{
			System.out.println("Constructor Parameterless of child class");
			System.out.println("*****************************************************************************************");
		}
		
		
		
		//constructor with 3 parameter and constructor overloading
		employee(String empnm,String dname,double sal,String Oname,String cname,double amt)
		{
			//using super()statement giving value too parent class constructor
			super(Oname,cname,amt);
			System.out.println("Constructor overloading of child class");
			this.employeename=empnm;
			this.designation=dname;
			this.salary=sal;
			System.out.println("*********************************************************************************************");
		}
		
		//Method without parameter
		public void display()
		{
			//calling super method parameterless here 
			super.display();
			System.out.println("Employee Details");
			System.out.println("*********************************************************************************************");
			
		}
		
		//method with 1 parameter and method overloading
	  public void display(String city)
	  {
		  //calling super method with parameter here using Super.keyword
		  
		  super.display(city);
		  
		  //local variable declared and accessing value here from method parameter which will come from main method
		  String CityName=city;
		  
		  //static variable accessing here
		  System.out.println("Employee ID "+employeeid);
		  
		  //Using this.keywords and accessing value here
		  System.out.println("Employee Name "+this.employeename);
		  System.out.println("Employee Designation"+this.designation);
		  
		  //Without typing this.keyword we are accessing value of annualamount from constructor
		  System.out.println("Employee Salary "+salary);
		  
		  //local variable showing value here
		  System.out.println("Employee CityName "+CityName);
		  System.out.println("*************************************************************************************************");
		  System.out.println("");
		  
		  
		  
	  }
}//child class ending

public class employeecompany1 {

	public static void main(String[] args) {
		
		
		//variable declared of parent and child class to give value too it
		String CName="oracle",OName="Larry Ellison",EName="John",City="USA",designation="Manager";
		double amt=1000000.09,sal=20000;
		
		//creating object/instance of child class and giving values too child and parent constructor
		
		
		company ec2=new employee(EName,designation,sal,OName,CName,amt);
		
		//accessing methods of child and parent class through object/instance of child class
		//ec1.display();
		ec2.display();
		
		ec2.display(City);

	}

}
