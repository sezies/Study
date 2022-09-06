package java_fes;
public class moon_08 {
	public static void main(String[] args) {
		// (77*1) + (76*2) + (75*3)+...+(1*77)를 계산하여 출력하기
		int a=77;
		int b=1;
		int cnt=0;
		while(b<78) {
			cnt+=(a*b);
			a-=1;
			b+=1;
		}
		System.out.println(cnt);
	}

}
