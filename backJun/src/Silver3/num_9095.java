package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num_9095 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
		 * 			-> 1+1+1+1
		 * 			-> 1+1+2
		 * 			-> 1+2+1
		 * 			-> 2+1+1
		 * 			-> 2+2
		 * 			-> 1+3
		 * 			-> 3+1
		 * 		정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
		 * 
		 * 출력: 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
		 * 
		 * 예제 
		 * 입력		출력
		 * 3 		7  
		 * 4        44 
		 * 7        274
		 * 10
		 **/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i< n; i++) {
			int val = Integer.parseInt(br.readLine());
			int c1 = val;
			int c3 = 0;
			int rtn_val = 1;
			
			while(c1 != 0) {
				c1-=1;
				for(int c2=(val-c1)/2; c2>=0; c2--) {
					c3 = Math.abs(val-c1 - c2*2)/3;
					if(c1 + c2*2 + c3*3 != val) continue;
					rtn_val+=(factorial(c1+c2+c3)/(factorial(c1)*factorial(c2)*factorial(c3)));
				}
			}
			bw.write(rtn_val + "\n");
		}
		
		br.close();
		bw.close();
	}
	public static int factorial (int num) {
        if (num == 1 || num == 0)
            return 1;
        
        return num * factorial ( num - 1 );
    }
}
