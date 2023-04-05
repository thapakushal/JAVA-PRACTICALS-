//Practicalo: 3 - Java Program to Implement Different Types of Variables in Java Pragmatically 

public class JavaPractical3Variables
 {
// These variables are instance variables
 int javaMarks; 
 int vbnetMarks; 
// These variables are static variables
public static int rollno; 
public static String name = "Hari";

public static void main(String args[]) 
{ 
// These variables are local variables 
int computerhardwaremarks = 47;
int computerarchitecturemarks = 45;
// Accessing static variable without object 
JavaPractical3.rollno = 10; 
System.out.println("Student's Name: "+ JavaPractical3.name);
System.out.println("Student's Roll No: "+ JavaPractical3.rollno);
// Accessing local variables
System.out.println("Marks obtained in Computer Hardware: "+ computerhardwaremarks);
System.out.println("Marks ontained in Computer Architecture: "+ computerarchitecturemarks);
//Creating first object for accessing instance variable
JavaPractical3 obj = new JavaPractical3(); 
obj.javaMarks = 40; 
obj.vbnetMarks = 43; 

// Displaying marks for object 
System.out.println("Marks obtained in Java: " +" "+ obj.javaMarks); 
System.out.println("Marks obtained in VB.NET: " +" "+ obj.vbnetMarks);           
} 
}
