
//Practical: 9 - Java Program to Implement Array Class through Methods in Java Pragmatically 

import java.util.Arrays; 
public class JavaPractical9ArrayClass
{
   public static void main(String[] args) 
    { 

	// Program to demonstrate array class via Arrays.compare() and Arrays.compareUnsigned() methods
		
		// Initializing the first array 
        int myarray1[] = { 10, 20, 30, 40, 50}; 
  
        // Initializing the second array
        int myarray2[] = { 10, 15, 22 }; 
  
        // Comparing both first and second arrays 
        System.out.println("Two integer arrays on comparison: " + Arrays.compare(myarray1, myarray2)); 
		System.out.println();

		// Initializing the first array 
        int myarray3[] = { 10, 20, 15, 22, 35 }; 
  
        // Initializing the second array
        int myarray4[] = { 10, 15, 22 }; 
  
        // Comparing both first and second arrays 
        System.out.println("Two integer arrays on comparison: " + Arrays.compareUnsigned(myarray3, myarray4)); 
		System.out.println();

	// Program to demonstrate array class via Arrays.equals() method
		
		// Initializing the first array 
        int myarray5[] = { 10, 20, 15, 22, 35 }; 
  
        // Initializing the second array
        int myarray6[] = { 10, 15, 22 }; 
  
        //Comparing both first and second arrays 
        System.out.println("Two integer arrays on comparison: " + Arrays.equals(myarray5, myarray6)); 
		System.out.println();

	// Program to demonstrate array class via Arrays.copyOf() method
		
		// Initializing the source array 
        int myarray8[] = { 10, 20, 15, 22, 35 }; 
  
        //Printing the array elements in one line 
        System.out.println("The first array or source array: " + Arrays.toString(myarray8)); 
  
        // Printing the destination array
        System.out.println("The new array or destination array: " + Arrays.toString(Arrays.copyOf(myarray8, 10)));
		System.out.println();

		// Program to demonstrate array class via Arrays.sort() method

		// Initializing an array 
        int myarray9[] = { 10, 20, 15, 22, 35 }; 
  
        //Sorting an array using normal sort 
        Arrays.sort(myarray9, 1, 3); 
  
        System.out.println("The sorted array: " + Arrays.toString(myarray8)); 
		System.out.println();

	// Program to demonstrate array class via Arrays.binarySearch() method
		
		int myarray10[] = { 10, 20, 15, 22, 35 }; 
  
        Arrays.sort(myarray10); 
  
        int arraykey1 = 22; 
  
        // Printing the key and corresponding index
		
        System.out.println(arraykey1 + " found at index = " + Arrays.binarySearch(myarray10, arraykey1)); 
		System.out.println();

	// Program to demonstrate array class via Arrays.fill() method
	
		// Initializing an array 
		
        int myarray11[] = { 10, 20, 15, 22, 35 }; 
        int arraykey2 = 22; 
  
		//Filling and printing an array
        Arrays.fill(myarray11, arraykey2); 
        System.out.println("Integer Array on filling: " + Arrays.toString(myarray10)); 
		System.out.println();

	// Program to demonstrate array class via Arrays.hashCode() method
	
		// Initializing an array 
		
        int myarray12[] = { 10, 20, 15, 22, 35 };  
  
        //Getting the hashCode of the array 
        System.out.println("Integer Array: " + Arrays.hashCode(myarray12)); 
		System.out.println();

	// Program to demonstrate array class via Arrays.mismatch() method
	
		// Initializing the first array 
        int myarray13[] = { 10, 20, 15, 22, 35 }; 
  
        // Initializing the second array
        int myarray14[] = { 10, 15, 22 }; 
  
        // Comparing both first and second arrays 
        System.out.println("Two integer arrays on comparison: " + Arrays.mismatch(myarray13, myarray14)); 
        System.out.println();
    }     
}    