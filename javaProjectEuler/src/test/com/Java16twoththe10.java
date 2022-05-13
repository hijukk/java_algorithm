package test.com;

import java.math.BigInteger;

public class Java16twoththe10 {

	public static void main(String[] args) {
		// 2^15 = 32768 의 각 자릿수를 더하면 3 + 2 + 7 + 6 + 8 = 26 입니다.
		// 2^1000의 각 자릿수를 모두 더하면 얼마입니까?

		BigInteger big_su = new BigInteger("2").pow(1000);
		System.out.println(big_su);
		String str_su = big_su.toString();
		long su = 0;
		for (int i = 0; i < str_su.length(); i++) {
			su += Character.getNumericValue(str_su.charAt(i));
		}
		
		System.out.println("su: "+su);
		
	}

}
