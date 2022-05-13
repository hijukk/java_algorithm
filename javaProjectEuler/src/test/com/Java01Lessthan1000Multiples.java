package test.com;

import java.util.HashSet;

public class Java01Lessthan1000Multiples {

	public static void main(String[] args) {
//		10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
//		1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

		HashSet<Integer> arr = new HashSet<Integer>();

		for (int i = 1; i < 1000; i++) {
			//3이나 5와 나누어서 0이면 배수
			if (i % 3 == 0 | i % 5 == 0) {
				arr.add(i);
			}
		}

		System.out.println(arr);

		long sum = 0;
		for (Integer i : arr) {
			sum += i;
		}
		System.out.println(sum);

	}// end main

}
