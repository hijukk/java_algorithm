package test.com;

import java.util.ArrayList;
import java.util.List;

public class Java0710001thPrime {
	
//	소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//	이 때 10,001번째의 소수를 구하세요.

	// 에라토스테네스의 체
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
		List<Integer> arr_prime = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			if (prime(i)) {
				arr_prime.add(i);
				if(arr_prime.size() == 10001)break;
			}
		}

//		for (Integer x : arr_prime) {
//			System.out.println(x);
//		}
		
		System.out.println(arr_prime.get(10000));

	}// end main

}// end class
