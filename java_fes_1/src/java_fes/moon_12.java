package java_fes;

import java.util.Scanner;

public class moon_12 {
	public static void main(String[] args) {
		// 10진수 정수를 입력 받아 2진수로 변환해서 출력하기.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력");
		int num = sc.nextInt();
		String ans = "";
		while(true) {
			if(num==1) {
				ans="1 "+ans;
				break;}
			ans = num%2+" "+ans;
			num/=2;
		}
		System.out.println(ans);
	}
}
