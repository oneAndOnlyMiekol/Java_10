package util;



public class TestClass {
	
	public static void main(String[] args) {
		String key = "abcdefghijklmnopqrst";
		String textToDecrypt = "Ala ma kota, a kot ma Ale. Psa niestety nie by�o i wtedy polski znak si� zepsu�.";
		
		System.out.println(textToDecrypt);
		String encryptedText = Decrypter.decryptString(key, textToDecrypt);
		System.out.println(encryptedText);
		System.out.println(Decrypter.encryptString(key, encryptedText));
		
		
		
		
	}

}
