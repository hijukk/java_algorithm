package test.com;

public class Java17NumberStrlength {
	static public String getStringNum(int x) {
		String[] zero_nineteen = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String strnum = "";

		if (x < 20) {
			// System.out.println(zero_nineteen[x - 1]);

			strnum = zero_nineteen[x - 1];
		} else if (x < 100) {
			int fir_su = x / 10;
			int second_su = x % 10;
			String str = "";
			str = second_su == 0 ? "" : zero_nineteen[second_su - 1];
			// System.out.println(tens[fir_su - 2] + str);

			strnum = tens[fir_su - 2] + str;
		} else if (x < 1000) {
			// 백의자리수
			int fir_su = x / 100;
			// 십의자리수
			int second_su = (x % 100) / 10;
			// 일의자리수
			int third_su = x % 10;
			strnum = "";
			if (x % 100 == 0) {
				strnum = zero_nineteen[fir_su - 1] + "hundred";
			} else {
				if (second_su == 1 || second_su == 0) {
					strnum = zero_nineteen[fir_su - 1] + "hundredand" + zero_nineteen[(x % 100) - 1];
				}else {
					String str = "";
					str = third_su != 0 ? zero_nineteen[third_su - 1] : "";
					strnum = zero_nineteen[fir_su - 1] + "hundredand" + tens[second_su - 2] + str;
				}

			}

		} else if (x == 1000) {

			strnum = "onethousand";
		}

		return strnum;
	}

	public static void main(String[] args) {
		// 1부터 5까지의 수를 영어로 쓰면 one, two, three, four, five 이고,
		// 각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다.
		// 1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?
		// 참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다.
		// 예를 들어 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
		// 115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 1000; i++) {
			sb.append(getStringNum(i));
		}
		System.out.println(sb.toString().length());

	}

}
