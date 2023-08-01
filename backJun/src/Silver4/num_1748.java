package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1748 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.
		 * 			1234567891011121314151617181920212223...
		 *      이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.
		 * 
		 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100,000,000)이 주어진다.
		 * 
		 * 출력: 첫째 줄에 새로운 수의 자릿수를 출력한다.
		 * 
		 * 예제 
		 * 입력:		5	|	15	|	120
		 * 출력:		5	|	21  |	252
		 * 
		 **/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(calculate_Number(Integer.parseInt(br.readLine())));
		
		
		
	}
	public static int calculate_Number(int N) {
		int rtn = 0;
		
		if(N/10 == 0) return N;
		
		int len = String.valueOf(N).length();
		
		rtn += (N - (int)(Math.pow(10, len-1)-1)) * (len);
		for(int i= len-1; i>1;i--) {
			rtn += ((int)(Math.pow(10, i)-1) - (int)(Math.pow(10, i-1)-1)) * i;
		}
		rtn +=9;
		
		
		
		return rtn;
	}
}
