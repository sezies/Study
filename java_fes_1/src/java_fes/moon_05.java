package java_fes;

import java.util.Scanner;

public class moon_05 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 1�� �ڸ����� �ݿø��� ����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if(num%10>=5) {
			System.out.println("�ݿø� �� :"+(num+10-num%10));
		}
		else {
			System.out.println("�ݿø� �� : "+(num-num%10));
		}
	}

}
