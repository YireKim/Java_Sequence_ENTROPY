package Math;

import java.util.Scanner;

/*
최소 공배수 : 
두 개 이상의 자연수의 공통인 배수를 말한다. 
예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수

Least Common Multiple => LCM

최대 공약수 :
동시에 그들 모두의 약수인 정수다. 
적어도 하나가 0이 아닌 정수들의 최대공약수는 공약수 가운데 가장 큰 하나다.

Greatest Common Divisor => GCD
*/
public class Multiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
			System.out.println("최대 공약수와 최소 공배수를 구할 두 수를 입력하세요.");
		int a = scan.nextInt(); 
		int b = scan.nextInt();
		int lcm = 0, // 36   [a 24 36', b 18 36']
			gcd = 0, // 6    [a 1, 2, 3, 4, 6', b 1, 2, 3, 6']
		    big = 0,
			small = 0,
			mok = 0,
			r = 0;
		
	
		mok = big / small;
		r = big % small;
		
		while(r != 0) {						// 유클리드 호제법
			if(r < small) {
				mok = r;
				r = small;
				small = mok;
			}
			r = r % small;
		}
		
		gcd = small;
		lcm = (a * b) / gcd;								//LCM(최소공배수)구하기

		System.out.printf(" : %d , %d :\n 최소 공배수 : %d\n & 최대 공약수 : %d", a, b, lcm, gcd);
		
	}
}


