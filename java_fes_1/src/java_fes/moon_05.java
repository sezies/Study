package java_fes;

import java.util.Scanner;

public class moon_05 {

	public static void main(String[] args) {
		// 정수를 입력받아 1의 자리에서 반올림한 결과를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num%10>=5) {
			System.out.println("반올림 수 :"+(num+10-num%10));
		}
		else {
			System.out.println("반올림 수 : "+(num-num%10));
		}
	}

}
