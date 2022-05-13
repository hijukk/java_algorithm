package test.com;

public class Java05LeastCommonMultiple {
	
//	1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//	그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
	

	//최대공약수 호제법 사용
	public static long lcm(long a, long b) {
		long rs = a * b / gcd(a, b);

		return rs;
	}

	public static long gcd(long a, long b) {
		long x = Math.max(a, b);
		long y = Math.min(a, b);

		long rs;
		while (x % y != 0) {
			rs = x % y;

			x = y;
			y = rs;
		}

		return y;
	}

	public static long result(int[] arr) {
		long answer = arr[0];
		for (int i = 0; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		

		long result = result(arr);
		System.out.println(result);

	}// end main

}// end class
