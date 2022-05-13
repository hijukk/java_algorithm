package test.com;

public class Java04MaxPalindromicNumber {

	public static void main(String[] args) {
		
//		앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(PALINDROME)라고 부릅니다.
//		두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//		세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
		
		int max = 0;

		for (int x = 1000; x > 9; x--) {
			for (int i = 1000; i > 9; i--) {
				String multi = Integer.toString(x * i);
				if (multi.charAt(0) == multi.charAt(multi.length() - 1)
						&& multi.charAt(1) == multi.charAt(multi.length() - 2)
						&& multi.charAt(2) == multi.charAt(multi.length() - 3)) {
					if (max > Integer.parseInt(multi))
						break;
					System.out.printf("%d, %d \n",x,i);
					max = Integer.parseInt(multi);
					System.out.println(max);

				}

			}

		}

	}// end main()

}// end class
