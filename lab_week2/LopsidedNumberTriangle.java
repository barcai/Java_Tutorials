public class LopsidedNumberTriangle {
	public static void main(String[] args) {
		for (int line_num = 1; line_num < 10; line_num++) {
			for (int char_num = 1; char_num <= line_num; char_num++) {
				System.out.print(line_num);
			}
			System.out.println();
		}
	}
}
/*
Will print:
1
22
333
4444
55555
666666
7777777
88888888
999999999
*/