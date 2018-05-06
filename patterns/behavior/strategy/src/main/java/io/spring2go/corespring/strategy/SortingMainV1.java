package io.spring2go.corespring.strategy;

import java.util.Arrays;
import java.util.List;

public class SortingMainV1 {
	public static void main(String[] args) {
		List list = Arrays.asList(new Integer[] { 44, 5, 3, 5, 5, 64, 3 });

		SortingManagerV1 sm = new SortingManagerV1(list);

		// Sorting using merge sort
		sm.sortListBasedOnType(SortingType.MERGE_SORT);

		System.out.println();

		// Sorting using quick sort
		sm.sortListBasedOnType(SortingType.QUICK_SORT);

		System.out.println();

		// Sorting using heap sort
		sm.sortListBasedOnType(SortingType.HEAP_SORT);

	}

}
