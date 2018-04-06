package JeuBaseTexte.storage;

import JeuBaseTexte.item.Item;

public class PlaceStorage extends Storage{

	@Override
	public void displayItemList() {
		if(this.list.isEmpty()){
		System.out.println("#		    || There are no items around you\n#		    ||");
		}else{

			for (Item item : this.list) {
				System.out.println("#		    ||    - "+item+"\n#		    ||");
			}
		}
	}
}