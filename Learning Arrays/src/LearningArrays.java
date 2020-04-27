import java.util.Arrays;
import java.util.Scanner;

public class LearningArrays {
public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	int firstArray [][] = new int [3][3];
	int count = 1;
	for (int i = 0; i< firstArray.length; i++) {
		for (int k = 0; k<firstArray.length; k++) {
		firstArray[i][k] = in.nextInt();
	
		System.out.println(count);
		count++;
		}
	}
		Arrays.sort(firstArray);	
		System.out.println(Arrays.toString(firstArray));
}
}
