package util;

public class Decrypter {
	
	
	public static String decrypt(String key, String encryptedText) {
		int j=0;
		StringBuilder decryptedText = new StringBuilder();
		for(int i=0; i<encryptedText.length();i++) {
			if(j==key.length())
			j=0;
			decryptedText.append(Decrypter.getChar(encryptedText.charAt(i)-key.charAt(j)));
			
			j++;
		}
		
		return decryptedText.toString();
	}
	
	public static String encrypt(String key, String decryptedText) {
		int j=0;
		StringBuilder encryptedText = new StringBuilder();
		for(int i=0; i<decryptedText.length();i++) {
			if(j==key.length())
			j=0;
			encryptedText.append(Decrypter.getChar(decryptedText.charAt(i)+key.charAt(j)));
			
			j++;
		}
		return encryptedText.toString();
	}
	
	public static char getChar(int intToSpecificChar) {
		/*
		if(intToSpecificChar<32) {
			intToSpecificChar=-31+intToSpecificChar+126;
		}
		
		if(intToSpecificChar>126) {
			intToSpecificChar=31+intToSpecificChar-126;
		}
		*/
		return (char)intToSpecificChar;
	}
	
	

}
