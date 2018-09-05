package com.find.englishword;

import java.util.HashSet;
import java.util.Set;

public class App {
	Set<String> set = new HashSet<String>();
	Set<String> setForEnglish = new HashSet<String>();

	public static void main(String[] args) {
		App a = new App();
		a.combOfWordExist("working");
		// a.combOfWordExist("gnikrow");
		Dictionary d = new Dictionary();

		// List<String> sortedList=new ArrayList<>(a.setForEnglish);
		// Collections.sort(sortedList);
		// for(String str:sortedList){
		// System.out.println(str);
		// }

		Set<String> finalSet = new HashSet<String>();

		for (String str : a.setForEnglish) {
			if (d.isEnglishWord(str)) {
				finalSet.add(str);
			}
		}

		for (String setString : finalSet) {
			System.out.println(setString);
		}

	}

	public void combOfWordExist(String word) {
		permute(word, 0, word.length() - 1);
		for (String str : set) {
			char[] d = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				StringBuilder x = new StringBuilder();
				x.append(d[i]);
				setForEnglish.add(x.toString());
				for (int j = 0; j < str.length(); j++) {
					if (d[i] != d[j]) {
						x.append(d[j]);
						setForEnglish.add(x.toString());
					}
				}

			}

		}

	}

	private void permute(String str, int l, int r) {
		if (l == r) {
			set.add(str);
			// System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	//

	// set=new HashSet<>();
	//
	// StringBuilder b=new StringBuilder();
	// for(int i=word.length()-1;i>=0;i--){
	// b.append(c[i]);
	// }
	// String reverse=b.toString();
	//
	// // a,b,c,d,e,f
	// for(int i=0;i<=word.length();i++){
	// for(int j=i;j<=word.length();j++){
	// System.out.print(word.substring(i,j)+" ");
	// System.out.print(reverse.substring(i,j)+" ");
	//
	// }
	// }

}
