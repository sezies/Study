package java_fes;

import java.util.Scanner;

public class moon_07 {
	public static void main(String[] args) {
		// 행개수를 입력 받아 삼각형을 출력하기
		// 삼각형은 밑변이 긴 직각삼각형 형태.
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();
		for(int i=0;i<row;++i) {
			for(int j=0;j<i+1;++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
