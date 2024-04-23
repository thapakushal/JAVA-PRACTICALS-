//Practical: 9 -  Java Program to Create an Object using newInstance() method of Constructor Class in Java Pragmatically
import java.lang.reflect.Constructor;  
public class ObjectCreationByNewInstanceMethodOfConstructor  
{  
String str=" Hello, its about object creation by using New Instance Method of Constructor Class.";  
public static void main(String args[])  
{  
try  
{  
Constructor<ObjectCreationByNewInstanceMethodOfConstructor> obj =ObjectCreationByNewInstanceMethodOfConstructor.class.getConstructor();  
ObjectCreationByNewInstanceMethodOfConstructor obj1 = obj.newInstance();  
System.out.println(obj1.str);  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}
