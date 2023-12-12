package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class num_15649 {
	static boolean[] arr_bool;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
		 * 		- 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
		 * 입력: 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
		 * 출력: 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다. 
		 * 		수열은 사전 순으로 증가하는 순서로 출력해야 한다.
		 * 예제
		 * 입력		출력		|	입력		출력		|	입력		출력			
		 * 3 1		1		|	4 2		1 2		|	4 4		1 2 3 4
		 *          2       |           1 3     |           1 2 4 3
		 *          3       |           1 4     |           1 3 2 4
		 *                  |           2 1     |           1 3 4 2
		 *                  |           2 3     |           1 4 2 3
		 *                  |           2 4     |           1 4 3 2
		 *                  |           3 1     |           2 1 3 4
		 *                  |           3 2     |           2 1 4 3
		 *                  |           3 4     |           2 3 1 4
		 *                  |           4 1     |           2 3 4 1
		 *                  |           4 2     |           2 4 1 3
		 *                  |           4 3     |           2 4 3 1
		 *                  |                   |           3 1 2 4
		 *                  |                   |           3 1 4 2
		 *                  |                   |           3 2 1 4
		 *                  |                   |           3 2 4 1
		 *                  |                   |           3 4 1 2
		 *                  |                   |           3 4 2 1
		 *                  |                   |           4 1 2 3
		 *                  |                   |           4 1 3 2
		 *                  |                   |           4 2 1 3
		 *                  |                   |           4 2 3 1
		 *                  |                   |           4 3 1 2
		 *                  |                   |           4 3 2 1
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr_bool = new boolean[N];
		String rtn_s = "";
		 
		back_dfs(rtn_s);
		System.out.println(sb);
		br.close();
		
		
	}
	public static void back_dfs(String rtn) {
		String rtn_p = "";
		
		if(rtn.length() == M*2) {
			sb.append(rtn.trim() + "\n");
			return;
		}
		
		for(int i=0; i< arr_bool.length;i++) {
			if(!arr_bool[i]) {
				rtn_p = (rtn + (i+1) + " ");
				arr_bool[i] = true;
				back_dfs(rtn_p);
				arr_bool[i] = false;
			}
		}
		
	}

}
