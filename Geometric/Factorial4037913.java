package Geometric;
/**
 *  1 = 1
 *  2 = 2 * 1
 *  3 = 3 * 2 * 1
 *  4 = 4 * 3 * 2 * 1
 *  ..
 *  ..
 *  10 = 10 * ... 10항 까지의 시리즈는 4037913
 * */
public class Factorial4037913 {
	public static void main(String[] args) {

		int S = 1;
		int F = 1;
		int N = 1;

		while(true) {
			N++;

			F *= N;
			S += F;

			if (N > 9) {
				break;
			}
		}
		System.out.printf("S is %d",S);
	}
}
