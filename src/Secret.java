import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Secret {
	private ArrayList<String> words = new ArrayList<String>();
	private String word;
	private String secret;
	public Secret() throws FileNotFoundException {
		newSecret();
		sequence();
	}
	public void newSecret() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("ord.text"));

		for(int i = 0; sc.hasNextLine(); i++) {
			words.add(sc.nextLine());

		}
		
		
		
		String word = new String();
		this.word = word;
		this.secret= new String();

		for(int i = 0 ; i < word.length() ; i++) {
			secret +="_";

		}
	}

	public void sequence() {



	}



	public boolean guess(char c) {

		if(word.contains(""+c)) {


			return true;
		}

		else{
			return false;
		}
	}


}


