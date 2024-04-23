// Practical: 3 - Java Program to Implement Different Types of Variables in Java Pragmatically 

public class JavaPractical3Variables
{

// Declaring the instance variables

int javaMarks; 
int vbnetMarks; 

// Declaring the static variables

public static int rollno; 
public static String name = "Hari";
public static void main(String args[]) 
{ 

// Declaring the local variables 

int computerhardwaremarks = 47;
int computerarchitecturemarks = 45;

// Accessing the static variable without an object 

JavaPractical3Variables.rollno = 10; 
System.out.println("Student's Name: "+ JavaPractical3Variables.name);
System.out.println("Student's Roll No: "+ JavaPractical3Variables.rollno);

// Accessing the local variables

System.out.println("Marks obtained in Computer Hardware: "+ computerhardwaremarks);
System.out.println("Marks ontained in Computer Architecture: "+ computerarchitecturemarks);

// Creating an object of a class for accessing instance variables

JavaPractical3Variables obj = new JavaPractical3Variables(); 
obj.javaMarks = 40; 
obj.vbnetMarks = 43; 

// Displaying the marks assigned in instance variables with the help of an object 

System.out.println("Marks obtained in Java: " +" "+ obj.javaMarks); 
System.out.println("Marks obtained in VB.NET: " +" "+ obj.vbnetMarks);           
} 
}