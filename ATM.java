import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sum = 0;
		int [] ia = new int[n];
		
		for(int i=0; i<n; i++) {
			ia[i] = s.nextInt();
		}
		
		Arrays.sort(ia);
		
		for(int i=0; i<n; i++) {
			sum += ia[i] * (n-i);
			System.out.println(sum);
		}
		
		System.out.println(sum);
	}
}
/* 5
 * 3 1 4 3 2
 * 
 * 32
 */