
public class Hangman {

	private int liv;
	
	public Hangman() {
		
	}
	
	public void setDifficulty(int i) {
		
			Difficulty(i);
		
	}
	
	private void Difficulty(int i) {

		if(i == 1) {
			System.out.println("Du har valt l�tt sv�righetsgrad");
			
			liv = 12;
		}
		else if(i==2) {
			System.out.println("Du har valt medel sv�righetsgrad");
			liv = 10;
		}
		else if(i ==3) {
			System.out.println("Du har valt sv�r sv�righetsgrad");
			liv = 8;
		}
		else {
			System.out.println("index out of bounds");
		
		}	
	}
	public int getLiv(){
		return liv;
		
	}
	public void loseLiv() {
		liv--;
		
		
		
	}
	
	private void lifeDisplay() {
		
		
		
		
		
		
	}

	
	
	
	
	
}

