
public class Hangman {

	private int Liv;
	public void difficulty(int i) {

		if(i == 1) {
			System.out.println("Du har valt lätt svårighetsgrad");
		}
		else if(i==2) {
			System.out.println("Du har valt medel svårighetsgrad");
		}
		else if(i ==3) {
			System.out.println("Du har valt svår svårighetsgrad");
		}
		else {
			System.out.println("index out of bounds");
		}	
	}
}

