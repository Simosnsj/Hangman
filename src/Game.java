import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("v�lj sv�righetsgrad 1-3");
		
		Hangman gameInstance = new Hangman();
		
		gameInstance.setDifficulty(sc.nextInt());

		Secret word = new Secret;
		
		sc.close();
		
	}
}

