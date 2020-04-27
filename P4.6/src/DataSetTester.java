public class DataSetTester {
	public static void main(String[] args) {
		
		//creates variable test with the type DataSet
		DataSet test = new DataSet();
		
		//adds values based on user input
		test.addValue(1);
		test.addValue(2);
		test.addValue(3);
		test.addValue(4);
		
		//prints out phrases and variable values
		System.out.println(test.getLargest());
		System.out.println("Expected: 4");
		System.out.println(test.getSmallest());
		System.out.println("Expected: 1");
	}
}
