package 반복문;

import java.util.Scanner;

public class A와B더하기_10950 {

	public static void main(String[] args) {
		/*
		<문제>
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		<입력>
		첫째 줄에 테스트 케이스의 개수 T가 주어진다.

		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

		<출력>
		각 테스트 케이스마다 A+B를 출력한다.

		<예제 입력 1> 			<예제 출력 1>
		5					
		1 1					2
		2 3					5
		3 4					7
		9 8					17
		5 2					7
		*/
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int a = 0;
		int b = 0;
		int[] result = new int[testCase];
		

		
		for(int i = 0; i < testCase; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result[i] += a+b; 
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
			
	}

}
