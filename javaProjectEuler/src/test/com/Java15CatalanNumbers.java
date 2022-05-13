package test.com;

public class Java15CatalanNumbers {

	public static long catalan(int x, int y) {
		long catalanNum = 0;
		long[][] arrs = new long[x + 1][y + 1];

		for (int i = 0; i <= x; i++) {
			arrs[0][i] = 1;
			arrs[i][0] = 1;
		}

		for (int j = 1; j <= x; j++) {
			for (int i = 1; i <= y; i++) {
				arrs[j][i] = arrs[j - 1][i] + arrs[j][i - 1];
			}
		}
		
		catalanNum = arrs[x][y];

		return catalanNum;
	}

	public static void main(String[] args) {
		// 아래와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여 오른쪽 아래 모서리까지 도달하는 길은 모두 6가지가 있습니다 (거슬러 가지는
		// 않기로 합니다).
		// 팩토리얼 4!/2!2! 4*3/2*1 = 6
		// 그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?

		long catalanNum = catalan(20, 20);

		System.out.println("catalanNum: " + catalanNum);

	}

}
