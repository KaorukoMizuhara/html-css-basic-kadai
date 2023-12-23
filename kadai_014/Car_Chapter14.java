package kadai_014;

public class Car_Chapter14 {
	//フィールドを書く
	private int gear=1;
	private int speed =10;
	
	 // コンストラクタ（初期化処理
	public Car_Chapter14(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		
	}
	 public int getGear() {
	        return this.gear;
	    }

	  public int getSpeed() {
	        return this.speed;
	    }

	//メソッドを書く
	public void gearChange(int afterGear) {
		//ギアの値により速度を変える
		 speed=switch(this.gear) {
		    case 1 -> 10;
	        case 2 -> 20;
	        case 3 -> 30;
	        case 4 -> 40;
	        case 5 -> 50;
	        default -> 10;
		 };
	}
		 
	public void run() {
		//ギアチェンジ後の速度を表示する
		 System.out.println("ギア"+this.gear+"から"+this.getGear()+"に切り替えました");
		 System.out.println("速度は時速"+this.getSpeed()+"kmです");

	}
}