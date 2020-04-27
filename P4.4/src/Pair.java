import java.lang.Math;

//Makes different calculations based on a user input
public class Pair{
	//constructors 
	double first;
	double second;
	
	//Method pair
	public Pair( double aFirst, double aSecond ){	
		first = aFirst;
		second = aSecond;
	}
	
	//Method getSum
	public double getSum(){	
		return (first + second);	
	}
	
	//Method getDifference
	public double getDifference(){	
		return (first - second);
	}
	
	//Method getProduct
	public double getProduct(){
		return (first * second);
	}
	
	//Method getAvg
	public double getAvg(){
		return ( (first + second) / 2.0);
	}
	
	//Method getDistance
	public double getDistance(){
		return (Math.abs( first - second ) );
	}
	
	//Method getMax
	public double getMax(){
		return Math.max( first, second );
	}
	
	//Method getMin
	public double getMin(){
		return Math.min( first, second );
	}
}
