package util;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Alphabet {
	
	
	
	private List<Character> alphabetList;
	private Character[] polishCharacters = {'π', 'Í', 'Ê', 'ü', 'ø', '≥', 'ú', 'Û', 'Ò', '•', ' ', '∆', 'è', 'Ø', '£', 'å', '”', '—'};
	/*
	public List<Character> getAlphabetList() {
		return alphabetList;
	}
*/

	public Alphabet() {
		alphabetList = new ArrayList<>();
		createAlphabet();
	}


	private void createAlphabet() {
		for(int i=32;i<=126;i++) {
			alphabetList.add((char)i);
		}
		alphabetList.add((char)10);
		alphabetList.addAll(Arrays.asList(polishCharacters));
		alphabetList.sort((o1, o2) -> o1.compareTo(o2));
	}
	
	public int getInt(Character character) {
		return alphabetList.indexOf(character);
		
	}
	
	public Character getChar(int index) {
		while(index>getSize()) {
			index = index - getSize();
		}
		while(index<0) {
			index = index + getSize();
		}
		//System.out.println(getSize());
		//System.out.println(index);
		return alphabetList.get(index);
	}
	
	public int getSize() {
		return alphabetList.size();
	}
	
	

}
