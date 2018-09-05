package com.find.englishword;

import rita.wordnet.RiWordnet;

public class Dictionary {

	public boolean isEnglishWord(String word) {
		RiWordnet r = new RiWordnet();
		return r.exists(word);
	}

}
