package dataFrame;
import java.util.List;
import java.util.ArrayList;
public class DataFrame {
	ArrayList<List> table = new ArrayList<List>();
	ArrayList<String> colnames = new ArrayList<String>();
	
	DataFrame(List<Integer> col1, List<Integer> col2, ArrayList<String> colnames){
		this.table.add(col1);
		this.table.add(col2);
		this.colnames = colnames;
	}
	
	//Print the table
	public void head() {
		//Print the column names
		for(int i = 0; i < colnames.size(); i++) {
			System.out.printf("%s\t", colnames.get(i));
		}
		System.out.println("\n");
		
		//Break the table into columns
		List col1 = table.get(0);
		List col2 = table.get(1);
		//Print the columns
		for(int i = 0; i < col1.size(); i++) {
			System.out.printf("%d\t%d\n", col1.get(i), col2.get(i));
		}
		
	}
}
