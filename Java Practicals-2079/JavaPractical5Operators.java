
//Practical: 5 - Java Program to Implement Different Types of Operators in Java Pragmatically

public class JavaPractical5Operators
{  
public static void main(String args[])
{  
int a=5; 
int b=10;  
int c=15;
boolean d=true;
System.out.println("The initial value of a:" + a);
System.out.println("The initial value of b:" + b);
System.out.println("The initial value of c:" + c);
System.out.println("a+b=" + (a+b)); //Output will be 15  
System.out.println("a-b=" + (a-b)); //Output will be -5  
System.out.println("a*b=" + (a*b)); //Output will be 50 
System.out.println("a/b=" + (a/b)); //Output will be 0
System.out.println("a%b=" + (a%b)); //Output will be 5
System.out.println("a==b=" + (a==b)); //Returns false because 5 is not equal to 10
System.out.println("a!=b=" + (a!=b)); //Returns true because 5 is not equal to 10
System.out.println("a>b=" + (a>b)); //Returns false because 5 is not greater than 10
System.out.println("a<b=" + (a<b)); //Returns true because 5 is less than 10
System.out.println("a>=b=" + (a>=b)); //Returns false because 5 is not greater, or equal to 10
System.out.println("a<=b=" + (a<=b)); //Returns true because 5 is less than 10 or nor equal to 10
System.out.println("a<b&a<c=" + (a<b&a<c)); //True & True = True – Bitwise AND
System.out.println("a&b=" + (a&b)); //5&10 =0101&1010=0000 i.e.0 – Bitwise AND
System.out.println("a<b&a++<c=" + (a<b&a++<c)); //True & true = True – Bitwise AND
System.out.println("The new value of a=" + a); //Output will be 6, second condition is always checked in bitwise AND even if first is true or false
System.out.println("a>b|a<c=" + (a>b|a<c)); //False | True = True – Bitwise OR
System.out.println("a|b=" + (a|b)); //6|10 =0101|1010=1111=15 – Bitwise OR
System.out.println("a>b|a++<c=" + (a>b|a++<c)); //False | True = True – Bitwise OR
System.out.println("The new value of a=" + a); //Output will be 7, second condition is always checked in bitwise OR even if first is true or false
System.out.println("a^b=" + (a ^ b)); //7^10=0111^1010=1101 i.e. 13 – Bitwise XOR
System.out.println("~a=" + ~a); //a=7=0111, so ~a=1000 i.e. 8 – Bitwise Compliment
System.out.println("a<b&&a<c=" +  (a<b&&a<c)); //True && True = True – Logical AND
System.out.println("a<b&&a++>c =" + (a<b&&a++>c)); //True && False = False – Logical AND
System.out.println("The new value of a=" + a); //Output will be 8, second condition is checked in logical AND as first is true
System.out.println("a>b||a<c =" + (a>b||a<c)); //False || True = True – Logical OR
System.out.println("a<b||a++<c=" + (a<b||a++<c)); //True || True = True – Logical OR
System.out.println("The new value of a=" + a); //Output will be 9, second condition is not checked in logical OR as first is true
System.out.println("The value of a=" + (a)); //Output will be 9 - final value of a i.e. simple assignment operator
System.out.println("The value of a+= 3 is " + (a += 3)); //a=a+3=11 i.e add and assignment operator
System.out.println("The value of a-= 3 is" + (a -= 3)); //a=a-3=8 i.e. subtract and assignment operator
System.out.println("The value of a *= 3 is " + (a *= 3)); //a=a*3=24 i.e. multiply and assignment operator
System.out.println("The value of a /= 3 is " + (a /= 3)); //a=a/3=8 i.e. divide and assignment operator
System.out.println("The value of a %= 3 is " + (a %= 3)); //a=a%3=2 i.e. modules and assignment operator
System.out.println("The value of a &= 3 is " + (a &= 3)); //a=a&3=2&3=0010&0011=0010 i.e. 2 - bitwise AND assignment operator
System.out.println("The value of a |= 3 is " + (a |= 3)); //a=a|3=2|3=0010|0011=0011 i.e. 3 - bitwise OR AND assignment operator
System.out.println("The value of a ^= 3 is " + (a ^= 3)); //a=a^3=2^3=0011|0011=0000 i.e. 0 - bitwise XOR AND assignment operator
System.out.println("The value of a <<= 3 is " + (a <<= 3)); //a=a<<3=0000<<3=0000000 i.e. 0 - left shift AND assignment operator
System.out.println("The value of a >>= 3 is " + (a >>= 3)); // a=a>>3=0000<<3=0000000 i.e. 0 right shift AND assignment operator
System.out.println("+a=" + (+a)); //+a=+0 i.e. 0 
System.out.println("-a=" + (-a)); // -a=-0 i.e. 0 
System.out.println("a++=" + a++); //a=0, a=a+1=0+1=1 - post increment operator
System.out.println("The new value of a: " + a);
System.out.println("++a=" + ++a); //a=a+1=1+1=2, a=2 - pre increment operator
System.out.println("The new value of a: " + a);
System.out.println("a--=" + a--); //a=2, a=a-1=2-1=1 - post decrement operator
System.out.println("The new value of a: " + a);
System.out.println("--a=" + --a); //a=a-1=1-1=0, a=0 - pre decrement operator
System.out.println("The new value of a: " + a);
System.out.println("a++ + ++a=" + (a++ + ++a)); //Output will be 0+ 2 =2
System.out.println("b++ + b++=" + (b++ + b++)); //Output will be 10+11=21
System.out.println("!d=" + (!d)); //!d=!true=false;
System.out.println("a<<2= " + (a<<2)); //Output will be 2*2^2=2*4=8
System.out.println("a<<=3 " + (a<<3)); //Output will be 2*2^3=2*8=16
System.out.println("a>>2=" + (a>>2)); //Output will be 2/2^2=2/4= 0
System.out.println("a>>3=" + (a>>3)); //Output will be 2/2^3=2/8=0
System.out.println("-a>>2=" + (-a>>2)); //Output will be -2/2^2=-2/4=-0
System.out.println("a>>>3=" + (a>>>3)); //For positive number, >> and >>> works same  
System.out.println("The new value of a: " + a);
System.out.println("-a>>>3=" +(-a>>>3)); //For negative number, >>> changes parity bit (MSB) to 0  
int maximum = (a>b)? a: b;
System.out.println("The result of tertiary operator=" + maximum);
}
}