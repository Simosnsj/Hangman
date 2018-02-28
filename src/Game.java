import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("välj svårighetsgrad 1-3");
		
		Hangman gameInstance = new Hangman();
		
		gameInstance.setDifficulty(sc.nextInt());

		Secret word = new Secret();
		
		if(!word.guess(sc.next().charAt(0))) {
			gameInstance.loseLiv();
		}
		
		sc.close();
		
	}
}

