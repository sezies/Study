package java_fes;
import java.util.Scanner;
public class moon_02 {
	public static void main(String[] args) {
		// ���� �ð��� �Է� �޾� �� �ӱ��� ����ϴ� ����
		// �ñ��� 5000���̸� 8�ð����� �ʰ� �ٹ��� �ð��� ���� 1.5���� �ñ��� å�� ��.
		// 10�ð� �ٹ�  ==>  55000��.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int siga = 5000;
		if(time > 8) {
			System.out.println("�� �ӱ��� "+ (int)(siga*8+((time-8)*1.5*siga)) + "�Դϴ�.");
		}
		else {
			System.out.println("�� �ӱ��� "+ time*siga + "�Դϴ�.");
		}
	}
}
