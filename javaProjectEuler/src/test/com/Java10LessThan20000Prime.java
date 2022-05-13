package test.com;

import java.util.ArrayList;
import java.util.List;

public class Java10LessThan20000Prime {

	public static boolean prime(int x) {
		if (x < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		
//		10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
//		이백만(2,000,000) 이하 소수의 합은 얼마입니까?
		
		
		
		List<Integer> arr_prime = new ArrayList<Integer>();
		
		for (int i = 0; i < 2000000; i++) {
			if(prime(i)) {
				arr_prime.add(i);
			}
		}
		
		long prime_add = 0;
		
		for (Integer x : arr_prime) {
			prime_add += x;
		}
		
		System.out.println(prime_add);
	}// end main

}// end class
