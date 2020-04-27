
public class Grade {
	
	public String getNumericGrade(String ilgrade) 
	{
		String lgrade = ilgrade;
		double numGrade = 0;
		
		if (lgrade.compareToIgnoreCase("A+") == 0) numGrade = 4.3;
		else if (lgrade.compareToIgnoreCase("A") == 0) numGrade = 4;
		else if (lgrade.compareToIgnoreCase("A-") == 0) numGrade = 3.7;
		else if (lgrade.compareToIgnoreCase("B+") == 0) numGrade = 3.3;
		else if (lgrade.compareToIgnoreCase("B") == 0) numGrade = 3;
		else if (lgrade.compareToIgnoreCase("B-") == 0) numGrade = 2.7;
		else if (lgrade.compareToIgnoreCase("C+") == 0) numGrade = 2.3;
		else if (lgrade.compareToIgnoreCase("C") == 0) numGrade = 2;
		else if (lgrade.compareToIgnoreCase("C-") == 0) numGrade = 1.7;
		else if (lgrade.compareToIgnoreCase("D+") == 0) numGrade = 1.3;
		else if (lgrade.compareToIgnoreCase("D") == 0) numGrade = 1;
		else if (lgrade.compareToIgnoreCase("D-") == 0) numGrade = .7;
		else numGrade = 0;
		return String.valueOf(numGrade);
	}
	
}
