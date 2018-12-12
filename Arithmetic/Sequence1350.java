package Arithmetic;

public class Sequence1350 {
	public static void main(String[] args) {
		String res = "";
		int i = 0, d = 1, sum = 1;

		while (true) {
			i++;
			d += i;
			sum += d;

			if(i < 19) {
				continue;
			}else{
				break;
			}
		}
		res = sum+"";
		System.out.printf("1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 \n"
						+ "======================================================\n"
							+ "%s \n"
								+ "=======================================================", res);
	}
}


//while (true) {
//	for(i = 0; i < 20; i++) {
//		d += i;
//		sum += d;
//    	System.out.println(d);	
//	}
//	break;
//}
//System.out.println(sum-1);