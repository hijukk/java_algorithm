package test.com;

public class Java18TriangleSum {

	public static void main(String[] args) {
//		다음과 같이 삼각형 모양으로 수를 배열했습니다.
//		3
//		7 4
//		2 4 6
//		8 5 9 3
//		삼각형의 꼭대기부터 아래쪽으로 인접한 수를 찾아 내려가면서 합을 구하면, 위의 그림처럼 3 + 7 + 4 + 9 = 23 이 가장 큰 합을 갖는 경로가 됩니다.
//		다음 삼각형에서 합이 최대가 되는 경로를 찾아서 그 합을 구하세요.
//		75
//		95 64
//		17 47 82
//		18 35 87 10
//		20 04 82 47 65
//		19 01 23 75 03 34
//		88 02 77 73 07 63 67
//		99 65 04 28 06 16 70 92
//		41 41 26 56 83 40 80 70 33
//		41 48 72 33 47 32 37 16 94 29
//		53 71 44 65 25 43 91 52 97 51 14
//		70 11 33 28 77 73 17 78 39 68 17 57
//		91 71 52 38 17 14 91 43 58 50 27 29 48
//		63 66 04 68 89 53 67 30 73 16 69 87 40 31
//		04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
//		참고: 여기서는 경로가 16384개밖에 안되기 때문에, 모든 경로의 합을 일일이 계산해서 답을 구하는 것이 가능합니다.
//		하지만 67번 문제에는 100층짜리 삼각형 배열이 나옵니다. 그런 경우에는 좀 더 현명한 풀이 방법을 찾아야겠지요.

		String str_su = "75\n"
				+ "95 64\n"
				+ "17 47 82\n"
				+ "18 35 87 10\n"
				+ "20 04 82 47 65\n"
				+ "19 01 23 75 03 34\n"
				+ "88 02 77 73 07 63 67\n"
				+ "99 65 04 28 06 16 70 92\n"
				+ "41 41 26 56 83 40 80 70 33\n"
				+ "41 48 72 33 47 32 37 16 94 29\n"
				+ "53 71 44 65 25 43 91 52 97 51 14\n"
				+ "70 11 33 28 77 73 17 78 39 68 17 57\n"
				+ "91 71 52 38 17 14 91 43 58 50 27 29 48\n"
				+ "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n"
				+ "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
		
//		String str_su = "3\n"
//				+ "7 4\n"
//				+ "2 4 6\n"
//				+ "8 5 9 3";
		
		//한줄씩 배열
		String[] arr_str_su = str_su.split("\n");
//		for (String string : arr_str_su) {
//			System.out.println(string);
//		}
		
		//공백으로 이중배열
		String[][] arrs_str_su = new String[arr_str_su.length][];
		
		for (int i = 0; i < arr_str_su.length; i++) {
			arrs_str_su[i] = arr_str_su[i].split(" ");
		}
		
//		for (String[] strings : arrs_str_su) {
//			for (String s : strings) {
//				System.out.print(s);
//			}
//			System.out.println();
//		}
		
		
		//정수 이중배열로 변환
		int[][] arrs_su = new int[arrs_str_su.length][];
		
		for (int x = 0; x < arrs_str_su.length; x++) {
			arrs_su[x] = new int[arrs_str_su[x].length];
			
			for (int i = 0; i < arrs_str_su[x].length; i++) {
				arrs_su[x][i] = Integer.parseInt(arrs_str_su[x][i]);
			}
		}
		
//		for (int[] is : arrs_su) {
//			for (int i : is) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("==========");
		
		//역순으로 합
		//밑에서 하나 위배열에서 부터 올라감
		for (int i = arrs_su.length-2; i >= 0; i--) {
			//줄번호에 따라 들어있는 수도 같음
			for (int j = 0; j <= i; j++) {
//				System.out.println("before:" + arrs_su[i][j]);
				
				//밑에있는 배열에서 더해지는 수가 더 큰게 더해짐
				arrs_su[i][j] += arrs_su[i+1][j] > arrs_su[i+1][j+1] ? arrs_su[i+1][j] : arrs_su[i+1][j+1];
//				System.out.println(arrs_su[i][j]);
			}
		}
		
		System.out.println(arrs_su[0][0]);
		
		
	}

}
