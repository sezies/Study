package java_fes;
public class moon_03 {
	public static void main(String[] args) {
		// 1-2+3-4+...+99-100�� ����ϱ�
		// ��, 1~100���� ��� ���ϴµ�, ¦���� �����μ� ���.
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
		System.out.println("\n��� : "+result);
	}
}
