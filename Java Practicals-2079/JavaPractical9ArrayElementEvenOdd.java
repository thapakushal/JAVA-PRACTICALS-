
//Practical: 9 - Java Program to Implement Array Processing through Identifying whether an Array Element is Even or Odd in Java Pragmatically 

public class JavaPractical9ArrayElementEvenOdd
{    
    public static void main(String args[]) 
	{        
	
	int a[]={1,2,5,6,3,2};  
	System.out.println("Even elements of array are:");  
	for(int i=0;i<a.length;i++)
	{  
		if(a[i]%2==0)
		{  
		System.out.println(a[i]);  
		}  
	}
	System.out.println("Odd elements of an array are:");  
	for(int i=0; i<a.length; i++)
	{  
		if(a[i]%2!=0)
		{  
		System.out.println(a[i]);  
		}  
	}  
    }    
}    