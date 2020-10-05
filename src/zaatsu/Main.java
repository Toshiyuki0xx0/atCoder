package zaatsu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] a = new int[N];
		for (int i=0;i<N;i++) {
			a[i] =  cin.nextInt();
		}
		int cnt;
		int [] a2  = new int[N]; //順位を入れる
		int [] b2  = new int[N]; //ﾌﾗｸﾞ格納
		//for (int i=0;i<N;i++) {
		//	b2[i] = 0;
		//}
		for (int i=0;i<N;i++) {
			cnt = 0;
			for (int j=0;j<N;j++) {
				if (a[j] <  a[i]) {
					cnt = cnt + 1;//自分より小さい数値の数をｶｳﾝﾄ
				}
			}
			a2[i]  =  cnt;//順位
			b2[cnt] = 1;
		}
		for (int i=0;i<N;i++) {
			cnt = 0;
			for (int j=0;j<=a2[i];j++) {
				if (b2[j] == 0) {
					cnt = cnt + 1; //自分までの隙間の数
				}
			}
			System.out.println(a2[i] - cnt);//順位-隙間の数
		}
	}
}
