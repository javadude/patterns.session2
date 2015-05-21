package com.javadude.collections;


public class ListWrapperUse {

	public static void main(String[] args) {
		ObservableListWrapper<String> list = new ObservableListWrapper<String>();
		list.addPropertyChangeListener("list", e->System.out.println("changed!"));
		list.add("Scott");
		list.add("Steve");
		list.add("Mike");

	}

}
