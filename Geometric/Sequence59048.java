package Geometric;
/**
 * 등비 수열 : 각 항이 그 앞과 일정한 비(*)를 가지는 수열
 * 공비(Common ratio)
 * 
 * 		2 + 6 + 18 + 54 = 80  / 4항 까지의 합이다.
 * 		2 + (2 * 3) + (2 * 3 * 3) + (2 * 3 * 3 * 3) ..
 * 		A    A *  R +  A * R * R
 * 		그렇다면 10항 까지의 합(series)은 얼마인가? = 59048
 * 
 * */
public class Sequence59048 {
	public static void main(String[] args) {

		int A = 2;
		int R = 3;
		int S = A;
		int N = 2;

		while(true) {
			N++;
			A = A * R; 
			S += A;

			if(N == 11) {
				break;
			}
		}
		System.out.printf("S is %s", S);

	}
}

// N +   S+=(A+D)   +    S+=A(
// 2 + (2+6) + (2+6+6) + (2+6+6+6)