package rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

	private Scanner scan;
	private ArrayList<User> userList;
	private int log;
	
	public UserManager() {
		this.scan = new Scanner(System.in);
		this.userList = new ArrayList<>();
		this.log = -1;
	}
	
	private void UserJoin() {
		if (!isLoggedIn()) {
			System.out.print("[회원가입 ID] : ");
			String id = scan.next();
			System.out.print("[회원가입 PW] : ");
			String password = scan.next();
			User user = new User(id, password);
			if (!isDuplication(user)) {
				this.userList.add(user);
				System.out.println("[회원가입 성공]");
			}
			else {
				System.err.println("[회원가입 실패]");
			}
		}
		else {
			System.err.println("[이미 로그인 상태입니다.]");
		}
	}
	
	private boolean isDuplication(User user) {
		boolean dupl = false;
		for (User data : this.userList) {
			if (data.getId().equals(user.getId())) {
				dupl = true;
			}
		}
		return dupl;
	}
	
	private boolean isLoggedIn() {
		return this.log != -1;
	}
	
	private void UserLeave() {
		if (isLoggedIn()) {
			System.out.print("[회원탈퇴 ID] : ");
			String id = scan.next();
			System.out.print("[회원탈퇴 PW] : ");
			String password = scan.next();
			User user = new User(id, password);
			if (DeleteUser(user)) {
				System.out.println("[회원탈퇴 성공]");
			}
			else {
				System.err.println("[회원 정보를 다시 확인해 주세요.]");
			}
		}
		else {
			System.err.println("[로그인 후 이용 가능합니다.]");
		}
	}
	
	private boolean DeleteUser(User user) {
		boolean result = false;
		for (User data : this.userList) {
			if (data.getId().equals(user.getId()) && data.getPassword().equals(user.getPassword())) {
				result = this.userList.remove(data);
			}
			if (this.userList.size() == 0) {
				break;
			}
		}
		return result;
	}
	
	private void UserLogin() {
		if (!isLoggedIn()) {
			System.out.print("[로그인 ID] : ");
			String id = scan.next();
			System.out.print("[로그인 PW] : ");
			String password = scan.next();
			User user = new User(id, password);
			for (int i = 0; i < userList.size(); i++) {
				if ((id.equals(userList.get(i).getId())) && (password.equals(userList.get(i).getPassword()))) {
					this.log = i;
				}
			}
			if (isLoggedIn()) {
				System.out.println("[로그인 성공]");
			}
			else {
				System.err.println("[회원 정보를 다시 확인해 주세요.]");
			}
		}
	}
	
	private void UserLogOut() {
		if (isLoggedIn()) {
			this.log = -1;
			System.out.println("[로그아웃 성공]");
		}
		else {
			System.out.println("[로그인 후 이용 가능합니다.]");
		}
	}
	
}
