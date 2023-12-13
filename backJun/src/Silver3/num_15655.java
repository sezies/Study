package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_15655 {
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int[] arr_N;
	static boolean[] arr_bool;
	public static void main(String[] args) throws IOException{
		/**
		 * 문제: N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오. N개의 자연수는 모두 다른 수이다.
		 * 				- N개의 자연수 중에서 M개를 고른 수열
		 * 				- 고른 수열은 오름차순이어야 한다.
		 * 입력: 첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
		 * 		둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.
		 * 출력: 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
		 * 		수열은 사전 순으로 증가하는 순서로 출력해야 한다.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr_N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr_N);
		arr_bool = new boolean[N];
		back_dfs(0, "", 0);
		System.out.println(sb);
		br.close();
		
		
	}
	public static void back_dfs(int idx, String rtn_p, int val_i) {
		String rtn_func = "";
		boolean[] func_arr_bool = arr_bool.clone();
		if(idx == M) {
			rtn_p+="\n";
			sb.append(rtn_p);
			return;
		}
		
		for(int i=val_i; i<N; i++) {
			if(!func_arr_bool[i]) {
				rtn_func = (rtn_p + arr_N[i] + " ");
				arr_bool[i] = true;
				back_dfs(idx+1, rtn_func, i+1);
				arr_bool[i] = false;
			}
		}
	}

}
