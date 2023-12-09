import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int nums[] = new int[5];
		
		for (int i=0; i<5; i++) {
			int score = sc.nextInt();
			nums[i] = score;
			total += score;
		}
		
		Arrays.sort(nums);
		
		System.out.println(total/5);
		System.out.println(nums[2]);
	}
}