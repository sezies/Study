package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class num_1929 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력: 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
		 * 
		 * 출력: 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
		 * 
		 * 예제
		 * 입력				출력
		 * 3 16				3
		 *                  5
		 *                  7
		 *                  11
		 *                  13
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr_Sosu = new int[1000001];
		
		Arrays.fill(arr_Sosu, 1);
		for(int i=2; i<arr_Sosu.length;i++) {
			for(int j=1; j*i<arr_Sosu.length;j++) {
				arr_Sosu[i*j]+=1;
			}
		}
		
		for(int i=m;i<=n;i++) {
			if(arr_Sosu[i] == 2) bw.write(i + "\n");
		}
		bw.close();
		br.close();
		
	}

}
