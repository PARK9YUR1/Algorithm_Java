import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int prize_money = 0;
		
		if (A == B && B == C) {
			prize_money = 10000 + A * 1000;
		} else if (A == B && B!= C) {
		    prize_money = 1000 + A*100;
		} else if (B == C && C!= A) {
		    prize_money = 1000 + B*100;
		} else if (C == A && A!= B) {
		    prize_money = 1000 + C*100;
		} else { 
		    if (A > B && A > C) { 
		        prize_money = A*100;
		    } else if (B > C && B > A) { 
		        prize_money = B*100;
		    } else if (C > A && C > B) {
		        prize_money = C*100;
		    }
		}
		System.out.print(prize_money);
	}
}