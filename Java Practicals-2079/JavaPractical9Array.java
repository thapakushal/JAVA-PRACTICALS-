
//Practical: Java Program to Implement Array in Java Pragmatically 

public class JavaPractical9Array
{
public static void main(String[] args)
{
    int a[]={10,20,30,40,50};
    for(int i=0; i<a.length; i++)
    System.out.print(a[i]);
    int b[]=new int[5];
    b[0]=8;
    b[1]=16;
    b[2]=24;
    b[3]=32;
    b[4]=40;
    for(int i=0; i<b.length; i++)
    System.out.print(b[i]);
      
    int c[]={15,30,45,60,75};
    for (int i : c) 
    {
        System.out.println (i);
    }
}
}