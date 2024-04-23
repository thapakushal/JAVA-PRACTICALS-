
//Practical: 10 -  Java Program to Compare String in Java by using == Operator

class JavaPractical10StringComparision2
{  
 public static void main(String args[])
 {  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   System.out.println(s1==s2); //Output will true because both refer to same instance
   System.out.println(s1==s3); //Output will be false because s3 refers to instance created in nonpool
 }  
}  