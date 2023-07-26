package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num_3085 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다. 가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다.
		 * 상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 이제, 모두 같은 색으로 이루어져 있는 가장 긴 
		 * 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다. 사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.
		 * 
		 * 입력: 첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50) 다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 
		 * 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다. 사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.
		 * 
		 * 출력: 첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.
		 * 
		 * 예제 
		 * 입력		출력		|	입력			출력		|		입력			출력
		 * 3  		3		|	4   		4		|		5    		4
		 * CCP              |	PPPP    			|		YCPZY
		 * CCP              |	CYZY    			|		CYZZP
		 * PPC              |	CCPY    			|		CCPPP
		 * 					|	PPCC    			|		YCYZC
		 *                                          		CPPZZ
		 **/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		String[][] bomboni_arr = new String[N][N];
		String[][] copy_arr = new String[N][N];
		for(int i=0; i< N;i++) bomboni_arr[i] = br.readLine().split("");
		int max = 0;
		Loop:
		for(int x=0;x<=N-1;x++) {
			for(int y=0;y<N;y++) {
				if(y != N-1 && !bomboni_arr[x][y].equals(bomboni_arr[x][y+1])) {
					for(int i=0;i<N;i++) copy_arr[i] = bomboni_arr[i].clone();
					max = bomboni(change_arr(x, y, 1, copy_arr),max);
					if(max == N) break Loop;
				}
				if(x != N-1 && !bomboni_arr[x][y].equals(bomboni_arr[x+1][y])) {
					for(int i=0;i<N;i++) copy_arr[i] = bomboni_arr[i].clone();
					max = bomboni(change_arr(x, y, 0, copy_arr.clone()),max);
					if(max == N) break Loop;
				}
			}
		}
		System.out.println(max);
	}
	
	public static int bomboni(String[][] arr, int max) {
		int val = 0;
		for(int i=0; i<arr.length;i++) {
			val=1;
			for(int x=0; x<arr.length-1;x++) {
				if(arr[i][x].equals(arr[i][x+1])) val+=1;
				else {
					max = (max<val)?val:max;
					val = 1;
				};
			}
			max = (max<val)?val:max;
			System.out.println("arr: " + Arrays.deepToString(arr) + " and 행검사: " + i  + "  max값: " + max);
			if(max == arr.length) return max;
			val=1;
			for(int y=0; y<arr.length-1;y++) {
				if(arr[y][i].equals(arr[y+1][i])) val+=1;
				else {
					max = (max<val)?val:max;
					val = 1;
				}
			}
			max = (max<val)?val:max;
			System.out.println("arr: " + Arrays.deepToString(arr) + " and 열검사: " + i  + "  max값: " + max );
			if(max == arr.length) return max;
		}
		return max;
	}
	
	
	
	
	
	
	
	public static String[][] change_arr(int x, int y, int choice, String[][] arr) {
		// 0: 행 | 1: 열
		String val = "";
		if(choice == 0) {
			val = arr[x+1][y];
			arr[x+1][y] = arr[x][y];
		}else {
			val = arr[x][y+1];
			arr[x][y+1] = arr[x][y];
		}
		arr[x][y] = val;
//		System.out.println("==========================================");
//		for(int i=0; i<arr.length;i++) System.out.println(Arrays.toString(arr[i]));
		return arr;
	}

}
