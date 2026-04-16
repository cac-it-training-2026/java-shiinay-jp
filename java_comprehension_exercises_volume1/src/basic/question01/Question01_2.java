package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		//１．int 型の変数 [applePrice] を初期化して作成する
		int applePrice = 100;

		//２．String 型の変数[stationery] を初期化して作成する
		String stationery = "鉛筆";

		//３．int 型の変数[bananaPrice]を初期化して作成する
		int bananaPrice = applePrice;

		//４．String 型の変数[writingUtensils]を初期化して作成する
		String writingUtensils = stationery;

		//５． [applePrice]、[bananaPrice]、[writingUtensils]の順番で値を次のとおりコンソールに出力する
		System.out.println("りんごの値段は" + applePrice + "円です。");
		System.out.println("バナナの値段は" + bananaPrice + "円です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");
	}

}
