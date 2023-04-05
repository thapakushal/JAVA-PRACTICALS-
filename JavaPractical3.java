// Practicalo: 3- java program to inmplement different types of variables in java
public class JavaPractical3 {
    // These variables are instance variables
    int javaMarks;
    int vbnetMarks;
    //Thse variables are static variables 
    public static int rollno;
    public static String name = "Hari";


    public static void main(String args[])
    {
    // These variables are local variables 
    int computerhardwaremarks = 47;
    int computerarchitecturemarks = 45;
    

    // Accessing static variable without object 
    JavaPractical3.rollno = 10;
    System.out.println("Student's Name: "+ JavaPractical3.name);
    System.out.println("Student's Roll no: "+ JavaPractical3.rollno);
    // Accessing local variables 
    System.out.println("Marks obtained in Computer Hardware: "+ computerhardwaremarks);
    System.out.println("Marks obtained in Computer Architecture: "+ computerarchitecturemarks);
    // Creating first object for accessing instance varibales
    JavaPractical3 obj = new JavaPractical3();
    obj.javaMarks = 40;
    obj.vbnetMarks = 43;

    // Displaying marks for object 
    System.out.println("Marks obtained in Java: "+" "+ obj.javaMarks);
    System.out.println("Marks obtained in VB.NET: " +" "+ obj.vbnetMarks);
}
}
