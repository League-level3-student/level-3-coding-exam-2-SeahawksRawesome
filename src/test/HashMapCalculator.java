package test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * PART B
 * 
 * Write a method that takes in an ArrayList of Integers and a HashMap that
 * matches and Integer key to a String Value. The method should return an
 * ArrayList of all the Values from the HashMap that have matching keys to the
 * passed in ArrayList.
 * 
 */

public class HashMapCalculator {

	public ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		ArrayList<String> st = new ArrayList<String>();
		int hashChecker = 0;
		for (int i = 0; i < lst.size(); i++) {
			hashChecker = lst.get(i);

			if (hm.get(hashChecker) != null) {
				String storeInArray = hm.get(hashChecker);
				st.add(storeInArray);
			} else {

			}
		}
		return st;
	}

}
