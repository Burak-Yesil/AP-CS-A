public class FPCompare {
	
	public String Compare(double inum1, double inum2) {
		double rnum1 =  Math.round(inum1 * 100);
		double rnum2 = 	Math.round(inum2 * 100);
		double diff = Math.pow((inum1 - inum2), 2);
		String output = "";
		
		if (rnum1 == rnum2) output = "They are the same when rounded to two decimal places.";
		else output = "They are different when rounded to two decimal places";
		
		if (diff <= 0.01) output += "\n" + "They differ by less than 0.01";
		else output += "\n" + "They differ by more than 0.01";
		
		return output;
	}	
}