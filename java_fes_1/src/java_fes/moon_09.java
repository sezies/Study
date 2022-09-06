package java_fes;

import java.util.Scanner;

public class moon_09 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 삼각형 출력
		// 삼각형은 윗변이 긴, 직각삼각형의 형태
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();
		for(int i=row;i>0;--i) {
			for(int j=i;j>0;--j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
