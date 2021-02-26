package dataFrame;
import java.util.List;
import java.util.ArrayList;
public class DataFrame {
	ArrayList<List> table = new ArrayList<List>();
	ArrayList<String> colnames = new ArrayList<String>();
	
	DataFrame(ArrayList<String> colnames, List<Integer>... cols) {
		int j = 0; //Counter
		for(List<Integer> i: cols) {
			this.table.add(i);
			//Will fail on the first run for j-1 where j = 0
			try {
				//Check that each column has same number of rows
				if(table.get(j).size() != table.get(j-1).size()) {
					throw new IllegalStateException("Number of rows should be same in all data columns");
				}//end if
			}catch(IndexOutOfBoundsException e) {
				j++;
				continue;
			}//end try catch
			j++;
		}//end for loop
		
		//Check that there are the same number of name columns as there are data columns
		if(colnames.size() != table.size()) {
			throw new IllegalStateException("Number of columns must match between column names and data.");
		}else {
			this.colnames = colnames;
		}//end if else
		
	}//end DataFrame()
	
	//Print the table
	public void head() {
		//Print the column names
		for(String i : colnames) { //for each string in colnames
			System.out.printf("%s\t", i);
		}
		System.out.println("\n");
		
		//Print the first four rows of data
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < table.size(); j++) {
				//If there are less than four rows of data break out of printing the missing rows
				try {
					System.out.print(table.get(j).get(i) +"\t");
				}catch(IndexOutOfBoundsException e) {
					break;
				}//end try catch
			}//end for loop
			System.out.println();
		}//end for loop
		

	}//end head()
}//end class
