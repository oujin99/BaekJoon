package 반복문;

import java.util.Scanner;

public class 영수증_25304 {
	public static void main(String[] args) {
		/*
		 <입력>
		첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
		둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
		이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

		<출력>
		구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

		<제한>
 		$1 ≤ X ≤ 1\,000\,000\,000$ 
 		$1 ≤ N ≤ 100$ 
 		$1 ≤ a ≤ 1\,000\,000$ 
 		$1 ≤ b ≤ 10$ 
		
		<입력> 			<출력>
		260000			Yes
		4
		20000 5
		30000 2
		10000 6
		5000 8
		
		영수증에 적힌 구매할 물건들의 목록으로 계산한 총 금액은
		20000 × 5 + 30000 × 2 + 10000 × 6 + 5000 × 8 = 260000원이다.
		이는 영수증에 적힌 총 금액인 260000원과 일치한다. 
		 */
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 첫번째 줄 : 영수증에 적힌 총액
		int N = sc.nextInt(); // 두번째 줄 : 영수증에 적힌 구매한 물건의 종류의 수
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(); // 구매한 물건의 가격
			int b = sc.nextInt(); // 구매한 물건의 개수
			result += a * b;
		}
		if(X == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
