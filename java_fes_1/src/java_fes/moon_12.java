package java_fes;

import java.util.Scanner;

public class moon_12 {
	public static void main(String[] args) {
		// 10���� ������ �Է� �޾� 2������ ��ȯ�ؼ� ����ϱ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�");
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
