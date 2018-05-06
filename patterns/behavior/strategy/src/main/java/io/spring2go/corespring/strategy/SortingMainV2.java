package io.spring2go.corespring.strategy;

import java.util.Arrays;
import java.util.List;

public class SortingMainV2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] { 44, 5, 3, 5, 5, 64, 3 });
		MergeSortStrategy mergeSortStrategy = new MergeSortStrategy();
		SortingManagerV2 sm = new SortingManagerV2(list, mergeSortStrategy);
		sm.sortList();

		System.out.println();

		QuickSortStrategy quickSort = new QuickSortStrategy();
		sm.setSortingStrategy(quickSort);
		sm.sortList();

		System.out.println();

		HeapSortStrategy heapSort = new HeapSortStrategy();
		sm.setSortingStrategy(heapSort);
		sm.sortList();
	}

}
