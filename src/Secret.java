
public class Secret {

	private String word;
	private String secret;
	public Secret(int Liv) {
		newSecret("hej");
		sequence();
	}
	public void newSecret(String word) {
		this.word = word;
		this.secret="";
		
		for(int i = 0 ; i < word.length() ; i++) {
			secret +="_";

		}
	}
	
	public void sequence() {
		
		/*.charat*/
	
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


