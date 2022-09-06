package java_fes;
import java.util.*;

public class moon_11 {

	public static void main(String[] args) {
		// 소인수 분해를 해주는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
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
