import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int s = 0;
		int total = 0;
		
		for (int i=0; i<N; i++) {
			int score = sc.nextInt();
			if (score == 0) {
				s = 0;
			} else {
				if (s == 0) {
					total += 1;
					s = 1;
				} else {
					s += 1;
					total += s;
				}
			}
		}
		System.out.println(total);
	}
}