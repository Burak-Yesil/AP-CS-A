
public class Year 
{
   public int year;
      public Year(int y) 
      {
    	  year = y;
      }
      public boolean isLeapYear() 
      {
	      if(year % 400 == 0) return true;
	      if(year % 100 == 0) return false;
	      if(year % 4 == 0) return true;
	      else return false;
      }
}    