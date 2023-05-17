package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2609 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력: 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
		 *
		 * 출력: 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
		 * 
		 * 예제:
		 * 입력: 24 18
		 * 출력:	6
		 * 		72
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int min = N>=M ? M : N;
		int gon_yak = 1;
		for(int i=2;i <= min;i++) {
			if(N%i == 0 && M%i == 0) gon_yak = i;
		}
		System.out.println(gon_yak);
		System.out.println(gon_yak*(N/gon_yak)*(M/gon_yak));
		br.close();
	}

}
