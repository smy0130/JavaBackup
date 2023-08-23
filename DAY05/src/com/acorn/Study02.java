package com.acorn;

public class Study02 {

	
	public static void sort(int[] arrays) {
	    for (int i = 0; i < arrays.length - 1; i++) {
	        int minIndex = i; // the index of the selected minimum
	        for (int j = i + 1; j < arrays.length; j++) {
	            if (arrays[minIndex] > arrays[j]) {
	                minIndex = j;
	            }
	        } 
	        if (i != minIndex) //minimum arrays[i] is swapped with arrays[minIndex]
	        {
	            int temp = arrays[i];
	            arrays[i] = arrays[minIndex];
	            arrays[minIndex] = temp;
	        }
	    }
	}
	}


