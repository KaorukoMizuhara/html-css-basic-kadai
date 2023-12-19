package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		//変数を宣言する
		int userAge=30;
		int serviceCost=0;
	
	//switch文を書く
	 switch(userAge) {
	 case 10:
		   serviceCost=1000;
		   break;
	 case 20:
		   serviceCost=2000;
	 case 30:
	 case 40:
		   serviceCost=3000;
		   break;
	 case 50:
	 case 60:
     case 70:
	      serviceCost=4000;
	      break;
	 case 80:
		 serviceCost=5000;
		 break;
	 default:
		   serviceCost=500;
		   break;
	 
	   }
	 System.out.println(userAge+"代の料金は"+serviceCost+"円");
	}	
}