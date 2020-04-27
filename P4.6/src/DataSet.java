public class DataSet{
	
	//sets values of the max and minimum variables
	public DataSet(){
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
	}
	//adds a new value to the max and minimum variables
	public void addValue(int x){
		max = Math.max( max, x);
		min = Math.min( min, x);	
	}
	//returns the value of the variable max
	public int getLargest(){	
		return max;	
	}
	//returns the value of the variable min
	public int getSmallest(){
		return min;
	}
	//constructor variables
	private int max;
	private int min;
}
