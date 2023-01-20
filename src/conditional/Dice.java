package conditional;

import java.util.Iterator;
import java.util.Scanner;

public class Dice {
	
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int dice1;	// 첫번째 주사위
		int dice2;	// 두번째 주사위
		int dice3;	// 세번째 주사위
		
		int result = 0;
		
		dice1 = sc.nextInt();
		dice2 = sc.nextInt();
		dice3 = sc.nextInt();
        
        // 최고값 찾기
			int max = 0; // 최고값
			if(dice1 > dice2) {
			if(dice3 > dice1) {
				max = dice3;
			} else { // dice1 > dice3
				max = dice1;
			}
		} else { // dice2 > dice1
			if(dice3 > dice2) {
				max = dice3;
			} else {
				max = dice2;
			}
		}
		
		if(dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
			result = max * 100;
		} else {
			// 모든 값이 같은 경우
			if(dice1 == dice2 && dice1 == dice3) {
				result = 10000 + dice1 * 1000;
			} else { // 두개만 같은 경우
				// dice1이 dice2 or dice3과 같은 경우
				if(dice1 == dice2 || dice1 == dice3) {
					result = 1000 + dice1 * 100;
				} else { // dice2가 dice3과 같은 경우
					result = 1000 + dice2 * 100;
					
				}
				
			}
		}
		
		System.out.println(result);
		
	}
}


