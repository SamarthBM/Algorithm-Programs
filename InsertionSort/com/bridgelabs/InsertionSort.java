/****************************************************************
 * Purpose : To perform insertion sort program.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class InsertionSort {
	/**
	 * Purpose: Method to perform insertion sort.
	 * @param <T>
	 * @param inputArray Method to sort array elements using Insertion sort technique in generic type
	 */
	private <T extends Comparable<T>> T[] insertionSort(T[] inputArray) {

		for (int j = 1; j < inputArray.length; j++) {
			T key = inputArray[j];
			int i = j - 1;
			while (i >= 0) {
				if (key.compareTo(inputArray[i]) > 0) {
					break;
				}
				inputArray[i + 1] = inputArray[i];
				i--;
			}
			inputArray[i + 1] = key;
		}
		printSortedArray(inputArray);
		return inputArray;
	}

	/**
	 * Purpose:  Method to Print the sorted Array
	 * @param <T>
	 * @param inputArray
	 */
	private <T> void printSortedArray(T[] inputArray) {

		System.out.println("Given Array after sorting in ascending order :");
		System.out.print("[ ");
		for (T iterator : inputArray) {
			System.out.print(iterator + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Integer[] inputArray = { 52, 15, 85, 25, 5 };

		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(inputArray);

	}

}
