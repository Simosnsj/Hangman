
public class Hangman {

	private int liv;
	
	public Hangman() {
		
	}
	
	public void setDifficulty(int i) {
		
			Difficulty(i);
		
	}
	
	private void Difficulty(int i) {

		if(i == 1) {
			System.out.println("Du har valt l�tt sv�righetsgrad");
			
			liv = 12;
		}
		else if(i==2) {
			System.out.println("Du har valt medel sv�righetsgrad");
			liv = 10;
		}
		else if(i ==3) {
			System.out.println("Du har valt sv�r sv�righetsgrad");
			liv = 7;
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
	
	private void lifeDisplay() {
		
	
		System.out.println("*****   *****");
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | *****");
		System.out.println("*****  |  ***");
		System.out.println("***** _|__  ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****   *****");
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  ***");
		System.out.println("***** _|__  ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****   *****");
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  *  )**");
		System.out.println("***** _|__  ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  *( )**");
		System.out.println("***** _|__   ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  /( )**");
		System.out.println("***** _|__  ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  /( )\**");
		System.out.println("***** _|__  ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  /( )\**");
		System.out.println("***** _|__ / ***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		System.out.println("*****  _____*****");
		System.out.println("*****  |/  *|****");
		System.out.println("*****  | ***O**");
		System.out.println("*****  |  /( )\**");
		System.out.println("***** _|__ / \***");
		System.out.println("**** /    \****");
		System.out.println("****/______\  *");
		
		
		
		
		
		
	}

}

