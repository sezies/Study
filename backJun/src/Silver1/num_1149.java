package Silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class num_1149 {
	static int[][] rgb_arr;
	static int[][] rgb_path_arr;
	static int[][] choice_arr= {{1,2}, {0,2}, {0,1}};
	public static void main(String[] args) throws IOException {
		/**
		 * 문제: RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
		 * 집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 
		 * 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.
		 * 			-> 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
		 * 			-> N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
		 * 			-> i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
		 * 
		 * 입력: 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 
		 * 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
		 * 
		 * 출력: 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
		 * 
		 * 예제 
		 * 입력				출력		|	입력				출력		|	입력				출력		|	입력				출력
		 * 3       			96		|	3        		3       |	3          		102     |	6       		208
		 * 26 40 83					|   1 100 100               |   1 100 100               |   30 19 5 
		 * 49 60 57					|   100 1 100               |   100 100 100             |   64 77 64
		 * 13 89 99					|   100 100 1               |   1 100 100               |   15 19 97
		 *                          |                           |                           |   4 71 57 
		 *                          |                           |                           |   90 86 84
		 *                          |                           |                           |   93 32 91
		 * 
		 **/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		rgb_arr = new int[N][3];
		rgb_path_arr = new int[N][3];
		for(int i=0; i<N ; i++) rgb_arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] rtn_arr = new int[3];
		
		for(int rtn=0; rtn<3; rtn++) {
			rtn_arr[rtn] = calculate_rgb(N-1, rtn);
		}
		Arrays.sort(rtn_arr);
		System.out.println(rtn_arr[0]);
		br.close();
		
	}
	public static int calculate_rgb(int x, int y) {
		if(x<1) return rgb_arr[x][y];
		
		if(rgb_path_arr[x][y] > 0) return rgb_path_arr[x][y];
		
		rgb_path_arr[x][y] = rgb_arr[x][y] + Math.min(calculate_rgb(x-1, choice_arr[y][0]), calculate_rgb(x-1, choice_arr[y][1]));
		
		return rgb_path_arr[x][y];
	}

}
