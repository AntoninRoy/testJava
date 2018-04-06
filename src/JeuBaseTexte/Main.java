package JeuBaseTexte;

import JeuBaseTexte.character.PlayableCharacter;


public class Main{
	

	

	public static void main(String[] args){
		
		PlayableCharacter hero = new PlayableCharacter();
		World world = new World("Maison");
		Game game = new Game(world,hero);
		
		world.createWorldByXml(game);
		game.play();
		
		}



	}