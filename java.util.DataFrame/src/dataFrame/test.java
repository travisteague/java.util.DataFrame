package dataFrame;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> col1 = new ArrayList<Integer>();
		List<Integer> col2 = new ArrayList<Integer>();
		ArrayList<String> colNames = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			col1.add(i);
		}
		for(int i = 5; i < 10; i++) {
			col2.add(i);
		}
		colNames.add("One");
		colNames.add("Two");
		
		DataFrame table = new DataFrame(col1, col2, colNames);
		table.head();
		

	}

}
