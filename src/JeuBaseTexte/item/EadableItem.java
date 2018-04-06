package JeuBaseTexte.item;

import JeuBaseTexte.item.Item;

public class EadableItem extends Item {

	public int healthGain;

	public EadableItem(String name, int weight, int healthGain){
		super(name, weight);
		this.healthGain=healthGain;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof EadableItem){
			return this.name==((EadableItem) o).name && this.weight==((EadableItem) o).weight && this.healthGain == ((EadableItem) o).healthGain;
		}
		return false;
	}

	@Override
	public String toString(){
		return this.name+": "+this.healthGain+" HP "+this.weight+" dag";
	}

}