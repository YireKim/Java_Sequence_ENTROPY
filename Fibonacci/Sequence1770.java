package Fibonacci;
/**
 * 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열
 * 처음 여섯 항은 각각 1, 1, 2, 3, 5, 8이다. (편의상 0번째 항을 0으로 두기도 한다.)
 * 
 * 피보나치 수열의 20번째 항 까지의 합은 얼마인가? = 17710
 * 
 * Start with : 5항 까지의 합이 12인 식을 먼저 만듭시다!
 * */
public class Sequence1770 {
	public static void main(String[] args) {
		
//             		1, 1, 2, 3, 5, 8, 13
		
//				a3 = (0? + 0?)       a3 = (a1 + a3)
//					   a1 = (0? + a3)
//							  a1
//				a?  +  a1  +  a2  +  a3
		
		int A = 1;
		int B = 1;
		int C = 0;
		int S = A + B;
		int N = 2;
		
		for(N = 2; N < 20; N++) {

			C = A + B;
			S += C;
			A = B;
			B = C;
		}
		System.out.printf("S is %d ",S);
	}
}


//int a1 = 1;
//int a2 = 0;
//int a3 = 0;
//
//int S = 0;
//
//for(int i = 0; i < 21; i++) {
//
//	a3 = a1 + a2;
//	a1 = a2;
//	a2 = a3;
//	S += a1;
//}
