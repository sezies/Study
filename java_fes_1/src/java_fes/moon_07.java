package java_fes;

import java.util.Scanner;

public class moon_07 {
	public static void main(String[] args) {
		// �ళ���� �Է� �޾� �ﰢ���� ����ϱ�
		// �ﰢ���� �غ��� �� �����ﰢ�� ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int row = sc.nextInt();
		for(int i=0;i<row;++i) {
			for(int j=0;j<i+1;++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
