
//Practical: 10 -  Java Program to Compare String in java by compareTo() Method

class JavaPractical10StringComparision3
{  
 public static void main(String args[])
 {  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2)); //Outpur will be 0 because s1==s2
   System.out.println(s1.compareTo(s3)); //Output will be 1 because s1>s3  
   System.out.println(s3.compareTo(s1)); //Output will be -1 because s3<s1   
 }  
}
