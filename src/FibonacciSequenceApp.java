import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSequenceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Fibonacci Sequence App!\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number Fibonacci Sequence terms  you would like: ");
		int nbrOfTerms = sc.nextInt();
		
		int[] fibTerms = new int[nbrOfTerms];
		fibTerms[0] = 1;
		fibTerms[1] = 1;
		
		for (int i=0; i < (nbrOfTerms - 2); i++) {
			fibTerms[i + 2] = fibTerms[i] + fibTerms[i + 1];
		}

		System.out.println("The first " + nbrOfTerms + " terms of the Fibonacci Sequence are: ");
		for (int j=0; j < nbrOfTerms; j++) {
			if(j<nbrOfTerms - 1) 
			System.out.print(fibTerms[j] + ", ");
			else
			System.out.print(fibTerms[j]);	
		}
		System.out.println("\n\nDisplayed as an array:");
		System.out.println(Arrays.toString(fibTerms));
		sc.close();
	}

}
