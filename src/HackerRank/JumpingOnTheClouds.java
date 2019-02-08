package HackerRank;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {
		int num = 0;
		int step = 0;
		for (int i = 0; i < c.length; i++) {
			if (step == 2) {
				num++;
				step = 0;
			}
			if (step == 1 && c[i] == 1) {
				num++;
				step = 0;
			}
			if (c[i] == 0) {
				step++;
			} else {
				step = 0;
				num++;
			}
			if (c[i] == 0 && i == c.length-2 && c.length%2==0) {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(arr));
	}
}
