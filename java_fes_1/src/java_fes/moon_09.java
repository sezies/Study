package java_fes;

import java.util.Scanner;

public class moon_09 {

	public static void main(String[] args) {
		// �� ������ �Է� �޾� �ﰢ�� ���
		// �ﰢ���� ������ ��, �����ﰢ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int row = sc.nextInt();
		for(int i=row;i>0;--i) {
			for(int j=i;j>0;--j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
