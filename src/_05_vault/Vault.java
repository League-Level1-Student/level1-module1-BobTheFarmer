package _05_vault;

public class Vault {
	private int code;
	Vault(int code) {
		this.code = code;
	}
	boolean tryCode(int codeGuess) {
		if(codeGuess==code) {
			return true;
		} else {
			return false;
		}
	}
}
