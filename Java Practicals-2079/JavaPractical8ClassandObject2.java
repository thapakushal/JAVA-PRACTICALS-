
//Practical: 8 - Java Program to Define Class and Declare Object within Main Method of other Class in Java Pragmatically

//Defining  a class JavaPractical8ClassandObject2
public class JavaPractical8ClassandObject2
{  
 int id=25;  
 String name="Ram";  
}  
//Creating another class TechnnicalStudent which contains the main method  
class TechnnicalStudent
{  
public static void main(String[] args)
{  
  JavaPractical8ClassandObject2 s1=new JavaPractical8ClassandObject2();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}
