package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class num_145000 {

	public static void main(String[] args) throws IOException{
		/**
		 * 문제: 폴리오미노란 크기가 1×1인 정사각형을 여러 개 이어서 붙인 도형이며, 다음과 같은 조건을 만족해야 한다.
		 * 			-> 정사각형은 서로 겹치면 안 된다.
		 * 			-> 도형은 모두 연결되어 있어야 한다.
		 * 			-> 정사각형의 변끼리 연결되어 있어야 한다. 즉, 꼭짓점과 꼭짓점만 맞닿아 있으면 안 된다.
		 * 		정사각형 4개를 이어 붙인 폴리오미노는 테트로미노라고 하며, 다음과 같은 5가지가 있다.
		 * 
		 * 		ㅁㅁㅁㅁ			ㅁㅁ
		 * 						ㅁㅁ
		 * 		ㅁ		ㅁ
		 * 		ㅁ		ㅁㅁ		ㅁㅁㅁ
		 * 		ㅁㅁ		 ㅁ 		 ㅁ
		 * 
		 * 		아름이는 크기가 N×M인 종이 위에 테트로미노 하나를 놓으려고 한다. 종이는 1×1 크기의 칸으로 나누어져 있으며, 각각의 칸에는 정수가 하나 쓰여 있다.
		 * 		테트로미노 하나를 적절히 놓아서 테트로미노가 놓인 칸에 쓰여 있는 수들의 합을 최대로 하는 프로그램을 작성하시오.
		 * 		테트로미노는 반드시 한 정사각형이 정확히 하나의 칸을 포함하도록 놓아야 하며, 회전이나 대칭을 시켜도 된다.
		 * 
		 * 입력: 첫째 줄에 종이의 세로 크기 N과 가로 크기 M이 주어진다. (4 ≤ N, M ≤ 500)
		 * 		둘째 줄부터 N개의 줄에 종이에 쓰여 있는 수가 주어진다. i번째 줄의 j번째 수는 위에서부터 i번째 칸, 
		 * 		왼쪽에서부터 j번째 칸에 쓰여 있는 수이다. 입력으로 주어지는 수는 1,000을 넘지 않는 자연수이다.
		 * 
		 * 출력: 첫째 줄에 테트로미노가 놓인 칸에 쓰인 수들의 합의 최댓값을 출력한다.
		 * 
		 * 예제 
		 * 입력				출력		|		입력				출력		|	입력						출력
		 * 5 5      		19		|		4 5      		20      |	4 10               		7
		 * 1 2 3 4 5				|       1 2 3 4 5               |   1 2 1 2 1 2 1 2 1 2
		 * 5 4 3 2 1				|       1 2 3 4 5               |   2 1 2 1 2 1 2 1 2 1
		 * 2 3 4 5 6				|       1 2 3 4 5               |   1 2 1 2 1 2 1 2 1 2
		 * 6 5 4 3 2				|       1 2 3 4 5               |   2 1 2 1 2 1 2 1 2 1
		 * 1 2 1 2 1				|                               |
		 **/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] val_NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[][] arr_NM = new int[val_NM[0]][val_NM[1]];
		
		for(int i=0;i<arr_NM.length;i++) arr_NM[i]= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(caculate_Tetromino(arr_NM));
		
		
	}
	public static int caculate_Tetromino(int[][] arr_NM) {
		int max = 0;
		max = calculate_caseRectangular4(arr_NM, max);
		max = calculate_caseRectangular6D(arr_NM, max);
		max = calculate_caseRectangular6U(arr_NM, max);
		max = calculate_caseStraight4(arr_NM, max);
		return max;
	}
	public static int calculate_caseRectangular6U(int[][] arr_NM, int max) {
		int cal_val=0;
		int val_R3 = 0,val_L3 = 0,val_Rmax = 0,val_Lmax = 0, val_Pmin=0;
		for(int i=0;i<arr_NM.length-2;i++) {
			for(int j=0;j<arr_NM[0].length-1;j++) {
				val_L3 = arr_NM[i][j] + arr_NM[i+1][j] + arr_NM[i+2][j];
				val_R3 = arr_NM[i][j+1] + arr_NM[i+1][j+1] + arr_NM[i+2][j+1];
				val_Lmax = Math.max(arr_NM[i][j], Math.max(arr_NM[i+1][j], arr_NM[i+2][j]));
				val_Rmax = Math.max(arr_NM[i][j+1], Math.max(arr_NM[i+1][j+1], arr_NM[i+2][j+1]));
				val_Pmin = Math.min(arr_NM[i][j] + arr_NM[i+2][j+1], arr_NM[i][j+1] + arr_NM[i+2][j]);
				cal_val = max3(val_Rmax + val_L3, val_Lmax + val_R3, val_L3 + val_R3 - val_Pmin);
				max = max > cal_val ? max : cal_val;
				
			}
		}
		return max;
	}
	public static int calculate_caseRectangular6D(int[][] arr_NM, int max) {
		int cal_val=0;
		int val_U3 = 0,val_D3 = 0,val_Umax = 0,val_Dmax = 0, val_Pmin=0;
		for(int i=0;i<arr_NM.length-1;i++) {
			for(int j=0;j<arr_NM[0].length-2;j++) {
				val_D3 = arr_NM[i+1][j] + arr_NM[i+1][j+1] + arr_NM[i+1][j+2];
				val_U3 = arr_NM[i][j] + arr_NM[i][j+1] + arr_NM[i][j+2];
				val_Dmax = Math.max(arr_NM[i+1][j], Math.max(arr_NM[i+1][j+1], arr_NM[i+1][j+2]));
				val_Umax = Math.max(arr_NM[i][j], Math.max(arr_NM[i][j+1], arr_NM[i][j+2]));
				val_Pmin = Math.min(arr_NM[i][j] + arr_NM[i+1][j+2], arr_NM[i+1][j] + arr_NM[i][j+2]);
				cal_val = max3(val_Umax + val_D3, val_Dmax + val_U3, val_D3 + val_U3 - val_Pmin);
				max = max > cal_val ? max : cal_val;
				
			}
		}
		return max;
	}
	public static int calculate_caseRectangular4(int[][] arr_NM, int max) {
		int cal_val=0;
		for(int i=0;i<arr_NM.length-1;i++) {
			for(int j=0;j<arr_NM[0].length-1;j++) {
				cal_val = arr_NM[i][j] + arr_NM[i][j+1] + arr_NM[i+1][j+1] + arr_NM[i+1][j];
				max = cal_val>max ? cal_val : max;
				
			}
		}
		return max;
	}
	public static int calculate_caseStraight4(int[][] arr_NM, int max) {
		int cal_val = 0;
		for(int i=0;i<arr_NM.length;i++) {
			for(int j=0;j<arr_NM[0].length-3;j++) {
				cal_val = arr_NM[i][j] + arr_NM[i][j+1] + arr_NM[i][j+2] + arr_NM[i][j+3];
				max = cal_val>max ? cal_val : max;
			}
		}
		
		for(int j=0;j<arr_NM[0].length;j++) {
			for(int i=0;i<arr_NM.length-3;i++) {
				cal_val = arr_NM[i][j] + arr_NM[i+1][j] + arr_NM[i+2][j] + arr_NM[i+3][j];
				max = cal_val>max ? cal_val : max;
			}
		}
		
		return max;
	}
	public static int max3(int val1, int val2, int val3) {
		int max = 0;
		max = val1 > val2 ? val1 : val2;
		max = max > val3 ? max : val3;
		return max;
		
	}

}
