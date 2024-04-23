
//Practical: 9 - Java Program to Implement DIfferent Types of Array in Java Pragmatically 

public class JavaPractical9ArrayTypes
{
public static void main(String[] args)
{
   
    int a[]={10,20,30,40,50};
    for(int i=0; i<a.length; i++)
    System.out.print(a[i]);
    System.out.println();
   int b[][]= {{10,20,30,40,50},{15,30,45,60,75}};
    for(int i=0; i<5; i++)
    {
        for(int j=0; j<5; j++)
        {
        System.out.print(b[i][j]+" ");
        }
		System.out.println();
    }
}
}