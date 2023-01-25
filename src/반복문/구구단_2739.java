package 반복문;

import java.util.Scanner;

public class 구구단_2739 {
	public static void main(String[] args) {
		
		/*
		<문제>
		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

		<결과>
		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
		 */
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			int result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		
	}
}
