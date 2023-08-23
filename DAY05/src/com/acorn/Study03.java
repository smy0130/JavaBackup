package com.acorn;

public class Study03 {
	public static void main(String[] args) {
		int [] scores = { 80, 70, 60, 50, 95};
		sort (scores);
		for (int score : scores) {
		System.out .print(score + "," );
		}
		}
		public static void sort(int [] arrays) {
		for (int i = 1; i < arrays.length ; i++) {
		//Take unsorted new elements
		int insertElement = arrays[i];
		int insertPosition = i;
		for (int j = insertPosition - 1; j >= 0; j--) {
		// insertElement is shifted to the right
		if (insertElement < arrays[j]) {
		arrays[j + 1] = arrays[j];
		insertPosition--;
		}else {
		break ;
		}
		}
		//Insert the new element
		arrays[insertPosition] = insertElement;
		}
		}
		
}
