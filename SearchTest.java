package util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchTest {
	public static boolean ByList(String[] arr, String targetValue) {
		return Arrays.asList(arr).contains(targetValue);
	}
	public static boolean BySet(String[] arr, String targetValue) {
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		return set.contains(targetValue);
	}
	public static boolean ByForLoop(String[] arr, String targetValue) {
		for(String s: arr){
			if(s.equals(targetValue))
			return true;
			}
			return false;
	}
		public static boolean ByArraysBinarySearch(String[] arr, String targetValue) {
			int a = Arrays.binarySearch(arr, targetValue);
			if(a > 0)
			return true;
			else
			return false;
	}

}
