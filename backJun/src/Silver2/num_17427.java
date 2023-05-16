package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_17427 {

	public static void main(String[] args) throws IOException{
		/**
		 * 문제: 두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다. 예를 들어, 2의 약수는 1, 2가 있고, 
		 * 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다. 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다.
		 * x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다. 자연수 N이 주어졌을 때, g(N)을 구해보자.
		 * 
		 * 입력: 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		 * 
		 * 출력: 첫째 줄에 g(N)를 출력한다.
		 * 
		 * 예제 
		 * 입력: 10000
		 * 출력: 82256014
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		long[] arr_fA = new long[1000001];
		Arrays.fill(arr_fA, 1);
		
		for(int i=2;i<arr_fA.length;i++) {
			for(int j=1;i*j<=arr_fA.length-1;j++) {
				arr_fA[i*j] += i;
			}
		}
		long[] arr_gA = new long[1000001];
		arr_gA[1] = 1;
		for(int i=2;i<arr_gA.length;i++) arr_gA[i] = arr_gA[i-1] + arr_fA[i];
		
		System.out.println(arr_gA[N]);
		
	}

}
