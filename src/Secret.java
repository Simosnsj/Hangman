import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Secret {
	private static String word;
	private static char[] secret;
	private ArrayList<Character> gissningar = new ArrayList<Character>();

	public Secret() throws FileNotFoundException {
		newSecret();
	}

	private void newSecret() throws FileNotFoundException {
		ArrayList<String> words = new ArrayList<String>();

		Scanner sc = new Scanner(new File("ord.txt"));

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


	public boolean guess(char guess) {
		
		boolean state = false;

		gissningar.add(guess);

		if (word.contains("" + guess)) {

			for (int i = 0; i < word.toCharArray().length; i++) {

				if (word.toCharArray()[i] == guess) {
					secret[i] = guess;

					state = true;

				}
			}
		}
		for(int i = 0 ; i<secret.length ;i++ ) {
			System.out.print(secret[i]);
			System.out.print(" ");
		}

		System.out.println(gissningar);

		if (state) {
			return true;
		}
		return false;
	}	


	public static boolean win() {
		String guessedWord = "";

		for(char c : secret) guessedWord += c;

		if (guessedWord.equals(word)) {

			return true;

		}

		return false;

	}
}



