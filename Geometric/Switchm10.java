package Geometric;
/**
 * 1-2+3-4+5-6+7-8+0 .. odd + even - ... 20 = -10
 * 삼항 연산자 res = (i = 0) ? -1 : i;
 * */
public class Switchm10 {

	public static void main(String[] args) {

		int count = 0;

		for(int i = 0; i < 21; i++) {
			count += (i % 2 == 0) ? -i : i;

			//			if(i % 2 == 0) {
			//				count -= i;
			//			}else {
			//				count += i;
			//			}
		}
		System.out.println(count);
	}
}