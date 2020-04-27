public class Converter {
	
	//Sets a value for convFactor based on a user input
	public Converter (double aConversionFactor){	
		convFactor = aConversionFactor;		
		
	}
	//converts the value by multiplying the fromMeasurement value and ConvFactor 
	public double convertTo(double fromMeasurement){	
		measurement = fromMeasurement*convFactor;
		return measurement;	
	}
	
	//Converts the measurements
	public double convertFrom(double toMeasurement){
		measurement = toMeasurement/convFactor;
		return measurement;	
	}
	
	//Constructors
	private double convFactor;
	private double measurement;
}
