import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
public class ArraySorter {
	public static void main(String[] args) {
		int scores[]= {65,95,86,74,23};
		System.out.println("Array without sorting....");
		for(int score:scores) {
			System.out.println(scores);
		}
		System.out.println("Array after sorting.....");
		Arrays.sort(scores);
		
		for(int score : scores) {
			System.out.println("Sorting is: "+ score);
		}
		// ArrayList sorting
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Cuttack");
		cityList.add("Bhubanewar");
		cityList.add("Jajpur");
		
		System.out.println("List without sorting: ");
		for (String city: cityList) {
			System.out.println(city);
		}
		//sort the list
		Collections.sort(cityList);
		
		System.out.println("List after sorting: ");
		for(String city : cityList) {
			System.out.println(city);
		}
		
		//eliminating duplicate using HashSet
		HashSet<String> citySet = new HashSet<String>();
		citySet.add("Cuttack");
		citySet.add("Ahmedabad");
		citySet.add("Jajpur");
		citySet.add("Ahmedabad");
		System.out.println("City Set:  ");
		for(String city : citySet) {
			System.out.println(city);
		}
		
	}

}
