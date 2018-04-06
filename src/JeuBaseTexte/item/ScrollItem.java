package JeuBaseTexte.item;

public class ScrollItem extends Item{

	public String message;

	ScrollItem(String name, int weight, String message){
		super(name, weight);
		this.message=message;
	}
	public String read(){
		return this.message;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof ScrollItem){
			return this.name==((ScrollItem) o).name && this.weight==((ScrollItem) o).weight && this.message == ((ScrollItem) o).message;
		}
		return false;
	}

	@Override
	public String toString(){
		return this.name;
	}
}
