package basicprogrammes1;
/*Multilevel Inheritances */
/*GrandParent Class here */
class subjectstudent
{
	//Global variable declared
	int chapter;
	String subjectname;
	
	//static variable declared 
	static int subjectid;
	
	//static variable assigning value too it
	static
	{
		subjectid=9901;
	}
	
	/*grandparent constructor with parameter and this.Keyword giving value to it */
	
	subjectstudent(String subjectname)
	{
		
		this.subjectname=subjectname;
		
	}
	
	/*grandparent method with 1 parameter and this.keyword value and static variable value*/
	
	public void display(int chapter)
	{
		int chpt=chapter;
		System.out.println("");
		System.out.println("Details of Subject");
		
		//static variable value is printing here
		System.out.println("Subject id "+subjectid);
		
		//this.keyword value is printing here
		System.out.println("Subject name  "+subjectname);
		
		//method parameter value are printing here with the help of local variable
		System.out.println("Subject Chapter "+chpt);
		System.out.println("");
		
	}
	
}//grandparent class ending

/*Parent Class here inheritance extending grandparents class*/
class marks extends subjectstudent
{
	//global variable declared here
	
	int mark;
	
	/*parent class constructor with parameter and using 
	this keyword giving value to it and using super keyword to give value too grandparent class constructor*/
  public marks(String subjectname,int mark)
	{
	  //giving parameter too parent class using super() keyword
	  super(subjectname);
	  
	  //this.keyword using too give value to parameter
		this.mark=mark;
	}
  
  //parent class method calling by child class object/instance
   public void display(int chapter)
   {
	   //using Super keyword to give value to parameter and to display method value also
	   super.display(chapter);
	   System.out.println("Mark details");
	   System.out.println("student Mark "+mark+" out of 100");
	   System.out.println("");
	   
   }
}//parent class ending


/*Child Class here extends parent class*/
public class Studentinhertanceclass1 extends marks {

	//global variable
	int studid,mark;
	String Studname,subjectnm;
	
	/*child class constructor with parameter and using 
	this keyword giving value to it and using super keyword to give value too super class
	(parent and grandparent)constructor*/
	
	public Studentinhertanceclass1(int studid,int mark,String subjectname,String studname)
	{
		//super() keyword giving value here to grandparent and parent class 
		
		super(subjectname,mark);
		
		//using this keyword
		this.studid=studid;
		this.Studname=studname;
	}
	
	//child class method calling by child class object/instance
	public void display(int chapter)
	{
		//using Super keyword to give value to parameter and to display method value also
		super.display(chapter);
		System.out.println("Student details with subject details and mark obatained ");
		System.out.println("Student id "+studid);
		System.out.println("Student name "+Studname);
	}

	//main method body and execution program here with class object creating and calling class method through object
	public static void main(String[] args) {
		
		// variable declare here too give too constructor and method
		int studentid=35,chapter=5,mark=45;
		String studentname="Devyani",subname="Java";
		
		//creating object/instance of constructor
		
		Studentinhertanceclass1 s1= new Studentinhertanceclass1(studentid,mark,subname,studentname);
		
		//child class method calling by child class object/instance
		s1.display(chapter);
		

	}

}//child class ending
