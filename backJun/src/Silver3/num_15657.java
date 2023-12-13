package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_15657 {
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int[] arr_N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr_N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr_N);
		back_dfs(0, "", 0);
		System.out.println(sb);
		br.close();
		
		
	}
	public static void back_dfs(int idx, String rtn_p, int val_i) {
		String rtn_func = "";
		if(idx == M) {
			rtn_p+="\n";
			sb.append(rtn_p);
			return;
		}
		
		for(int i=val_i; i<N; i++) {
			rtn_func = (rtn_p + arr_N[i] + " ");
			back_dfs(idx+1, rtn_func, i);
		}
	}

}
