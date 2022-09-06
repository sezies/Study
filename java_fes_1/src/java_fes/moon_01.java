package java_fes;
import java.util.Scanner;
public class moon_01 {
	public static void main(String[] args) {
		// 현재몸무게와 목표몸무게를 각각 입력 받고
		// 주차별 감량몸무게를 입력받아 목표 달성 시 축하메세지를 띄우는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게: ");
		int r_m = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int m_m = sc.nextInt();
		int i=1;
		while (true) {
			System.out.print(i + "주차 감량 몸무게 : ");
			int w = sc.nextInt();
			r_m-=w;
			if(r_m<=m_m) {
				System.out.println(r_m+"kg 달성!! 축하합니다!");
				break;
			}
			i+=1;
		}
	}

}
