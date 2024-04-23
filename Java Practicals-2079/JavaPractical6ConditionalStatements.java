//Practical: 6 - Java Program to Implement Different Types of Conditional Statements in Java Pragmatically

public class JavaPractical6ConditionalStatements
{  
public static void main(String[] args) 
{  
	
//Java Program to Demonstrate If Statement

int  num=12; //Defining a variable and assigning value to it
if(num%2==0) //Checking the condition to identify a number is even
{  
System.out.print("The number is even");  
}  
System.out.println("\n"); 

//Java Program to Demonstrate If-Else Statement

int  num1=9; //Defining a variable and assigning value to it 
if(num1%2==0) //Checking the condition to identify a number is even or odd
{  
System.out.print("The number is even");  
} 
else
{
System.out.print("The number is odd");  
}
System.out.println("\n"); 
  
// Java Program to Demonstrate If-Elseif Statement

int marks=8; //Defining a variable and assigning value to it
if(marks<50) //Checking the different condition to identify a nummber is less than 50 or 60 or 70 or 80 or 90 or 100
{  
System.out.println("The grade is: Fail");  
}      
else if(marks>=50 && marks<60)
{  
System.out.println("The garde is: D ");  
}  
else if(marks>=60 && marks<70)
{  
System.out.println("C grade");  
}  
else if(marks>=70 && marks<80)
{  
System.out.println("The garde is: B");  
}  
else if(marks>=80 && marks<90)
{  
System.out.println("The garde is: A");  
}
else if(marks>=90 && marks<100)
{  
System.out.println("The garde is: A+");  
}
else
{  
System.out.println("The marks entered is invalid!!!");  
}  
System.out.println("\n"); 
	
//Java Program to Demonstrate Nested If Statement

int age=15;  //Defining a variable and assigning value to it
boolean a=false; //Declaring a variable for school enrollment status 
if(age>=3 && age<=20) //Applying condition on age required for schooling 
{    
if(a==true) //Applying condition on school enrollment status required for schooling 
{  
System.out.println("The children having school level education");  
} 
else   
{
System.out.println("The children not having age for school level education");  
}
}
System.out.println("\n"); 

//Java Program to Demonstrate Switch Case Statement

int day=4; //Declaring a variable and assigning value to it 
String dayString="";  
switch(day) //Switch statement  
{  
//Case statements within the switch block  
case 1: dayString ="1        - Sunday";    
break;    
case 2: dayString ="2 - Monday";  
break;    
case 3: dayString ="3 - Tuesday";  
break;    
case 4: dayString ="4 - Wednesday";  
break;    
case 5: dayString ="5 - Thursday";  
break;    
case 6: dayString="6 - Friday";  
break;    
case 7: dayString ="7 - Saturday";  
break;    
default:System.out.println("Invalid Weekday!!!");    	
}       
System.out.println(dayString); //Printing a weekday for the given number  
}  
}
