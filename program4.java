package Shimakh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program4

	{
	    public static void main(String[] args) {
	    	int[] inputArray = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
	        
	        // Create a map to store the count of multiples
	        Map<Integer, Integer> multiplesCount = new HashMap<>();
	        
	        // Initialize the map with 0 counts for each multiple
	        for (int i = 1; i <= 9; i++) {
	            multiplesCount.put(i, 0);
	        }
	        
	        // Iterate through the input array and count multiples
	        for (int number : inputArray) {
	            for (int i = 1; i <= 9; i++) {
	                if (number % i == 0) {
	                    multiplesCount.put(i, multiplesCount.get(i) + 1);
	                }
	            }
	        }
	        
	        // Print the counts
	        System.out.println(multiplesCount);

	}
	}

	


