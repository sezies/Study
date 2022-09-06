package java_fes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_file {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		
		System.out.println(solve(max,min));
		br.close();
	}
	
	public static int solve(long max, long min) {
		int return_cnt = (int) (max-min+1);
		
		boolean[] chk_arr = new boolean[return_cnt];
		for(long i=2; i*i <= max; i++) {
			long div =  min % (i*i) == 0 ? min/(i*i) : min/(i*i) + 1;
			for(long j=div; j*(i*i) <= max; j++) {
				int idx = (int) (j*(i*i) - min);
				if(!chk_arr[idx]) {
					chk_arr[idx] = true;
					return_cnt--;
				}
			}
		}
		return return_cnt;
	}

}
