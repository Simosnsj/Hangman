
public class Hangman {

	private int Liv;
	public void difficulty(int i) {

		if(i == 1) {
			System.out.println("Du har valt l�tt sv�righetsgrad");
		}
		else if(i==2) {
			System.out.println("Du har valt medel sv�righetsgrad");
		}
		else if(i ==3) {
			System.out.println("Du har valt sv�r sv�righetsgrad");
		}
		else {
			System.out.println("index out of bounds");
		}	
	}
}

