package java_fes;

import java.util.Scanner;

public class moon_04 {
	public static void main(String[] args) {
		// �Ž������� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ� ���α׷�.
		// ��, �ִ� ������ 10000��, �ּҴ����� 100��.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ݾ� �Է� : ");
		int cn = sc.nextInt();
		System.out.println("�ܵ� : "+cn+"��");
		System.out.println("10000�� : "+(cn/10000)+"��");
		System.out.println("5000�� : "+(cn%10000)/5000+"��");
		System.out.println("1000�� : "+(cn%5000)/1000+"��");
		System.out.println("500�� : "+(cn%1000)/500+"��");
		System.out.println("100�� : "+(cn%500)/100+"��");
	}

}
