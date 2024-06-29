package Week04;

import java.lang.reflect.Array;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};  //Step 1. Created new array of int called "ages" with 8 elements
		
		int result = ages[ages.length - 1] - ages[0];   //Step 1a. subtracted last element from the first element in the array "ages"
		System.out.println("Question 1a: " + result);
		
		int[] ages2 = {1, 5, 10, 15, 20, 25, 30, 35, 40};   //Step 1b. Created a new array of int called "ages2" with 9 elements
		
		int result2 = ages2[ages2.length - 1] - ages2[0];   //Step 1bii. Discovered the value of the difference of the last element and the first element. Dynamically accessed the last element of the array using length - 1
		System.out.println("Question 1b: " + result2);
		
		int sum = 0;                                 //Step 1c. created a loop, iterated through the array to get the average value of the array "ages"
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double average = sum / ages.length;   
		
		System.out.println("Question 1c: " + average);
		
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};   //2. This is an array of string containing 6 elements of names.
		
		int sumOfName = 0;										//2a. A new variable is created called sumOfInt to hold the value of sumOfName.
		for (String name : names) {								// An enhanced for loop is used to iterate through each name in the string array names.
			sumOfName += name.length();							// Use the variable sumOfName and add/equal to the length object of name.
		}
		double averageLetters = sumOfName / (double)names.length;     //2b. Since we are looking for the average there will likely be decimals, so create a new variable of double. Named it "averageLetters" to make sense for what I am looking for. 
		System.out.println("Question 2a: " + averageLetters);							  //Divide the sumOfName by the names length (number of elements in the array). This will calculate the average number of letters per name in the array.
		
		
		StringBuilder catNames = new StringBuilder();		// 2c). Creating a StringBuilder to hold the value of variable catNames.
		for (int i = 0; i < names.length; i++) {			//Using a for loop to iterate through the array and concatenate the names
			catNames.append(names[i]);
			if (i < names.length - 1) {						//this if statement is stating to only add the spaces " " between all names, ending prior to the last element is printed to the console.
				catNames.append(" ");
			}
		}
		System.out.println("Question 2b: " + catNames);						//print to the console the concatenated names by using the StringBuilder variable catNames. The names print all on the same line separated by spaces.
		
		// 3). Use array[arr.length - 1 to access the last element in an array." + " " + "Arr is equal to name declared of the array.
		// 4). Use arr[0] to access the first element of an array." + " " + "0 is the first element and 1 is the second element, etc.

		int[] nameLengths = new int[names.length];			// 5). Created an array of int called nameLengths. 
		for (int i = 0; i < names.length; i++) {			// iterated through the names array to get the name length
			nameLengths[i] = names[i].length();				// iterating through variable i to add the length of each name
		}
		
		
		int sum2 = 0;										// 6). Using 0 to hold the value of sum2
		for (int i = 0; i < nameLengths.length; i++) {		// using a for loop to iterate through the variable i and calculating the sum of... 
			sum2 += nameLengths[i];							// all of elements in the array. We accomplish this using the '+=' symbol.
			
		}
		
		System.out.println("Question 6: " + sum2);
		
		
		
		String multiplyWord = multiplyWord("Hello", 4);		// 7). Using our method multiplyword and telling it what to pass in and the
		System.out.println("Question 7: " + multiplyWord);	// number of times. Printing to the console. 
	
		
		
		String firstName = "William";					//8. Declared a string called firstName with a value of William
		String lastName = "Wallace";					// Declared a string called lastName with a value of Wallace
		
		String fullName = fullName (firstName, lastName);
		
		System.out.println("Question 8: " + firstName + " " + lastName);
		
		
		int[] numArray1 = {10, 15, 25, 40};			// 9). 2 arrays of int created holding 4 values to test the method
		int[] numArray2 = {15, 25, 35, 45};
		
		System.out.println("Question 9 test example of a false return: Sum is greater than 100: " + isGreaterThan(numArray1));
		System.out.println("Question 9 test example of a true return: Sum is greater than 100: " + isGreaterThan(numArray2));
		
		
		double[] footballTotals = {42, 27, 14, 49, 52};		// 10). array of double created called footballTotals holding the value of 5 elements 
		
		System.out.println("Question 10: " + averageOfElements(footballTotals));   //Print to the console the method averageOfElements in array footballTotals
		
		
		double [] array4 = {4, 10, 20, 22};			// 11). two arrays of double created holding 4 elements
		double [] array5 = {3, 7, 10, 25};
		
		System.out.println("Question 11: " + averageArray(array4, array5));  //Print to the console the method averageArray in array4 and array5
		
		
		boolean isHotOutside = true;			// 12). since moneyInPocket is 12.75 (more than 10.50), the result prints true
		double moneyInPocket = 12.75;
		
		System.out.println("Question 12: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		
		
		int chiefsPointTotal = 185;			// 13). declared 3 variables of int and assigned values 
		int billsPointTotal = 202;			//	Print true to the console if raiders point total exceeds the bills and chiefs
		int raidersPointTotal = 222;
		
		System.out.println("Question 13. " + bestOffense(chiefsPointTotal, billsPointTotal, raidersPointTotal));
		
		
		
	} //end of main
	
	
	//Question 7 method												
	public static String multiplyWord(String word, int num) {		// 7). Created a string and stored word and num inside the method
		StringBuilder result = new StringBuilder();					// created a StringBuilder and for loop to iterate through num
																	// Returning the full String 
		for (int i = 0; i < num; i++) {
			result.append(word);
		}
		
		return result.toString();
	}
	//end of Method Question 7
	
	//Question 8										
	public static String fullName(String firstName, String lastName) {			//8). Method of string called fullName that holds two strings
		return firstName + " " + lastName;										// firstName and lastName. Used concatenation to add a space	
	}																			// between the two values

	//End of Method Question 8
	
	//Question 9												// 9). Method of boolean created to return a value of true or false
	public static boolean isGreaterThan(int[] arr) {			// for loop created to iterate through each integer (num) in the array (arr).
		int sum = 0;											// If the sum is greater than 100, true will print to the console
		for (int num : arr) {
			sum += num;
		}
		return sum > 100;
	}
	
	//End of Method 9
	
	//Question 10													// 10). Method of double created as we need to return the average of all elements in the array.
	public static double averageOfElements(double[] arr) {			// create a double of sum as 0 to hold the value of sum
		double sum = 0;												// for loop is used to iterate through each num in the array arr
		for (double num : arr) {									// use sum to grab the total value of elements
			sum += num;												// divide sum by array length to find the average
		}
		return sum / arr.length;
	}
	
	
	//End of Method 10
	
	//Question 11
	public static boolean averageArray (double[] firstArray1, double[] secondArray2) {
		double sum1 = 0;											 
		double sum2 = 0;											// created a method of boolean as we need to return a value of true or false
																	// declared two variables of double to hold the value of sum1 and sum2
		for (double num1 : firstArray1) {							// used a for loop to iterate through each array
			sum1 += num1;											// declared two additional variables of double to grab the average of
		}															// each array
		for (double num2 : secondArray2) {							// return true if the average of array 1 is greater than average of array 2
			sum2 += num2;
		}
		double array1Average = sum1 / firstArray1.length;
		double array2Average = sum2 / secondArray2.length;
		
		return array1Average > array2Average;
	}
	
	//End of Method 11
	
	//Question 12						
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;				// 12). Created a method of boolean to return true or false value
	}																// if it isHotOutside and moneyInPocket is more than 10.50 it will be true
	
	//End of Method 12
	
	//Question 13										
	public static boolean bestOffense (int chiefsPointTotal, int billsPointTotal, int raidersPointTotal) {
		 return ((raidersPointTotal > chiefsPointTotal) && (raidersPointTotal > billsPointTotal));
	}
	
	//End of Method 13										// 13). Created a boolean method to determine if the raiders have the best offense
															// returning true if the raidersPointTotal is greater than the bills and chiefs
															// point totals
} //end of class
