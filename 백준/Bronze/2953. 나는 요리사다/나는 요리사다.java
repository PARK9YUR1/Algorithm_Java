import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int mx = 0; 
		int mxIdx = 0; 

		for (int i=0; i<5; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			arr[i] = a+b+c+d;
			if (mx < arr[i]) {
				mx = arr[i];
				mxIdx = i+1;
			}
		}

		System.out.println(mxIdx + " " + mx);
	}
}