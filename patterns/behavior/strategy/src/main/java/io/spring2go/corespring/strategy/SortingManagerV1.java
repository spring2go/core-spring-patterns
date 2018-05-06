package io.spring2go.corespring.strategy;

import java.util.List;

public class SortingManagerV1 {
	List list;

	public SortingManagerV1(List list) {
		this.list = list;
	}

	public void sortListBasedOnType(SortingType sortingType) {
		System.out.println("===================================");
		System.out.println("Sorting List based on Type");
		System.out.println("===================================");

		if (SortingType.MERGE_SORT == sortingType) {
			sortListUsingMergeSort();
		} else if (SortingType.QUICK_SORT == sortingType) {
			sortListUsingQuickSort();
		} else if (SortingType.HEAP_SORT == sortingType) {
			sortListUsingHeapSort();
		}
	}

	private void sortListUsingMergeSort() {
		System.out.println("Sorting List using merge sort");
	}

	private void sortListUsingQuickSort() {
		System.out.println("Sorting List using quick sort");
	}

	private void sortListUsingHeapSort() {
		System.out.println("Sorting List using heap sort");
	}
}
