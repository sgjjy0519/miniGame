
public class Main {

	public static void main(String[] args) {
		Player1 player = new Player1("헤라클레스","검",80);
		
		player.damageByGun1();
		player.damageByGun1();
		
		player.heal();
		
		
		Player2 strPlayer = new Player2("제우스","번개화살",100,true);
		
		strPlayer.damageByGun1();
		strPlayer.damageByGun1();
		strPlayer.damageByGun2();
		
		strPlayer.heal();
	}

}
