import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);

		System.out.println("välj svårighetsgrad 1-3");

		Hangman gameInstance = new Hangman();
		String i = sc.next();
		while(true) {
			try {

				int x = Integer.parseInt(i);
				gameInstance.setDifficulty(x);
				break;
			}


			catch(Exception ex){
				System.out.println("Fel, ogiltig input");
				i = sc.next();
				
			}
		}
		Secret word = new Secret();
		while(!(gameInstance.getLiv() == 0 /* || Secret.win=true???*/)) {
			System.out.println("Gissa en Char: ");
			if(!word.guess(sc.next().charAt(0))) {
				gameInstance.loseLiv();
			}
			gameInstance.update();
		}
	}
}
//måste fixa:
// fixa så att man kan vinna! kollar liv och ordet innan man gissar
//göt en win metod i secret classen som kollar om det som ska skrivas ut innehåller _
//fixa så att ordet skrivs eftersom! finns klart i guess men måste appliceras också



// kan fixa om vi orkar:
// Fixa gubbarna som visar antal liv.
//vill vi ha en ruta som kommer upp? jaok githut har exempel

