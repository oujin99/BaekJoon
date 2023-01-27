package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A와B더아름답게출력_11022 {

	public static void main(String[] args) throws IOException {
		/*
		 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		<입력>
		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

		<출력>
		각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

		<예제 입력> 	<출력>
		5
		1 1			Case #1: 1 + 1 = 2
		2 3			Case #2: 2 + 3 = 5
		3 4			Case #3: 3 + 4 = 7
		9 8			Case #4: 9 + 8 = 17
		5 2			Case #5: 5 + 2 = 7
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a, b, testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b) + "\n");
		}
		bw.flush();
		bw.close();
		
		/*--------------Scanner 사용--------------
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] A = new int[c];
		int[] B = new int[c];
		int[] result = new int[c];
		
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[i] += a;
			B[i] += b;
			result[i] += a+b;
			
		}
		for (int i = 0; i < c; i++) {
			System.out.println("Case #" + (i+1) + ": " + A[i] + " + " 
					+ B[i] + " = " + result[i]);
		}
		sc.close();
		*/
	}

}
