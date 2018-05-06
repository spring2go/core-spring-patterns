package io.spring2go.corespring.strategy;

import java.util.List;

public class HeapSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> list) {
		System.out.println("Sorting using heap sort");
	}

}
