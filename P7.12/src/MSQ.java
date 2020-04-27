import java.util.ArrayList;
import java.util.Scanner;
public class MSQ {
	public ArrayList square = new ArrayList<Integer>();
	private Scanner s = new Scanner(System.in);
	private int in;
	int size;
	private int ROWS;
	private int COLUMNS;
	int[][] sq2d ;
	private ArrayList rowSums = new ArrayList<Boolean>();
	private ArrayList colSums = new ArrayList<Boolean>();
	private ArrayList diaSums = new ArrayList<Boolean>();
	private int sum;
	
	//Constructor
	public MSQ(int isize){
		size = isize;
		System.out.println("Enter positive integers 1-"+size+" to form the square.");
		ROWS = (int) Math.sqrt(size);
		COLUMNS = (int) Math.sqrt(size);
		sq2d = new int[ROWS][COLUMNS];
		
		for (int i = 0; i < size; i++) {
			int input = s.nextInt();
			square.add(input);
			sq2d[i%ROWS][i/COLUMNS] = input;
		}
		//System.out.println(square);
		for (int k=0;k<COLUMNS;k++) {
			for (int j = 0;j<ROWS;j++) {
				System.out.print(sq2d[j][k]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	//Checks if the matrix is a magic square
	public boolean isMagic() {
		System.out.println("Is a Square: "+ (Math.sqrt(size) % 1 == 0));
		System.out.println("Doesn't repeat and contains all numbers: "+ !repeats());
		System.out.println("Rows & Colums =: "+ (rowSum() == colSum()));
		System.out.println("Diagonals =: "+ ((diaSum() == colSum()) & (rowSum() == diaSum())));
		System.out.print("Is Magic: ");
		if ((Math.sqrt(size) % 1 == 0)&(repeats() == false)&(rowSum() == colSum()) & (rowSum() == diaSum())) {System.out.println(true);return true;}
		else {System.out.println(false);return false;}
	}
	//Checks if there are any repeated numbers in the matrix
	public boolean repeats() {
		boolean repeat = false;
		for (int i=1; i <= size; i++) {
			if (square.contains(i)) {repeat = false;}
			else {repeat = true; 
			break;}
		}
		return repeat;
	}
	
	
	
	
	
	
	
	//Calculates the sum of the rows
	public int rowSum() {
		int ret = 0;
		sum = 0;
		
		//Loop through rows
		for (int k = 0; k < ROWS; k++) {
			//Loop through each column in the row
			for (int j = 0; j < COLUMNS; j++) {
				//add the position value to sum
				sum += sq2d[j][k];
			}
			//add the sum for the row to rowSums and reset the count sum
			rowSums.add(sum);
			sum = 0;
		}
		//Loop through sums of rows
		for (int i = 1; i < ROWS; i++) {
			//if the sum is equal to the last sum, set the return value to the sum. Otherwise, set it to -1 and skip to returning
			if (rowSums.get(i) == rowSums.get(i-1)) {
				ret = (int) rowSums.get(i);
			}
			else {
				ret = -1;
				break;
			}
		}
		rowSums.clear();
		return ret;
	}
	
	
	
	
	
	
	
	
	//Calculates the some of the columns
	public int colSum() {
		int ret = 0;
		sum = 0;
		
		//Loop through columns
		for (int k = 0; k < COLUMNS; k++) {
			//Loop through each row in the column
			for (int j = 0; j < ROWS; j++) {
				//add the position value to sum
				sum += sq2d[k][j];
			}
			//add the sum for the column to colSums and reset the count sum
			colSums.add(sum);
			sum = 0;
		}
		//Loop through sums of columns
		for (int i = 1; i < COLUMNS; i++) {
			//if the sum is equal to the last sum, set the return value to the sum. Otherwise, set it to -1 and skip to returning
			if (colSums.get(i) == colSums.get(i-1)) {
				ret = (int) colSums.get(i);
			}
			else {
				ret = -2;
				break;
			}
		}
		colSums.clear();
		return ret;
	}
	
	//Calculates the sum of the diagonals
	public int diaSum() {
		int ret = 0;
		sum = 0;
		
		for (int j = 0; j < COLUMNS; j++) {
			sum += sq2d[j][j];
		}
		diaSums.add(sum);
		sum = 0;
		
		for (int j = 0; j < COLUMNS; j++) {
			sum += sq2d[COLUMNS - j - 1][j];
		}
		diaSums.add(sum);
		sum = 0;
		
		if (diaSums.get(0) == diaSums.get(1)) {
			ret = (int) diaSums.get(1);
		}
		else {
			ret = -3;
		}
		diaSums.clear();
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		MSQ m = new MSQ(4);
		System.out.println(m.colSum());
		System.out.println(m.rowSum());
		System.out.println(m.diaSum());
		System.out.println(m.isMagic());
	}
}