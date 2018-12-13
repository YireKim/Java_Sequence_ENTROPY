package Math;
/*
3개의 반 학생의 몸무게를 측정하였다
- 각 반의 학생 수는 30명이다
- 각 반의 학생 몸무게의 최대, 최소 값을 구하시오
- 단, 몸무게는 40 ~ 100 kg 사이 이다
*/

import java.util.Random;

public class MaxMin {
	public static void main(String[] args) {
		Random ran = new Random();

		int[] ban = new int[30];
		int max = 40, min = 100;

		for(int i = 0; i < ban.length; i++) {
			ban[i] = ran.nextInt(61)+40;
			//			if ban[i] = 68 42 90
			if(ban[i] >= max) {
				max = ban[i];
			}
			if(ban[i] >= min) {
				min = ban[i];
			}
		}						
		System.out.printf("최대 %d, 최소 %d",max,min);
	}
}
