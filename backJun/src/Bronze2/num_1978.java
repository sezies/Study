package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class num_1978 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력: 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
		 * 
		 * 출력: 주어진 수들 중 소수의 개수를 출력한다.
		 * 
		 * 예제
		 * 입력				출력
		 * 4				3
		 * 1 3 5 7
		 * */
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 int n = Integer.parseInt(st.nextToken());
		 int[] arr_Sosu = new int[1001];
		 
		 Arrays.fill(arr_Sosu, 1);
		 for(int i=2; i<1001;i++) {
			 for(int j=1; j*i<1001;j++) {
				 arr_Sosu[i*j]+=1;
			 }
		 }
		 int result = 0;
		 for(int n_val : Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()) if(arr_Sosu[n_val] == 2) result++;
		 
		 System.out.println(result);
	}

}
