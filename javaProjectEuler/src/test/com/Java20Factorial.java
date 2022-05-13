package test.com;

import java.math.BigInteger;

public class Java20Factorial {

	public static String factorial(int x) {
		BigInteger fac = BigInteger.valueOf(x);
		BigInteger su = new BigInteger("1");
		BigInteger one = new BigInteger("1");
		
		while (fac.compareTo(one) != 0) {
			su = su.multiply(fac);
			fac = fac.subtract(one);
		}
		String str_su = su.toString();
		
		return str_su;
	}
	
	
	public static long factorialAdd(String su) {
		long lng_su = 0;
		for (int i = 0; i < su.length(); i++) {
			lng_su += Character.getNumericValue(su.charAt(i));
		}
		
		return lng_su;
	}

	public static void main(String[] args) {
		// n! 이라는 표기법은 n × (n − 1) × ... × 3 × 2 × 1을 뜻합니다.
		// 예를 들자면 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 이 되는데,
		// 여기서 10!의 각 자릿수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27 입니다.
		// 100! 의 자릿수를 모두 더하면 얼마입니까?
		
		System.out.println(factorialAdd(factorial(100)));
		

	}

}
