package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class num_2309 {

	public static void main(String[] args) throws IOException {
		/**
		 * 문제: 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
		 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
		 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
		 * 
		 * 입력: 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
		 * 
		 * 출력: 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
		 * 
		 * 예제 
		 * 입력		출력
		 * 20		7 
		 * 7        8 
		 * 23       10
		 * 19       13
		 * 10       19
		 * 15       20
		 * 25       23
		 * 8
		 * 13
		 * 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		List<Integer> nine_human = new ArrayList<>();
		for(int i=0; i<9;i++) nine_human.add(Integer.parseInt(br.readLine()));
		Collections.sort(nine_human);
		int rmd = Math.abs(nine_human.stream().mapToInt(Integer::intValue).sum() - 100);
		int[] pos_arr = new int[2];
		Loop1:
		for(int i=0;i<nine_human.size()-1;i++) {
			for(int j=i+1;j<nine_human.size();j++) {
				if(rmd == nine_human.get(i)+ nine_human.get(j)) {
					pos_arr[0]=nine_human.get(i);
					pos_arr[1]=nine_human.get(j);
					break Loop1;
				}
			}
		}
		nine_human.remove(Integer.valueOf(pos_arr[0]));
		nine_human.remove(Integer.valueOf(pos_arr[1]));
		
		for(int val : nine_human) System.out.println(val);
	}

}