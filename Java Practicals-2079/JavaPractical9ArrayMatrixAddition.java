
//Practical: 9 - Java Program to Implement Array Processing through Adding Two 3*3 Matrices using Array in Java Pragmatically 

public class JavaPractical9ArrayMatrixAddition 
{    
    public static void main(String args[]) 
	{        
	
	//Creating two matrices  
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
	int b[][]={{10,11,12},{13,14,15},{16,17,18}};
	  
	//Creating another matrix to store the sum of two matrices  
	int c[][]=new int[2][3];  
	  
	//Adding and printing addition of 2 matrices  
	for(int i=0; i<2; i++)
	{  
		for(int j=0; j<3; j++)
		{  
			c[i][j]=a[i][j]+b[i][j];  
			System.out.print(c[i][j]+" ");  
		}  
	System.out.println(); // Printing new line  
	}   
    }    
}    