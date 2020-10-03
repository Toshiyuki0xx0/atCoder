package dream;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
		//ブランチしたと
		//さらにブランチしたと
		//
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = new String("");
		String Dreams[] = {"dream","dreamer","erase","eraser"};
		for(;;) {
			if (S.length() < 5) {
				ans = "NO";
			}
			else {
				int length = S.length();
				for (int i=0;i<4;i++) {
					if (S.length() >= Dreams[i].length()) {
						if (S.substring(0,Dreams[i].length()).equals(Dreams[i])) {
							S = S.substring(Dreams[i].length());
						}
					}
				}
				if (S.length() == length) {
					ans = "NO";
				}
				else if (S.length() == 0) {
					ans = "YES";
				}
			}
			if (!ans.equals("")) break;
		}
		System.out.println(ans);

	}

}
