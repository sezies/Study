package java_fes;
import java.util.Scanner;
public class moon_06 {
	public static void main(String[] args) {
		// 두 정수를 입력받아 최대공약수 & 최소공배수를 출력하시오,
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >> ");
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
		System.out.println("최대공약수 : " + yak+"\n최소공배수 : "+be);
	}

}
