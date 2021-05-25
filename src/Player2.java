
public class Player2 extends Player1{  //Player1 클래스를 상속
	private int health;
	private boolean armor;
	
	public Player2(String name, String weapon, int health, boolean armor) {
		super(name, weapon, health);
		this.health = health;
		this.armor = armor;
	}
	
	public void damageByGun1() {
		if(armor) {
			this.health -= 20;
			if(this.health <= 0)
				this.health = 0;
			System.out.println("갑옷이 장착되어 있습니다,Gun1에 맞아서 체력이 20 감소하였고 현재 체력은 "+this.health+"이 됩니다.");
		}if(!armor) {
			this.health -= 30;
			if(this.health <= 0)
				this.health = 0;
			System.out.println("갑옷이 없습니다,Gun1에 맞아서 체력이 30 감소하였고 현재 체력은 "+this.health+"이 됩니다.");
		}
		if(this.health == 0) {
			System.out.println(getName()+"사망");
		}
	}
	
	public void damageByGun2() {
		if(armor) {
			this.health -= 40;
			if(this.health <= 0)
				this.health = 0;
			System.out.println(getName()+" 은/는 갑옷이 장착되어 있습니다,Gun1에 맞아서 체력이 40 감소하였고 현재 체력은 "+this.health+"이 됩니다.");
		}if(!armor) {
			this.health -= 50;
			if(this.health <= 0)
				this.health = 0;
			System.out.println(getName()+" 은/는 갑옷이 없습니다,Gun1에 맞아서 체력이 50 감소하였고 현재 체력은 "+this.health+"이 됩니다.");
		}
		if(this.health == 0) {
			System.out.println(getName()+"사망");
		}
	}
	
	public void heal() {
		super.heal();
	}
}
