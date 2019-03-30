// Ex23-2
// Zachary Elmore
// 12/2/16
// sorts a list of numbers using the merge sort method

import java.util.Comparator;

public class GenericMerge {
	/** The method for sorting the numbers */
	public static <E extends Comparable<E>> void mergeSort(E[] list){
	    if (list.length > 1) {
	      // Merge sort the first half
	      Integer[] firstHalf = new Integer[list.length / 2];
	      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
	      mergeSort(firstHalf);

	      // Merge sort the second half
	      Integer secondHalfLength = list.length - list.length / 2;
	      Integer[] secondHalf = new Integer[secondHalfLength];
	      System.arraycopy(list, list.length / 2,
	        secondHalf, 0, secondHalfLength);
	      mergeSort(secondHalf);

	      // Merge firstHalf with secondHalf into list
	      mergeSort(firstHalf, secondHalf, list);
	    }
	  }

	  /** Merge two sorted lists */
	public static <E extends Comparable<E>> void mergeSort(Integer[] list1, Integer[] list2, E[] temp) {
	    int current1 = 0; // Current index in list1
	    int current2 = 0; // Current index in list2
	    int current3 = 0; // Current index in temp

	    while (current1 < list1.length && current2 < list2.length) {
	      if (list1[current1].compareTo(list2[current2]) < 0)
	          temp[current3++] = (E) list1[current1++];
	      else
	        temp[current3++] = (E) list2[current2++];
	    }

	    while (current1 < list1.length)
	      temp[current3++] = (E) list1[current1++];

	    while (current2 < list2.length)
	      temp[current3++] = (E) list2[current2++];
	  }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/** The method for sorting the numbers */
/*	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator){
	    if (list.length > 1) {
	      // Merge sort the first half
	      Integer[] firstHalf = new Integer[list.length / 2];
	      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
	      mergeSort(firstHalf);

	      // Merge sort the second half
	      Integer secondHalfLength = list.length - list.length / 2;
	      Integer[] secondHalf = new Integer[secondHalfLength];
	      System.arraycopy(list, list.length / 2,
	        secondHalf, 0, secondHalfLength);
	      mergeSort(secondHalf);

	      // Merge firstHalf with secondHalf into list
	      mergeSort(firstHalf, secondHalf, list);
	    }
	  }
*/
	  /** Merge two sorted lists */
	/*public static <E> void mergeSort(Integer[] list1, Integer[] list2, E[] temp,
			Comparator<? super E> comparator){
	    int current1 = 0; // Current index in list1
	    int current2 = 0; // Current index in list2
	    int current3 = 0; // Current index in temp

	    while (current1 < list1.length && current2 < list2.length) {
	      if (list1[current1].compareTo(list2[current2]) < 0)
	          temp[current3++] = (E) list1[current1++];
	      else
	        temp[current3++] = (E) list2[current2++];
	    }

	    while (current1 < list1.length)
	      temp[current3++] = (E) list1[current1++];

	    while (current2 < list2.length)
	      temp[current3++] = (E) list2[current2++];
	  }
*/
	  /** A test method */
	public static void main(String[] args) {
		  Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		    System.out.print("Original List: ");
		    for (int i = 0; i < list.length; i++)
			  System.out.print(list[i] + " ");
		    mergeSort(list);
		    System.out.print("\nSorted List: ");
		    for (int i = 0; i < list.length; i++)
		      System.out.print(list[i] + " ");
	  }
}
