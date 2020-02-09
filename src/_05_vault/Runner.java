package _05_vault;

public class Runner {
	public static void main(String[] args) {
		JamesBond bond = new JamesBond();
		Vault vault = new Vault(12345);
		bond.findCode(vault);
	}
}
