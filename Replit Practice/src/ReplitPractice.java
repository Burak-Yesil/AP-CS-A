import java.util.Scanner;
import java.util.ArrayList;

class ReplitPractice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  
  System.out.println("Welcome to this program. This program will Give you the maximum number in \n the set of numbers you enter. So lets get started. Start by entering the \n number of values in your number list.");

  int num = in.nextInt();

  ArrayList <Double> numberSet = new <Double> ArrayList();
  
  for (int i = 0; i<num; i++){
    System.out.println("Enter a number " + (i+1));
    numberSet.add(in.nextDouble());
  }
  double MAX_Value = numberSet.get(0);
  for (int i = 0;  i<num; i++){
    if (numberSet.get(i)>MAX_Value){
      MAX_Value = numberSet.get(i);
    }
  }
  System.out.println("The Maximum Value is: ");
  System.out.println(MAX_Value);
  }
}