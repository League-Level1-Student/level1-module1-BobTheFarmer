package _05_vault;

public class JamesBond {
	JamesBond() {
		
	}
	
	int findCode(Vault vault) {
		for(int i = 0; i<1000000; i+=1) {
			if(vault.tryCode(i)==true) {
			System.out.println("Code Found. Code was:" + i);
			return i;
		} 		}
		System.out.println("Code was never found");
		return -1;
	}
}

