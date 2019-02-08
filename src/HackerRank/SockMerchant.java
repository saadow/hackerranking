package HackerRank;
import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int i : ar) {
			res = 0;
			for (int k : ar) {
				if (i == k)
					res++;
				map.put(i, res);
			}
		}
		res = 0;
		for (int key : map.keySet()) {
			res += map.get(key)/2;
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 2, 2 };
		SockMerchant.sockMerchant(7, arr);
	}
}
