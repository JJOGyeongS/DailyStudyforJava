package level1;

import java.util.*;
import java.io.*;
//a���� b������ �Ҽ��� ��,�ּڰ� ��� ������ -1 ���
public class Main2581 {
	
	public static boolean prime[];
	
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int b = n.nextInt();
		
		int result=0;
		
		prime = new boolean[b+1];
		get_prime();
		
		int min = Integer.MAX_VALUE;
		for(int i=a;i<=b;i++) {
			if(prime[i]==false) {
				result+=i;
				if(min==Integer.MAX_VALUE){
					min=i;
				}
			}
		}
		if(result==0) {
			System.out.println("-1");
		}
		else {
			System.out.println(result);
			System.out.println(min);
		}
		
		
	}
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}
}
//