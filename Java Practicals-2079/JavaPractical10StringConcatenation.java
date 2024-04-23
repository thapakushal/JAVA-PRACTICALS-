
//Practical: 10 -  Java Program to Concate String in java by concate() Method 

class JavaPractical10StringConcatenation
{  
 public static void main(String[] args)
 {  
   String name="Hari"+"sharma"; //String concatenation by using + operator
   System.out.println(name); //Output will be Hari Sharma 

   String Firstname="Hari";  
   String Lastname="Sharma";  
   String Fullname=Firstname.concat(Lastname); //String concatenation by using concat()method 
   System.out.println(Fullname); // Outpur will be Hari Sharma
 }  
}  