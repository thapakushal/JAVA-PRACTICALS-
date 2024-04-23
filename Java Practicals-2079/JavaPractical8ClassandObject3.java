
//Practical: 8 -  Java Program to Define Class and Declare Multiple Objects within Main Method of another Class with Primitive and Reference Variables in Java Pragmatically
class Rectangle
{  
 int length, width;  // Initializing primitive varibles
 void insert(int l,int w)
 {  
  length=l;  
  width=w;  
 }  
 void calculateArea()
 {
    System.out.println("The area of rectangle: " + length*width);
 }  
}  
public class JavaPractical8ClassandObject3
{  
 public static void main(String args[])
 {  
  Rectangle r1=new Rectangle(), r2=new Rectangle();//Initializing reference variables and creating multiple objects  
  r1.insert(11,5);  
  r2.insert(3,15);  
  r1.calculateArea();  
  r2.calculateArea();  
 }  
}
