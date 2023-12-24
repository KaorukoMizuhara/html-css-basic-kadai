package kadai_017;
//子クラス
public class KatoTaro_Chapter17 extends Kato_Chapter17 {
    String taroroIntroduce="";
	public void setGivenName(String Name) {
		givenName=Name;
		}
	public void eachIntroduce() {
		taroroIntroduce="Javaが得意です";
	}
	public void execIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
		eachIntroduce();
		System.out.println(taroroIntroduce);
	}
}