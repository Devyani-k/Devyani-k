package basicprogrammes1;
import java.util.*;

public class takearrayfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i;
		
		//taking scanner class for taking value from user to count the number in i
		
		Scanner sc1=new Scanner(System.in);
		//puting values in variable
		number=sc1.nextInt();
		
		 int array1[]=new int[10];
		 
		 System.out.println("Enter the value of array elements");
		 
		 for(i=0;i<number;i++) 
		 {
			 array1[i]=sc1.nextInt();
		 }
		 
		 System.out.println("Print Elements Of Array");
		 
		 for(i=0;i<number;i++)
		 {
			 System.out.println(" "+array1[i]);
		 }
	}

}
