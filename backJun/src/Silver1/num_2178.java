package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num_2178 {
	static int[][] visit;
	static int[][] graph;
	static int[][] road = {{0,-1}, {0,1}, {-1,0}, {1,0}};
	static Deque<int[]> bfs_que = new ArrayDeque<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());		// 가로
		int M = Integer.parseInt(st.nextToken());		// 세로
		
		graph = new int[N][M];
		
		for(int n=0; n < N; n++) {
			String t = br.readLine().strip();
			char[] val = t.toCharArray();
			for(int m=0; m < M; m++) {
				graph[n][m] = Integer.parseInt(String.valueOf(val[m]));
			}
		}
		br.close();
		
		visit = new int[N][M];
		visit[0][0] = 1;
		bfs(0,0);
		System.out.println(visit[N-1][M-1]);
		
		
	}
	public static void bfs(int n, int m) {
		int[] arr_add = {n,m};
		bfs_que.add(arr_add);
		int x=0;
		int y=0;
		int n_p = 0;
		int m_p = 0;
		int[] arr_p;
		while(!bfs_que.isEmpty()) {
			arr_p = bfs_que.poll();
			n_p = arr_p[0];
			m_p = arr_p[1];
			int val = visit[n_p][m_p];
			for(int[] arr : road) {
				x = arr[0];
				y = arr[1];
				if(x+n_p >= 0 && x+n_p < graph.length && y+m_p >= 0 && y+m_p < graph[0].length) {
					if(graph[n_p + x][m_p + y] == 1 && visit[x+n_p][y+m_p] == 0) {
						visit[n_p+x][m_p+y] = visit[n_p][m_p] + 1;
						bfs_que.add(new int[] {x+n_p, y+m_p});
					}
				}
			}
		}
	}
}
