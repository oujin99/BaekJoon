package 반복문;

import java.util.Scanner;

public class 합_8393 {

	public static void main(String[] args) {
		/*
		 	n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 	
		 	<입력>
			첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

			<출력>
			1부터 n까지 합을 출력한다.
			
			<예제>
			입력 : 3 출력 : 6
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= a; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
