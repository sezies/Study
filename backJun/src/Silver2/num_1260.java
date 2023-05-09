package Silver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class num_1260 {
	static boolean[] visit;
	static int[][] graph;
	static Queue<Integer> bfs_que = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
		 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
		 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
		 * 
		 * 입력: 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
		 * 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
		 * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
		 * 
		 * 출력: 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
		 * 
		 * 예제: 		4 5 1					출력:  1 2 4 3
		 *          1 2                           1 2 3 4
		 *          1 3
		 *          1 4
		 *          2 4
		 *          3 4
		 * 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());		// 정점의 갯수
		int M = Integer.parseInt(st.nextToken());		// 간선의 갯수
		int V = Integer.parseInt(st.nextToken());		// 탐색을 시작할 정점의 번호
		
		graph = new int[N+1][N+1];
		
		for(int n=0; n < M; n++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		
		
		visit = new boolean[N+1];
		dfs(V);
		System.out.println();
		visit = new boolean[N+1];
		bfs(V);
		
		br.close();
	}
	public static void bfs(Integer v) {
		if(v == null) return;
		visit[v] = true;
		System.out.print(v + " ");
		for(int n=1; n<graph[v].length;n++) {
			if(graph[v][n] == 1 && !visit[n]) {
				visit[n] = true;
				bfs_que.add(n);
			}
		}
		bfs(bfs_que.poll());
	}
	public static void dfs(int v) {
		visit[v] = true;
		System.out.print(v + " ");
		for(int n=1; n<graph[v].length;n++) {
			if(graph[v][n] == 1 && !visit[n]) dfs(n);
		}
	}

}
