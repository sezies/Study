package java_fes;
public class moon_03 {
	public static void main(String[] args) {
		// 1-2+3-4+...+99-100를 계산하기
		// 즉, 1~100까지 모두 더하는데, 짝수는 음수로서 계산.
		int result=0;
		for(int i=1;i<101;i++) {
			if (i%2==0){
				result+=(-1*i);
				System.out.print(-1*i+" ");
			}
			else {
			result+=i;
			System.out.print(i+" ");
			}
		}
		System.out.println("\n결과 : "+result);
	}
}
