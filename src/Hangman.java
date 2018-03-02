
public class Hangman {

	private int liv;

	public Hangman() {

	}

	public void setDifficulty(int i) {

		Difficulty(i);

	}

	private void Difficulty(int i) {

		if(i <= 1) {
			System.out.println("Du har valt lätt svårighetsgrad");

			liv = 12;
		}
		else if(i==2) {
			System.out.println("Du har valt medel svårighetsgrad");
			liv = 10;
		}
		else if(i >= 3) {
			System.out.println("Du har valt svår svårighetsgrad");
			liv = 8;
		}
		else {
			
			System.err.println("index out of bounds");
		}	
	}
	public int getLiv(){
		return liv;

	}
	
	public void loseLiv() {
		liv--;



	}
	public void update() {
		lifeDisplay();
		
	}
	
	
	private void lifeDisplay() {

	
	
	

 
		switch(this.liv) {
		case 1:
			System.out.println("       _____     ");
			System.out.println("       |/   |    ");
			System.out.println("       |    O    ");
			System.out.println("       |  /( )|  ");
			System.out.println("      _|__ / |   ");
			System.out.println("     /    |      ");
			System.out.println("    /______|     ");
			System.out.println("liv: "+liv );  
			break;

		case 2:
			System.out.println("       _____     ");
			System.out.println("       |/   |    ");
			System.out.println("       |    O    ");
			System.out.println("       |  /( )|  ");
			System.out.println("      _|__ /     ");
			System.out.println("     /    |      ");
			System.out.println("    /______|     ");
			System.out.println("liv: "+liv );   
			break;

		case 3: 
			System.out.println("       _____     ");
			System.out.println("       |/   |    ");
			System.out.println("       |    O    ");
			System.out.println("       |  /( )|  ");
			System.out.println("      _|__       ");
			System.out.println("     /    |      ");
			System.out.println("    /______|     ");
			System.out.println("liv: "+liv );  
			break;
			
		case 4: 
			System.out.println("       _____     ");
			System.out.println("       |/   |    ");
			System.out.println("       |    O    ");
			System.out.println("       |  /( )   ");
			System.out.println("      _|__       ");
			System.out.println("     /    |      ");
			System.out.println("    /______|     ");
			System.out.println("liv: "+liv ); 
			break;
			
		case 5: 
			System.out.println("       _____   ");
			System.out.println("       |/   |  ");
			System.out.println("       |    O  ");
			System.out.println("       |   ( ) ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv );   
			break;
			
		case 6: 
			System.out.println("               ");
			System.out.println("       _____   ");
			System.out.println("       |/   |  ");
			System.out.println("       |    O  ");
			System.out.println("       |     ) ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv );
			break;
			
		case 7: 
			System.out.println("               ");
			System.out.println("       _____   ");
			System.out.println("       |/   |  ");
			System.out.println("       |    O  ");
			System.out.println("       |       ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv );
			break;
			
		case 8: 
			System.out.println("               ");
			System.out.println("       _____   ");
			System.out.println("       |/   |  ");
			System.out.println("       |       ");
			System.out.println("       |       ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv ); 
			break;
			
		case 9: 
			System.out.println("               ");
			System.out.println("       _____   ");
			System.out.println("       |/      ");
			System.out.println("       |       ");
			System.out.println("       |       ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");	
			System.out.println("liv: "+liv );
			break;
			
		case 10: 
			System.out.println("               ");
			System.out.println("       _____   ");
			System.out.println("       |       ");
			System.out.println("       |       ");
			System.out.println("       |       ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv );   // blablabla om x = 1
			//blabla bla x = 3;
			break;
			
		case 11: 
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("       |       ");
			System.out.println("       |       ");
			System.out.println("       |       ");
			System.out.println("      _|__     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv ); 
			break;
			
		case 12: 
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("      ____     ");
			System.out.println("     /    |    ");
			System.out.println("    /______|   ");
			System.out.println("liv: "+liv );
			break;



		}

	

}





}



