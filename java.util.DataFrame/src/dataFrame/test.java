package dataFrame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> col1 = new ArrayList<Integer>();
		List<Integer> col2 = new ArrayList<Integer>();
		List<Integer> col3 = new ArrayList<Integer>();
		List<Integer> col4 = new ArrayList<Integer>();
		List<Integer> col5 = new ArrayList<Integer>();
		List<Integer> col6 = new ArrayList<Integer>();
		ArrayList<String> colNames = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			if(i <= 4) {
				col1.add(i);
			}else {
				col2.add(i);
			}
		}
		for(int i = 10; i < 20; i++) {
			if(i <= 14) {
				col3.add(i);
			}else {
				col4.add(i);
			}
		}
		for(int i = 20; i < 30; i++) {
			if(i <= 24) {
				col5.add(i);
			}else {
				col6.add(i);
			}
		}


		colNames.add("One");
		colNames.add("Two");
		colNames.add("Three");
		colNames.add("Four");
		colNames.add("Five");
		colNames.add("Six");

		DataFrame table = new DataFrame(colNames, col1, col2, col3, col4, col5, col6);
		table.head();
		
		
		

	}

}
