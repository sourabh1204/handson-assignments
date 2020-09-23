package com.hsbc.collections;

import java.util.Comparator;

public class SortItem {
	public class SortItemIdInAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (o1.getItemID()-o2.getItemID());
		}
		
	}
	public class SortItemIdInDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (o2.getItemID()-o1.getItemID());
		}
		
	}
	public class SortNameInAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (o1.getName().compareTo(o2.getName()));
		}
		
	}
	public class SortNameInDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (o2.getName().compareTo(o1.getName()));
		}
		
	}
	public class SortPriceInAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (int)(o1.getPrice()-o2.getPrice());
		}
		
		
	}
	public class SortPriceInDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (int)(o2.getPrice()-o1.getPrice());
		}
		
	}
}
