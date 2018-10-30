import java.util.Arrays;

public class ArrayTest 
{

	public static void main(String[] args) 
	{
		int[] myArray = new int[20]; //automatically initialized with zeros
		for (int i = 0; i < myArray.length; i++)
			myArray[i] = (int)((Math.random() * 20) + 1);
		
		System.out.println("the average: " + average(myArray));     //can just name the method (don't need die.roll)
		System.out.println("13 appears: " + isPresent(myArray,13));
		System.out.println("at index: " + indexOf(myArray,13));
		//System.out.print(myArray); //returns the memory address, not the array
		System.out.print(Arrays.toString(myArray)); //prints the array in a neat way
	}
	
	
	private static double average(int[] array)        
	{
		//use a for each loop to find avg
		double sum = 0;
		for (int num: array)
		{
			sum += num;
		}
		return sum/array.length;          //arrays are constants -> not calling a method -> no parenthesis after length
	}
		
	private static boolean isPresent(int[] array, int target)
	{
		for(int num: array)
		{
			if (num == target)
					return true;       //if value is true -> returns true
										//if false -> will cycle until the end of the array -> none of the values work -> returns false
		}
		return false;
	}
	
	/**
	 * Returns the first occurrence of the target value
	 * @param array        array
	 * @param target       target value
	 * @return             the index of the first occurrence of target or -1 if not found
	 */
	private static int indexOf(int[] array, int target)
	{
		for (int i = 0; i < array.length;  i ++)
		{
			if (array[i] == target)
				return i;
		}
		return -1;
	}
	
	/**
	 * Returns the last occurrence of the target value
	 * @param array        array
	 * @param target       target value
	 * @return             the index of the last occurrence of target or -1 if not found
	 */
	//private static int indexOf(int[] array1, int target)
	//{
	//	for (int i = array1.length - 1; i >= 0;  i --)
	//	{
	//		if (array1[i] == target)
	//			return i;
	//	}
	//	return -1;
	//}
	
}
	
	
	
	
	
			