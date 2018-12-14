package Math;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		String[] res = {};

		String[] MyClass = new String[20];
		String[] vivace = {"은지", "지우", "현일", "창현", "서우"};
		String[] chung 	= {"정우", "기호", "태학", "승아", ""};
		String[] atlas 	= {"동준", "이레", "지은", "종협", ""};
		String[] nm 	= {"창하", "정욱", "수호", "은영", ""};

		String[] leader = {vivace[0], chung[0], atlas[0], nm[0]};

		System.out.println("팀명을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String select = scan.next();

		switch(select) {
		case "vivace":
			res = vivace;
			break;

		case "chung":
			res = chung;

			break;

		case "atlas":
			res = atlas;
			break;

		case "nm":
			res = nm;
			break;

		case "leader":
			res = leader;
			break;
		}

		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}