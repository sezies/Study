package java_fes;

import java.util.Scanner;

public class moon_10 {

	public static void main(String[] args) {
		// ¦���� �̷��� ������ ���ڰ� �ִٰ� �Ҷ�,
		// �Է��� ������ ¦��� ���� ���ϴ� ����.
//		2�� -> 1
//		3�� -> 7
//		4�� -> 4
//		5�� -> 2, 3, 5
//		6�� -> 0, 6, 9
//		7�� -> 8
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		String inp = sc.next();
		int cnt=0;
		int nu=Integer.parseInt(inp);
		System.out.println(nu);
		for(int i=0;i<inp.length();++i) {
			int num = nu%10;
			nu/=10;
			if(num==1) {cnt+=2;}
			else if(num==7) {cnt+=3;}
			else if(num==4) {cnt+=4;}
			else if(num==2 || num==3 ||num==5) {cnt+=5;}
			else if(num==0 || num==6 || num==9) {cnt+=6;}
			else if(num==8) {cnt+=7;}
			}
		System.out.println("���('-')�� �� �� >> "+cnt);
		}
}
