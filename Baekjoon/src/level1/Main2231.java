package level1;

import java.util.*;

public class Main2231 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int result = 0;
		for (int i = 1; i <= a; i++) {
			int num = i;
			int sum = 0;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum + i == a) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
