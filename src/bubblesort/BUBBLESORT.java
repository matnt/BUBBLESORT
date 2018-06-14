package bubblesort;

import java.util.Scanner;

public class BUBBLESORT {
	int n;
	int[] k;
	Scanner in;
	
	public BUBBLESORT() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BUBBLESORT bubble = new BUBBLESORT();
		bubble.input();
		bubble.caculate();

	}
	
	public void input() {
		in = new Scanner(System.in);
		n = in.nextInt();
		k = new int[n];
		for(int i = 0; i < n; i++) {
			k[i] = in.nextInt();
		}
	}
	
	public void caculate() {
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > 0; j--) {
				if(k[j] < k[j - 1]) {
					int tmp = k[j];
					k[j] = k[j - 1];
					k[j - 1] = tmp;
					
				}
					
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(k[i] + " ");
		}
	}

}
