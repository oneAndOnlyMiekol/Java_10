package util;

public class TestClass {
	
	public static void main(String[] args) {
		String key = "jd734nb*^%732K)hd3";
		String textToDecrypt = "Ala ma kota, a kot ma Ale. Psa niestety nie by�o i wtedy polski znak si� zepsu�.";
		//System.out.println((int)'�');
		System.out.println(textToDecrypt);
		String encryptedText = Decrypter.encrypt(key, textToDecrypt);
		System.out.println(encryptedText);
		System.out.println(Decrypter.decrypt(key, encryptedText));
	}

}
