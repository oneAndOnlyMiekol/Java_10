package util;

public class TestClass {
	
	public static void main(String[] args) {
		String key = "jd734nb*^%732K)hd3";
		String textToDecrypt = "Ala ma kota, a kot ma Ale. Psa niestety nie by³o i wtedy polski znak siê zepsu³.";
		//System.out.println((int)'³');
		System.out.println(textToDecrypt);
		String encryptedText = Decrypter.encrypt(key, textToDecrypt);
		System.out.println(encryptedText);
		System.out.println(Decrypter.decrypt(key, encryptedText));
	}

}
