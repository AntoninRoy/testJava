package JeuBaseTexte;

import JeuBaseTexte.storage.Storage;
import JeuBaseTexte.storage.PlaceStorage;
import JeuBaseTexte.storage.Chest;
import JeuBaseTexte.character.EnemyCharacter;
import JeuBaseTexte.character.HelpingCharacter;
import JeuBaseTexte.character.PlayableCharacter;
import JeuBaseTexte.item.Item;
import java.util.*;

public class Place {


	private final String name;
	public String description;
	
	public HashMap<String,Exit> exits = new HashMap<String,Exit>();
	public HashMap<String,Chest> chests = new HashMap<String,Chest>();
	public HashMap<String,HelpingCharacter> helpingCharacters = new HashMap();
        public HashMap<String,EnemyCharacter> enemyCharacters = new HashMap();
	public Storage storage = new PlaceStorage();
	public PlayableCharacter hero;

	public Place(String name,String description){
		this.name=name;
		this.description=description;
		
	}

	public Place(int temp, int nbPlaces){
		this.name="Place_"+nbPlaces;

		nbPlaces++;
	}
	
	public boolean addStorage(Item item){
		return this.storage.add(item);
	}
        public boolean addItem(Item item){
		return this.storage.add(item);
	}

	public void addChest(Chest chest){
		int n=0;
		String additive="";
		// si le nom est deja present dans la map,
		// pour eviter que deux "keys" aient le meme nom
		// on ajoute un nombre a la fin
		while(this.chests.containsKey("chest"+additive)){
			n++;
			additive="_"+n;
		}
		this.chests.put("chest"+additive, chest);
	}

	public void displayItems(){

		this.storage.displayItemList();
	}

	public void displayExits(){

		System.out.println("#		    || These exits are available  :");

		for (Map.Entry<String,Exit> e : this.exits.entrySet()) {
			Exit exit = e.getValue();
			System.out.println("#		    ||     - "+exit);
		}	
		System.out.println("\n#		    ||");	
	}

	public void displayHelpingCharacters(){
             System.out.println("#		    || There are some helping characters  :");
		for (Map.Entry<String,HelpingCharacter> e : this.helpingCharacters.entrySet()) {
			HelpingCharacter helpingCharacter = e.getValue();
			System.out.println("#		    || "+helpingCharacter.name);
		}
		System.out.println("\n#		    ||");			
	}
    public void displayEnemies(){
                System.out.println("#		    || There are some enemies  :");
		for (Map.Entry<String,EnemyCharacter> e : this.enemyCharacters.entrySet()) {
                    EnemyCharacter enemyCharacter = e.getValue();
			System.out.println("#		    ||     - "+enemyCharacter.name);
		}
                System.out.println("\n#		    ||");
	}
	public void displayChests(){
		for (Map.Entry<String,Chest> e : this.chests.entrySet()) {
			final String name = e.getValue().name;
			System.out.println("#		    ||     - "+name);
		}
		System.out.println("\n#		    ||");
	}

	public void displayAll(){
		if(this.storage.isEmpty() && this.helpingCharacters.isEmpty() && this.chests.isEmpty() && this.enemyCharacters.isEmpty()){
			System.out.println("#		    || There is nothing\n#		    ||");
		}else{
			System.out.println("#		    || There is : ");
			this.displayItems();
			this.displayChests();
			this.displayHelpingCharacters();
                        this.displayEnemies();

		}
		this.displayExits();
	}
        
        public Chest getChestByName(String name){
		Chest chest = null;
		for (Map.Entry<String,Chest> e : this.chests.entrySet()) {
                    if(e.getKey().equals(name)){
                            if(e.getValue().lock){
                                    chest=e.getValue();
                            }
                    }
                }
		return chest;
	}

	public Exit getExitByName(String name){
		Exit exit = null;
                for (Map.Entry<String,Exit> e : this.exits.entrySet()) {
                          if(e.getKey().equals(name)){
                                  if(e.getValue().lock){
                                          exit=e.getValue();
                                  }
                          }
                  }
		return exit;
	}

	public void displayDescription() {
				System.out.println("#		    || "+this.description+"\n#		    ||");

	}


	@Override
	public String toString(){
		return this.name;
	}

	public String getName() {
		return name;
	}
}