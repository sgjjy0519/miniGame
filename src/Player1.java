
public class Player1 {
	private String name;         //이름
	private String weapon;		 //무기
	private int health;			 //체력
	
	public Player1(String name, String weapon, int health) { //생성자, 변수초기화
		this.name = name;
		this.weapon = weapon;
		if(health < 0 || health > 100) { //체력은 0~100 제한
			this.health = 100;
		}else this.health = health;
	}
	
	public void damageByGun1() { // Gun1의 데미지
		this.health -= 30;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Gun1에 맞아서 체력이 30 감소하였고, 현재 체력은 "+this.health+"이됩니다.");
		if(this.health == 0) {
			System.out.println(getName() + "사망");
		}
	}
	
	public void damageByGun2() { // Gun2의 데미지
		this.health -= 50;
		if(this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Gun2에 맞아서 체력이 50 감소하였고, 현재 체력은 "+this.health+"이됩니다.");
		if(this.health == 0) {
			System.out.println(getName() + "사망");
		}
	}
	
	public void heal() { //체력회복
		if(this.health <= 0 )
			System.out.println(getName()+" 이/가 사망하여, 치료가 불가능합니다.");
		else {
			this.health = 100;
			System.out.println("치료를 받아 현재 체력은 "+this.health+"입니다.");
		}
	}
	
	
	// 변수 getter-setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
}














