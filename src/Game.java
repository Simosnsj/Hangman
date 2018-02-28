import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);

		System.out.println("välj svårighetsgrad 1-3");

		Hangman gameInstance = new Hangman();

		gameInstance.setDifficulty(sc.nextInt());

		Secret word = new Secret();
		while(!(gameInstance.getLiv() == 0)) {
			System.out.println("Gissa en bokstav");
			if(!word.guess(sc.next().charAt(0))) {
				gameInstance.loseLiv();
			}
			gameInstance.update();
		}
		System.out.println("Du har förlorat");
	}
}

//skapa uppdate metod