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
			System.out.println("Gissa en Char: ");
			if(!word.guess(sc.next().charAt(0))) {
				gameInstance.loseLiv();
			}
			gameInstance.update();
		}
		System.out.println("Du har förlorat");
	}
}
//måste fixa:
// fixa så att man kan vinna!
//fixa så att ordet skrivs eftersom! finns klart i guess men måste appliceras också
//fixa så att man inte kan skriva saker som är out of bounds!
//t.ex svårighetsgrad med icke ints t.ex a*_b 


// kan fixa om vi orkar:
// Fixa gubbarna som visar antal liv.
//vill vi ha en ruta som kommer upp? jaok githut har exempel
 
