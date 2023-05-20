package Silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class num_6588 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다. 
		 * 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다. 예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 
		 * 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다. 이 추측은 아직도 해결되지 않은 문제이다. 
		 * 백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.
		 * 
		 * 입력: 입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다. 
		 * 각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000) 입력의 마지막 줄에는 0이 하나 주어진다.
		 * 
		 * 출력: 각 테스트 케이스에 대해서, n = a + b 형태로 출력한다. 이때, a와 b는 홀수 소수이다. 숫자와 연산자는 공백 하나로 구분되어져 있다.
		 * 만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다. 또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] arr_Sosu = new boolean[1000001];
		Arrays.fill(arr_Sosu, true);
		arr_Sosu[1] = false;
		String ans = "";
		
		for(int i=2;i<arr_Sosu.length;i++) {
			for(int j=2;i*j<arr_Sosu.length;j++) {
				arr_Sosu[i*j] = false;
			}
		}
		
		List<Integer> test = new ArrayList<>(); 
		for(int i=3; i<arr_Sosu.length;i++) if(arr_Sosu[i]) test.add(i);
		int[] val_sosu = test.stream().mapToInt(i->i).toArray();
		
		
		
		String n;
		while(!"0".equals((n = br.readLine()))) {
			int n_val = Integer.parseInt(n);
			int[] arr_result = new int[2];
			for(int i : val_sosu) {
				if(i >=n_val) break;
				
				if(arr_Sosu[n_val-i]) {
					
					arr_result[0] = i; 
					arr_result[1] = n_val-i;
					break;
				}
			}
			ans = arr_result[0] == 0 ? "Goldbach's conjecture is wrong." : n_val + " = " + arr_result[0] + " + " + arr_result[1];
			bw.write(ans+"\n");
		}
		bw.close();
		br.close();
	}
	

}
