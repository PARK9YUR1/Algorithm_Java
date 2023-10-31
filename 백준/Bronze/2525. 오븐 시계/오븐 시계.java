import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		
		if (M + X < 60) {
			M += X;
		} else {
			int h = (M+X)/60;
			int x = (M+X)%60;
			M = x;

			if (H + h < 24) {
				H += h;
			} else {
				H = (H+h) - 24;
			}
		}
		System.out.println(H +" "+ M);
	}
}