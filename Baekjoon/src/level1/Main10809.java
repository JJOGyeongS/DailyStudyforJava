package level1;

import java.util.*;
import java.io.*;

public class Main10809 {
	public static void main(String[] args) throws IOException {

		Scanner n = new Scanner(System.in);
		int[] arr = new int[26];
		
		for(int i=0;i<arr.length;i++) { //�迭�� -1�� �ʱ�ȭ
			arr[i] = -1;
		}
		
		String b = n.nextLine();  //���� �Է�
		
		for(int j=0;j<b.length();j++) { //
			char ch = b.charAt(j);
			
			if(arr[ch-'a'] == -1) { //��ġ�� ã�� ���ؼ� �ƽ�Ű �ڵ� ���� ����
				arr[ch - 'a'] = j;
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
