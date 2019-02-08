package HackerRank;

public class HikerJack {

	static int countingValleys(int n, String s) {
		int level = 0;
		int num = 0;
		for (char c : s.toCharArray()) {
			if (c == 'U') {
				level++;
			} else {
				if (level == 0) {
					num++;
				}
				level--;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(HikerJack.countingValleys(12, "DDUUDDUDUUUD"));
	}
}
