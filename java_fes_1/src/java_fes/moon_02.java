package java_fes;
import java.util.Scanner;
public class moon_02 {
	public static void main(String[] args) {
		// 일한 시간을 입력 받아 총 임금을 계산하는 문제
		// 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해 1.5배의 시급이 책정 됨.
		// 10시간 근무  ==>  55000원.
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int siga = 5000;
		if(time > 8) {
			System.out.println("총 임금은 "+ (int)(siga*8+((time-8)*1.5*siga)) + "입니다.");
		}
		else {
			System.out.println("총 임금은 "+ time*siga + "입니다.");
		}
	}
}
