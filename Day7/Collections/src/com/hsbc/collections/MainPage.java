package com.hsbc.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MainPage {

	public static void main(String[] args) {
		Item item1 = new Item(101,"Kitkat",20.00);
		Item item2 = new Item(102,"5-Star",5.00);
		Item item3 = new Item(103,"Dairymilk",10.00);
		Item item4 = new Item(104,"Munch",15.00);
		Item item5 = new Item(105,"Milky Bar",5.00);
		
		ArrayList<Item> list1 = new ArrayList<Item>();
		
		list1.add(item1);
		list1.add(item2);
		list1.add(item3);
		list1.add(item4);
		list1.add(item5);
		
		SortItem sort = new SortItem();
		System.out.println("Sort by Item ID in Ascending Order :");
		Collections.sort(list1, sort.new SortItemIdInAscending());
		for(Item item : list1) {
			System.out.println(item);
		}
		
		System.out.println("Sort by Item ID in Descending Order :");
		Collections.sort(list1, sort.new SortItemIdInDescending());
		for(Item item : list1) {
			System.out.println(item);
		}
		
		System.out.println("Sort by Name in Ascending Order :");
		Collections.sort(list1, sort.new SortNameInAscending());
		for(Item item : list1) {
			System.out.println(item);
		}
		
		System.out.println("Sort by Name in Descending Order :");
		Collections.sort(list1, sort.new SortNameInDescending());
		for(Item item : list1) {
			System.out.println(item);
		}
		
		System.out.println("Sort by Price in Ascending Order :");
		Collections.sort(list1, sort.new SortPriceInAscending());
		for(Item item : list1) {
			System.out.println(item);
		}
		
		System.out.println("Sort by Price in Descending Order :");
		Collections.sort(list1, sort.new SortPriceInDescending());
		for(Item item : list1) {
			System.out.println(item);
		}
	}

}
