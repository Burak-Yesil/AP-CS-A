import java.util.ArrayList;


public class Purse {
	ArrayList <String>  purseArray = new <String> ArrayList();

//7.22
	 void addString(String stringName) 
	 {
		purseArray.add(stringName);
	 }
	
	 void ToString() 
	 {
		System.out.println("purse" + purseArray  );
	 }

//P7.3
	 void reverseArray() 
	 {
		ArrayList<String> revCoins = new ArrayList<String>();
		for (int i = purseArray.size()-1; i >= 0; i--) {
			revCoins.add(purseArray.get(i));
		}
		purseArray = revCoins;
	 }
		


	
	
//7.4
	public void transfer(Purse b, Purse a) 
	{
	
			a.purseArray.addAll(b.purseArray);
	
		a.ToString();
	}
	
	
//7.5	
	public boolean sameContents(Purse x, Purse y) 
	{
		return purseArray.equals(y.purseArray);	

	}

//7.6
	
	public boolean sameCoins (Purse x, Purse y) 
	{
		boolean result = true;
		for (int i = 0; i < y.purseArray.size(); i++) 
		{
			if (x.purseArray.contains(y.purseArray.get(i))) 
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}
		return result;
	}
	 
	 
//Main Method
public static void main(String[] args) {
		
		//purse is a class and how does it create a array
		
		Purse a = new Purse();
		a.addString("Dime");
		a.addString("Nickel");
		a.addString("Quarter");
		a.addString("Quarter");
		a.addString("Penny");
		Purse b = new Purse();
		b.addString("Dime");
		b.addString("Nickel");
		b.addString("Quarter");
		b.addString("Quarter");
		b.addString("Penny");
		

	// Add Array Print test
		System.out.println("Add Element Results: ");
		a.ToString();
		System.out.println();
//------------------------------------------------------------------	
		System.out.println("Reverse Method Results: ");
		a.reverseArray(); 
		a.ToString(); 
		System.out.println();
//------------------------------------------------------------------	
		System.out.println("Transfer Method Result: ");
		a.transfer(b,a);
		System.out.println();
//------------------------------------------------------------------	
		System.out.println("Arrays Contain Same Contents: ");
		System.out.println(a.sameContents(a,b));
		System.out.println();
//------------------------------------------------------------------	
		System.out.println("Arrays contain same coins: ");
		System.out.println(a.sameCoins(a,b));
	
		
}

}
