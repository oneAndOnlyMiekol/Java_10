package util;

public class Decrypter {
	
	
	public static String decryptString(String key, String encryptedText) {
		int j=0;
		StringBuilder decryptedText = new StringBuilder();
		
		for(int i=0; i<encryptedText.length();i++) {
			if(j==key.length())
			j=0;
			decryptedText.append(decryptCharacter(key.charAt(j),encryptedText.charAt(i)));
			j++;
		}
		
		return decryptedText.toString();
	}
	
	private static char decryptCharacter(char keyCharacter, char encryptedCharacter) {
		Alphabet alphabet = new Alphabet();
		return alphabet.getChar(alphabet.getInt(encryptedCharacter)+alphabet.getInt(keyCharacter));
	}

	public static String encryptString(String key, String decryptedText) {
		int j=0;
		StringBuilder encryptedText = new StringBuilder();
		for(int i=0; i<decryptedText.length();i++) {
			if(j==key.length())
			j=0;
			encryptedText.append(encryptCharacter(key.charAt(j),decryptedText.charAt(i)));
			j++;
		}
		return encryptedText.toString();
	}

	private static char encryptCharacter(char keyCharacter, char encryptedCharacter) {
		Alphabet alphabet = new Alphabet();
		return alphabet.getChar(alphabet.getInt(encryptedCharacter)-alphabet.getInt(keyCharacter));
	}
	
	
	
	
	
	

}
