package java_fes;
import java.util.Scanner;
public class moon_01 {
	public static void main(String[] args) {
		// ��������Կ� ��ǥ�����Ը� ���� �Է� �ް�
		// ������ ���������Ը� �Է¹޾� ��ǥ �޼� �� ���ϸ޼����� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������: ");
		int r_m = sc.nextInt();
		System.out.print("��ǥ ������: ");
		int m_m = sc.nextInt();
		int i=1;
		while (true) {
			System.out.print(i + "���� ���� ������ : ");
			int w = sc.nextInt();
			r_m-=w;
			if(r_m<=m_m) {
				System.out.println(r_m+"kg �޼�!! �����մϴ�!");
				break;
			}
			i+=1;
		}
	}

}
