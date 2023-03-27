package rpg;

public class Item {

	static final int WEAPON = 1;
	static final int ARMOR = 2;
	static final int RING = 3;
	private String name;
	private int kind, power, price;
	
	public void setItem(String name, int kind, int power, int price) {
		this.name = name;
		this.kind = kind;
		this.power = power;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getKind() {
		return this.kind;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
}
