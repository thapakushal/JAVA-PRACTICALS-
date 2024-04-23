
//Practical: 10 -  Java Program to Illustrate Some Other Methods of String Class in Java Pragmatically

class JavaPractical10StringClassSomeOtherMethods
{  
 public static void main(String[] args)
 {  
 // Java Program to convert a string into uppercase and lowercase using toupperCase() and tolowerCase() methods
  String name1="Hari Sharma";    
  System.out.println(name1.toUpperCase()); //HARI SHARMA
  System.out.println(name1.toLowerCase()); //hari sharma 
  System.out.println(name1); //Hari Sharma, no change in original value of string

// Java Program to eliminate or trim white spaces using trim() method
  String name2="  Hari  ";    
  System.out.println(name2); //  Hari     
  System.out.println(name2.trim()); //Hari  

// Java Program to checks whether the string starts or ends with specific letter or letters using startswith() and endswith() methods
  String name3="Hari";    
  System.out.println(name3.startsWith("Ha")); //true    
  System.out.println(name3.endsWith("n")); //false

// Java Program to return a character at specified index using charAt() method
  String name4="Hari";    
  System.out.println(name4.charAt(0)); //H   
  System.out.println(name4.charAt(3)); //i    

// Java Program to covert given type such as int, long, float, double, boolean, char and char array into string using valueOf() method
  int a=20;    
  String str1=String.valueOf(a);    
  System.out.println(str1+80);    

// Java Program to replaces all occurrence of first sequence of character with second sequence of character using replace() method
  String str2="Java is a programming language...";      
  String str3=str2.replace("Java","C#"); //Replaces all occurrences of "Java" to "C#"      
  System.out.println(str3);    
}  
}    