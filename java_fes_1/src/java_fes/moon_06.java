package java_fes;
import java.util.Scanner;
public class moon_06 {
	public static void main(String[] args) {
		// �� ������ �Է¹޾� �ִ����� & �ּҰ������ ����Ͻÿ�,
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� >> ");
		int num2 = sc.nextInt();
		int cnt=2;
		int yak =1;
		int be = 1;
		while(true) {
			if (num1%cnt ==0 && num2%cnt==0) {
				yak*=cnt;
				num1/=cnt;
				num2/=cnt;
			}
			else if(num1<cnt || num2<cnt) {
				be=num1*num2*yak;
				break;
			}
			else {
				cnt+=1;
			}
		}
		System.out.println("�ִ����� : " + yak+"\n�ּҰ���� : "+be);
	}

}
