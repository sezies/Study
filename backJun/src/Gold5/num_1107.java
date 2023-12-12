package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num_1107 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 수빈이는 TV를 보고 있다. 수빈이는 채널을 돌리려고 했지만, 버튼을 너무 세게 누르는 바람에, 일부 숫자 버튼이 고장났다.
		 *      리모컨에는 버튼이 0부터 9까지 숫자, +와 -가 있다. +를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다.
		 *      채널 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼 있다. 수빈이가 지금 이동하려고 하는 채널은 N이다.
		 *      어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오.
		 *      수빈이가 지금 보고 있는 채널은 100번이다.
		 * 입력: 첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다.
		 *      고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.
		 * 출력: 첫째 줄에 채널 N으로 이동하기 위해 버튼을 최소 몇 번 눌러야 하는지를 출력한다.
		 * 
		 * 예제
		 * 입력				출력			입력				출력		|	입력					출력			|	입력			출력		|	입력						출력
		 * 5457				6		|	100				0		|	500000				11117		|	100  		0		|	1						2
		 * 3						|   5        				|   8              					|   3    				|   9                
		 * 6 7 8					|   0 1 2 3 4				|   0 2 3 4 6 7 8 9					|   1 0 5				|   1 2 3 4 5 6 7 8 9
		 *  
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		int M = Integer.parseInt(br.readLine());
		
		String[] broken_button = new String[M];
		
		if(M > 0) broken_button = br.readLine().split(" ");
		
		
		if("100".equals(N)) {
			System.out.println(0);
			return;
		}
		
		if(M == 10) {
			System.out.println(Math.abs(Integer.parseInt(N)-100));
			return;
		}
		
		
		String up_N = N;
		while(up_N.matches(".*[ ," + Arrays.toString(broken_button).substring(1, Arrays.toString(broken_button).length()-1) + "].*") && Integer.parseInt(up_N) <= 1000000) {
			up_N = String.valueOf(Integer.parseInt(up_N) + 1);
		}
		
		up_N = up_N.matches(".*[ ," + Arrays.toString(broken_button).substring(1, Arrays.toString(broken_button).length()-1) + "].*") ? "-1" : up_N;
		
		String dn_N = N;
		while(dn_N.matches(".*[ ," + Arrays.toString(broken_button).substring(1, Arrays.toString(broken_button).length()-1) + "].*") && !"0".equals(dn_N)) {
			dn_N = String.valueOf(Integer.parseInt(dn_N) - 1);
		}
		
		dn_N = dn_N.matches(".*[ ," + Arrays.toString(broken_button).substring(1, Arrays.toString(broken_button).length()-1) + "].*") ? "-1" : dn_N;
		
		int un = Integer.parseInt(up_N) - Integer.parseInt(N) + up_N.length();
		int dn = Integer.parseInt(N) - Integer.parseInt(dn_N) + dn_N.length();
		
		int cnt_N = -1;
		if(!"-1".equals(up_N)) cnt_N = (un > dn && !"-1".equals(dn_N))  ? dn : un;
		else if(!"-1".equals(dn_N)) cnt_N = (un <= dn && !"-1".equals(up_N))  ? un : dn;
		
		if(cnt_N == -1 || Math.abs(Integer.parseInt(N)-100) < cnt_N) System.out.println(Math.abs(Integer.parseInt(N)-100));
		else System.out.println(cnt_N);
		
	}

}
