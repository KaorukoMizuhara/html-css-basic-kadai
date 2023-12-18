package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		//変数を宣言する
		int userAge=0;
		int serviceCost=0;
	
	   userAge=35;
	   //if文を書く
		if (userAge<20) {
			serviceCost=1000;
		}else if (userAge<30) {
			serviceCost=2000;
		}else if (userAge<40) {
			serviceCost=3000;
			System.out.println("30代の料金は3000円");
		}else if (userAge<50) {
			serviceCost=3000;	
		}else if (userAge<60) {
			serviceCost=4000;
		}else if (userAge<70) {
			serviceCost=4000;
		}else if(userAge<80) {
			serviceCost=4000;
		}else if (userAge<90) {
			serviceCost=5000;
		}else {
			serviceCost=500;
		}
	}
}