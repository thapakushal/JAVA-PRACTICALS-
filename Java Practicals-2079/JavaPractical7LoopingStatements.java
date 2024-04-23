//Practical: 7 - Java Program to Implement Different Types of Looping Statements in Java Pragmatically
public class JavaPractical7LoopingStatements
{  
public static void main(String[] args) 
{  

//Java Program to Demonstrate While Loop

int i1=0; //Defining a variable and assigning value to it
while(i1<=9) //Testimg the condition to identify variable's value is less or equal to 9
{  
System.out.println(i1);  
i1++; //Incrementing the variable's value by 1
} 
System.out.println("\n"); 
	
//Java Program to Demonstrate For Loop	

for(int i2=0;i2<=9;i2++) //Defining a varibale, Testimg the condition to identify variable's value is less or equal to 9 and Incrementing the variable's value by 1
{  
System.out.println(i2);  
}  
System.out.println("\n"); 

//Java Program to Demonstrate Do While Loop

int i3=0; //Defining a variable and assigning value to it
do
{  
System.out.println(i3);  
i3++; //Incrementing the variable's value by 1
}
while(i3<=9); //Testimg the condition to identify variable's value is less or equal to 9
}  
}
