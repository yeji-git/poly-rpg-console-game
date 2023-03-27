package rpg;

import java.util.Random;
import java.util.Scanner;

class MainGame {
	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	public MainGame() {
		while (true) {
			System.out.println("--- [디아블로] ---");
			System.out.println("[1. 로그인]");
			System.out.println("[2. 로그아웃]");
			System.out.println("[3. 회원가입]");
			System.out.println("[4. 회원탈퇴]");
			int sel = scan.nextInt();
			
			if (sel == 1) {
			}
		}
	}
}

public class _TextRpg {

	public static void main(String[] args) {
		new MainGame();
	}

}
