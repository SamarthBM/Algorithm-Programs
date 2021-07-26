/****************************************************************
 * Purpose : To perform bubble sort program.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class BubbleSort {
	
	/**
	 * Purpose: Method to sort array elements using bubble sort technique in generic type.
	 * 
	 * @param <T>
	 * @param integerArray
	 * 
	 * 
	 */
	private <T extends Comparable<T>> T[] performBubbleSort(T[] integerArray) {
		
		for (int i = 0; i < integerArray.length - 1; i++) {
			for (int j = 0; j < integerArray.length - i - 1; j++) {
				// To swap the largest value to the end.
				if (integerArray[j].compareTo(integerArray[j + 1]) > 0) {
					T temp = integerArray[j];
					integerArray[j] = integerArray[j + 1];
					integerArray[j + 1] = temp;
				}
			}
		}
		printSortedArray(integerArray);
		return integerArray;
	}

	/**
	 * Method to Print the sorted Array
	 * 
	 * @param <T>
	 * @param integerArray
	 */
	private <T> void printSortedArray(T[] integerArray) {
		
		System.out.println("Given Array after sorting :");
		System.out.print("[ ");
		for (T iterator : integerArray) {
			System.out.print(iterator + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Integer[] integerArray = { 88, 18, 25, 9, 12, 2, 1 };

		BubbleSort bubbleSortObject = new BubbleSort();
		bubbleSortObject.performBubbleSort(integerArray);

	}

}
