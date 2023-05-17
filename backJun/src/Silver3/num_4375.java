package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num_4375 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 각 자릿수가 모두 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.
		 * 
		 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다.
		 * 
		 * 출력: 각 자릿수가 모두 1로만 이루어진 n의 배수 중 가장 작은 수의 자리수를 출력한다.
		 * 
		 * 예제
		 * 입력				출력
		 * 3				3								--> 3중 1로만 이루어진 최소값은 111. 즉, 3자리니까 3이 출력 됨.
		 * 7                6
		 * 9901             12
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str_n = br.readLine();
		int N = 0;
		int one = 1;
        int cnt;
		while(str_n  != null) {
			one = 1;
            cnt = 1;
			N = Integer.parseInt(str_n);
			while(true) {
				if((one = one%N) == 0) break;
				else one = one*10+1;
                cnt++;
			}
			bw.write(cnt + "\n");
			str_n = br.readLine();
		}
		br.close();
		bw.close();
	}

}
