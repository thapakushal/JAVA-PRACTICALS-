//Practical: 9 -  Java Program to Create an Object using Class.newInstance() Method in Java Pragmatically
public class ObjectCreationByNewInstanceMethod  
{  
String str=" Hello, its about object creation using New Instance Method.";  
public static void main(String args[])  
{  
try  
{  
//creating object of class  
ObjectCreationByNewInstanceMethod obj= ObjectCreationByNewInstanceMethod.class.newInstance();   
System.out.println(obj.str);          
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  

    