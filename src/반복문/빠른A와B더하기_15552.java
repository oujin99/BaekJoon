package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른A와B더하기_15552 {
	public static void main(String[] args) throws IOException {
		
		/*
		 <입력>
		첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
		다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

		<출력>
		각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

		<예제 입력> 		<출력>
		5				
		1 1				2
		12 34			46
		5 500			505
		40 60			100
		1000 1000		2000
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a, b, t = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < t; i++) {
			/* StringTokenizer를 반복문 안에 넣어야 하는 이유
			 	: 반복문 밖에 빼버리면 1 1을 입력받고 readLine이 끝나버림.
			 	readLine이 없는데 나는 계속 a, b를 nextToken으로 넣어버리니까 에러가 뜸
			*/	
			StringTokenizer st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
			
		}
		bw.flush();
		bw.close();
		
		
			
		
	}
}
