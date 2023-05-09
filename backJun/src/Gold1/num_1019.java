package Gold1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class num_1019 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 지민이는 전체 페이지의 수가 N인 책이 하나 있다. 첫 페이지는 1 페이지이고, 마지막 페이지는 N 페이지이다. 각 숫자가 전체 페이지 번호에서 모두 몇 번 나오는지 구해보자.
		 * 입력: 첫째 줄에 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
		 * 출력: 첫째 줄에 0이 총 몇 번 나오는지, 1이 총 몇 번 나오는지, ..., 9가 총 몇 번 나오는지를 공백으로 구분해 출력한다.
		 * 
		 * 예제
		 * 입력 - 11							|| 출력 - 1 4 1 1 1 1 1 1 1 1 
		 * 입력 - 7							|| 출력 - 0 1 1 1 1 1 1 1 0 0
		 * 입력 - 19							|| 출력 - 1 12 2 2 2 2 2 2 2 2
		 * 입력 -	 999						|| 출력 - 189 300 300 300 300 300 300 300 300 300
		 * 입력 - 543212345					|| 출력 - 429904664 541008121 540917467 540117067 533117017 473117011 429904664 429904664 429904664 429904664
		 * */
		/*
		 9	- 0 1 1 1 1 1 1 1 1 1
		19	- 1 12 2 2 2 2 2 2 2 2
		29	- 2 13 13 3 3 3 3 3 3 3
		39	- 3 14 14 14 4 4 4 4 4 4
		49	- 4 15 15 15 15 5 5 5 5 5
		
		10	- 1 2 1 1 1 1 1 1 1 1
		20	- 2 12 3 2 2 2 2 2 2 2
		30	- 3 13 13 4 3 3 3 3 3 3
		40	- 4 14 14 14 5 4 4 4 4 4
		50	- 5 15 15 15 15 6 5 5 5 5
		
		
		150	- 25 86 35 35 35 26 25 25 25 25
		*/
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<String, Object> return_m = new HashMap<>();
		
		for(int i=0; i<10;i++) return_m.put(i+"", 0);
		int val_N = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int cur_n = 1; cur_n < val_N+1; cur_n++) {
			cnt = cur_n;
			while(cnt != 0) {
				return_m.put(cnt%10+"", (int)return_m.get(cnt%10+"")+1);
				cnt/=10;
			}
		}
		String return_val = "";
		for(int i=0;i<10;i++)
			return_val+= return_m.get(i+"") + " ";
		
		System.out.println(return_val.substring(0, return_val.length()-1));
		br.close();
	}

}
