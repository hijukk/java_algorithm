package test.com;

public class Java12Over500TriangularNumber {
	public static int measure(int num) {
//		System.out.println(x);
		int count = 0;
		// 모든 약수는 자기 자신의 반을 넘지 못한다
		double manumMeasure = Math.sqrt(num);

		for (int i = 1; i <= manumMeasure; i++) {
			if (num % i == 0) {
//				System.out.println(i);
				// 자신의 루트만큼만 나눴으니 두번 더함
				count += 2;
			}
		}

		if (manumMeasure * manumMeasure == num)
			count -= 1;

		return count;
	}

	public static void main(String[] args) {
		
//		1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
//		예를 들어 7번째 삼각수는 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28이 됩니다.
//		이런 식으로 삼각수를 구해 나가면 다음과 같습니다.
//
//		1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//		이 삼각수들의 약수를 구해 봅시다.
//
//		 1: 1
//		 3: 1, 3
//		 6: 1, 2, 3, 6
//		10: 1, 2, 5, 10
//		15: 1, 3, 5, 15
//		21: 1, 3, 7, 21
//		28: 1, 2, 4, 7, 14, 28
//		위에서 보듯이, 5개 이상의 약수를 갖는 첫번째 삼각수는 28입니다.
//
//		그러면 500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?
		
		

		// 자연수
		int naturalNumber;
		int x = 1;

		while (true) {
			// 삼각수 구하는 공식
			naturalNumber = x * (x + 1) / 2;
			int count = measure(naturalNumber);
			if (count >= 500) {
				System.out.println("naturalNumber: " + naturalNumber);
				break;
			}
			x++;
			
		}//end while

	}// end main

}// end class
