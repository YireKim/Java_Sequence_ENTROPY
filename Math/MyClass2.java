package Math;

public class MyClass2 {
	public static void main(String[] args) {


		String[] vivace = { "은지", "지우", "현일", "창현", "서우" };
		String[] chung 	= { "정우", "기호", "태학", "승아", "" };
		String[] atlas 	= { "동준", "이레", "지은", "종협", "" };
		String[] nm 	= { "창하", "정욱", "수호", "은영", "" };

		String[] res 	= new String[4];
		String[][] MyClass = { vivace, chung, atlas, nm };

		for (int i = 0; i < MyClass.length; i++) {
			for (int j = 0; j < 1; j++) {
				res[i] = MyClass[i][j];
			}
		}
		for (int i = 0; i < MyClass.length; i++) {
			System.out.println(res[i]);
		}
	}
}