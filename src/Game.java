import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);

		System.out.println("v�lj sv�righetsgrad 1-3");

		Hangman gameInstance = new Hangman();

		gameInstance.setDifficulty(sc.next());

		Secret word = new Secret();
		while(!(gameInstance.getLiv() == 0 // || Secret.win=true???)) {
			System.out.println("Gissa en Char: ");
			if(!word.guess(sc.next().charAt(0))) {
				gameInstance.loseLiv();
			}
			gameInstance.update();
		}
	}
}
//m�ste fixa:
// fixa s� att man kan vinna! kollar liv och ordet innan man gissar
//g�t en win metod i secret classen som kollar om det som ska skrivas ut inneh�ller _
//fixa s� att ordet skrivs eftersom! finns klart i guess men m�ste appliceras ocks�
//fixa s� att man inte kan skriva saker som �r out of bounds!
//t.ex sv�righetsgrad med icke ints t.ex a*_b 


// kan fixa om vi orkar:
// Fixa gubbarna som visar antal liv.
//vill vi ha en ruta som kommer upp? jaok githut har exempel
 
