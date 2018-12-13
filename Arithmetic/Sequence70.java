package Arithmetic;
/**
등차 수열 : 연속하는 두 항의 차이가(+) 모두 일정한 수열
공차 수열 : 공통적으로 나타나는 차이
        	N +   A       A+D+D
        	2 + (2+6) + (2+12) + (2+18)
 * */
public class Sequence70 {
	public static void main(String[] args) {
		
		int A = 2; // init
        int D = 6; // difference
        int S = A; // series
        int N = 2; // count
        int AN = 0; // term
        
        while(true){
        	N++;
        	A = A + D;
        	S += A;
        	

        	
        	if(N == 6) {
        		break;
        	}
        }
        System.out.printf("S is %d", S);
	}
}
