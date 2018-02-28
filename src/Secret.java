import java.io.File;

public class Secret {

	private String word;
	private String secret;
	public Secret(int Liv) {
		newSecret();
		sequence();
	}
	public void newSecret() {
		string word = new File("ord.txt");
		this.word = word;
		this.secret="";
		
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


