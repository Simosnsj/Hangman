
public class Game {

	public Game start;
	
	private static int instances = 0;

	public static int getInstances() {
		return instances;
	}

	public static void setInstances(int instances) {
		Game.instances = instances;
		//ska g�ra s� att bara en instance kan finnas
		}


}
