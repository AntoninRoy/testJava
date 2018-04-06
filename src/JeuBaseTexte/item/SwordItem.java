/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuBaseTexte.item;

/**
 *
 * @author antonin
 */
public class SwordItem extends EquipableItem{
    public int damage;

	public SwordItem(String name, int weight, int damage){
		super(name, weight);
		this.damage = damage;
	}

	@Override
	public String toString() {
		String str = "Sword : "+this.name;
		str+="\n\t- damage : "+this.damage;
		str+="\n\t- weight :"+this.weight;
		return str;
	}
}
