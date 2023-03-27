package rpg;

public class Unit {

	private String name;
	private int level, hp, maxHp, att, def, exp;
	private boolean party;
	private Item weapon, armor, ring;
	
	public Unit(String name, int level, int hp, int maxHp, int att, int def, int exp) {
		this.name = name;
		this.level = level;
		this.hp = maxHp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.party = false;
		this.weapon = null;
		this.armor = null;
		this.ring = null;
	}
	
	public Unit(String name, int level, int hp, int maxHp, int att, int def, int exp, boolean party) {
		this.name = name;
		this.level = level;
		this.hp = maxHp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.party = party;
		this.weapon = null;
		this.armor = null;
		this.ring = null;
	}
	
	public void setItem(Item weapon, Item armor, Item ring) {
		this.weapon = weapon;
		this.armor = armor;
		this.ring = ring;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public boolean isParty() {
		return party;
	}

	public void setParty(boolean party) {
		this.party = party;
	}

	public Item getWeapon() {
		return weapon;
	}

	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}

	public Item getArmor() {
		return armor;
	}

	public void setArmor(Item armor) {
		this.armor = armor;
	}

	public Item getRing() {
		return ring;
	}

	public void setRing(Item ring) {
		this.ring = ring;
	}
	
	public void printStatus() {
		System.out.printf("[이름 : %s]\n", this.name);
		System.out.printf("[레벨 : %s]\n", this.level);
		if (ring != null) {
			System.out.printf("[체력 : %s + %s/%s + %s]\n", this.hp, ring.getPower(), this.maxHp, ring.getPower());
		}
		else {
			System.out.printf("[체력 : %s/%s]\n", this.hp, this.maxHp);
		}
		if (weapon != null) {
			System.out.printf("[공격력 : %s + %s]\n", this.att, weapon.getPower());
		}
		else {
			System.out.printf("[공격력 : %s]\n", this.att);
		}
		if (armor != null) {
			System.out.printf("[방어력 : %s + %s]\n", this.def, armor.getPower());
		}
		else {
			System.out.printf("[방어력 : %s]\n", this.def);
		}
	}
	
	public void printEquitedItem() {
		if (weapon == null) {
			System.out.println("[무기 : 없음]");
		}
		else {
			System.out.printf("[무기 : %s]\n", weapon.getName());
		}
		if (armor == null) {
			System.out.println("[방어구 : 없음]");
		}
		else {
			System.out.printf("[방어구 : %s]\n", armor.getName());
		}
		if (ring == null) {
			System.out.println("[반지 : 없음]");
		}
		else {
			System.out.printf("[반지 : %s]\n", ring.getName());
		}
	}
	
}
