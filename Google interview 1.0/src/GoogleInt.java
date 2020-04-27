
public class GoogleInt {
	 public String GoogleInterview( double one, double two, double three, double four )
	 { 
		  double bir  = one;
		  double iki = two;
		  double uc = three;
		  double dort = four;
		  double result = 0;
		  double sum = 8;
		  double X_Value;
		  double Y_Value;
		  
		  if (bir + iki == sum){
			  X_Value = bir;
			  Y_Value = iki ;
			  String solution = X_Value + " + " + Y_Value + " = " + sum; 
			  return solution;
		  }
		  else if (bir + uc == sum){
			  X_Value = bir;
			  Y_Value = uc;
			  String solution = X_Value + " + " + Y_Value + " = " + sum; 
			  return solution;
		  }
		  else if (bir + dort == sum){
			  X_Value = bir;
			  Y_Value = dort;
			  String solution = X_Value + " + " + Y_Value + " = " + sum; 
			  return solution;
		  }
		  else if (iki + uc == sum){
			  X_Value = iki;
			  Y_Value = uc;
			  String solution = X_Value + " + " + Y_Value + " = " + sum; 
			  return solution;
		  }
		  else if (iki +dort == sum) {
			  X_Value = dort;
			  Y_Value = iki;
			  String solution = X_Value + " + " + Y_Value + " = " + sum; 
			  return solution;
		  }
		  else if (uc + dort == sum) {
			  X_Value = uc;
			  Y_Value = dort;
			  String solution = X_Value + " + " + Y_Value + " = " + sum; 
			  return solution;
		  }
		  else {
			  return "No Solutions Available";
		  }
		 
		  // How can you return multiple double values
		  
	 }
}
  