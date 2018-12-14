package Arithmetic;
/**
 * 등차수열 : 연속하는 두 항의 차이가 모두 일정한 수열
 * 공차수열 : 두 항들에 대해서 공통적으로 나타나는 차
 *
 */
public class Sequence {
	public static void main(String[] args) {

		int a = 2;
		int sum = 0;
		String res = "";

		for (int i = 0; i < 5; i++) {
			sum += a + 6 * i;

			res += (i < 4) ? a + 6 * i + " + " : a + 6 * i + " = ";
		}
		System.out.println(res + " " + sum);
	}
}





//2 8 14 20 26 = 70

//if(i < 4) {
//res += a + 6*i+" + ";
//}else {
//res += a + 6*i+" = ";
//}