package java_fes;
import java.util.*;

public class moon_11 {

	public static void main(String[] args) {
		// ���μ� ���ظ� ���ִ� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		int cnt=2;
		System.out.print(num+" = ");
		while(true) {
			if(num/cnt==1 && num%cnt==0) {
				System.out.println(cnt);
				break;
			}
			else if(num%cnt==0) {
				System.out.print(cnt + "*");
				num/=cnt;
			}
			else {
				cnt+=1;
			}
		}
	}
}
