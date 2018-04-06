package JeuBaseTexte.item;

public class Item {


	public String name;
	public int weight;
	public String description;

	public Item(String name, int weight){
		this.name=name;
		this.weight=weight;

	}

	@Override
	public String toString(){
		return this.name+", "+this.weight+" dag";
	}
}