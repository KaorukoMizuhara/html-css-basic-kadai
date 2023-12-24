package kadai_017;//親クラス

abstract public class Kato_Chapter17 {
	//フィールド
	String familyName="加藤";//姓を表す
	String givenName="";//名を表す
	String address="東京都中野区○×";//住所を表す
	
	//メソッド
	
	//共通の紹介を出力する	
	public void commonIntroduce() {
	    System.out.println(familyName);
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		
	}

}
