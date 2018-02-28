import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Secret {
	private String word;
	private char[] secret;
	private ArrayList<Character> gissningar = new ArrayList<Character>();

	public Secret() throws FileNotFoundException {
		newSecret();
		sequence();
	}

	private void newSecret() throws FileNotFoundException {
		ArrayList<String> words = new ArrayList<String>();

		Scanner sc = new Scanner(new File("ord.text"));

		for(int i = 0; sc.hasNextLine(); i++) {
			words.add(sc.nextLine());

		}
		String word = words.get((int) (words.size() * Math.random()));
		word.toUpperCase();
		this.word = word;
		this.secret= new char[word.length()];

		for(int i = 0 ; i < word.length() ; i++) {
			secret[i] +='_';

		}
	}


	public boolean guess(char c) {

		if(word.contains(""+c) && !gissningar.contains(c)) {
			gissningar.add(c);
			for(int x = 0 ; x<word.length() ; x++ ){
				String temp = "" + word.charAt(x);
				if(temp.equals(c)){
					secret[x] += c;
				}
				
			}

			return true;
		}

		else{
			return false;
		}
	}


}


