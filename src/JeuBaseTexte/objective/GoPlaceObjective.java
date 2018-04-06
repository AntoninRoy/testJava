package JeuBaseTexte.objective;

import JeuBaseTexte.Game;
import JeuBaseTexte.Place;
import JeuBaseTexte.character.PlayableCharacter;

public class GoPlaceObjective extends Objective{
	Place place;

	public GoPlaceObjective(String description,Place place) {
		super(description);
		this.place=place;
	}

	@Override
	public void checkIfAchieved(Game game) {
                PlayableCharacter hero = (PlayableCharacter) game.getCharacter();
		if(hero.location.equals(this.place)){
			this.succeeded=true;
		}
	}

}
