
public class Hangman {

	private int liv;
	
	public Hangman() {
		
	}
	
	public void setDifficulty(int i) {
		
			Difficulty(i);
		
	}
	
	private void Difficulty(int i) {

		if(i == 1) {
			System.out.println("Du har valt lätt svårighetsgrad");
			
			liv = 12;
		}
		else if(i==2) {
			System.out.println("Du har valt medel svårighetsgrad");
			liv = 10;
		}
		else if(i ==3) {
			System.out.println("Du har valt svår svårighetsgrad");
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
	
	private void lifeDisplay(int liv) {
		
		switch(liv) {
		case 1:
		          // blablabla om x = 1
		break;

		case 2:
		  // Blblabla x = 2
		break;

		case 3: 
		// blabla bla x = 3;
		break;


		}
		
	}

	
	
	
	
	
}

