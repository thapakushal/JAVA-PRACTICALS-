
//Practical: 10 -  Java Program to Compare String in Java by using equals() Method

class JavaPractical10StringComparision1
{  
 public static void main(String args[])
 {  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
   System.out.println(s1.equals(s2)); //Output will be true  
   System.out.println(s1.equals(s3)); //Output will be true  
   System.out.println(s1.equals(s4)); //Output will be false  
 }  
}  
