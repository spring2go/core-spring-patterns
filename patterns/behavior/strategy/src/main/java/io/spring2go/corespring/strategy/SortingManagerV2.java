package io.spring2go.corespring.strategy;

import java.util.List;

public class SortingManagerV2 {
	SortingStrategy sortingStrategy;
	List<Integer> list;

	public SortingManagerV2(List<Integer> list, SortingStrategy sortingStrategy) {
		super();
		this.list = list;
		this.sortingStrategy = sortingStrategy;
	}

	public void sortList() {
		System.out.println("===================================");
		System.out.println("Sorting List based on Type");
		System.out.println("===================================");

		sortingStrategy.sort(list);
	}

	public SortingStrategy getSortingStrategy() {
		return sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

}
