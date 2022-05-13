package test.com;

public class Java06Faulhaberformula {
	
	//시그마공식 사용
	
	public static int sigma(int n) {
		int r = n * (n + 1) * (2 * n + 1) / 6;
		return r;
	}

	public static int sum_square(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x += arr[i];
		}
		x *= x;
		return x;
	}
	
	//시그마공식 활용
	public static int substract(int n) {
		int sigma = sigma(n);
		int sum_square = sum_square(n);
		
		int result = Math.abs(sum_square - sigma);
		
		return result;
	}

	public static void main(String[] args) {
		
//		1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
//
//		12 + 22 + ... + 102 = 385
//		1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
//
//		(1 + 2 + ... + 10)2 = 552 = 3025
//		따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
//
//		그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
		
		

		int result = substract(100);
		System.out.println(result);
	}

}
