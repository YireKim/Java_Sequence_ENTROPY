package Arithmetic;
/**
 * 3의 배수를 제외한 1 부터 10까지 정수 출력 [결과] 1 2 4 5 7 8 10
 */
public class Sequence10 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
