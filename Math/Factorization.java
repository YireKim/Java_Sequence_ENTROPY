package Math;

import java.util.Scanner;

/**
 *  소인수분해 : 합성수를 소수의 곱으로 나타내는 방법
 *  20  =  2  ×  2  ×  5 
 * */
public class Factorization {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("소인수분해할 수를 입력하세요.");
//		int target = scan.nextInt();

		int count = 0;	
		int[] res = new int[count];
		int two = 2;

		int res2 = 0;
//		
//		if(target < 2) {
//			return; // 벨류데이션 = 유효성체크
//		}

		//   target   =                 res
		//     20     =      2     ×     2     ×     5 

		int target = scan.nextInt();
		for(int i = 0; i < 5; i++) {
		if(target % 2 == 0) {
			res2 += 2;
		}else 
		if(target % 2 == 1) {
			res2 += 3;
		}
		System.out.println(res2);
		}
		
	}		
//	System.out.println(res[i]+"  ");
}

