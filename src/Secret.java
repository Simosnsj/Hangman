import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Secret {
	private String word;
	private String secret;
	
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
			
			for(int x = 0; x<word.length();x++){
				String temp ="" + word.charAt(x);
				if(temp.equals(c)){
					secret+= c;
					}else{
					secret +="";
					}
			}
				
			

			return true;
		}

		else{
			return false;
		}
	}
	private void charExchange() {
		
		
		
	}


}


