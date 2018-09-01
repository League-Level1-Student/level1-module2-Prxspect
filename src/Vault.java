
public class Vault {

	
	private int code = 1234;
	
	boolean tryCode(int guess) {
		if (guess == code) {
		System.out.println("The Valut is open. Mission Complete!");
			return true;
	}
		else {
			System.out.println("Wrong code");
			return false;
		}
	}
	
	int findCode() {
		System.out.println("The code to the Vault is " + code);
		return code;
	}

	

}
