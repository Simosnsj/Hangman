import java.lang.reflect.Array;

public class Secret {
	public Secret() {

	}


	private String word;
	private String secret;

	public void newSecret(String word) {
		this.word = word;
		this.secret="";
		
		for(int i = 0 ; i < word.length() ; i++) {
			secret +="_";

		}
	}


}


