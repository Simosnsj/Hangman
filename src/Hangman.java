
public class Hangman {

	private int liv;
	
	public void setDifficulty(int i) {
		
		if(liv == null) {
			Difficulty(i);
		}
		else
		
		
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
			liv = 7;
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
	
}

