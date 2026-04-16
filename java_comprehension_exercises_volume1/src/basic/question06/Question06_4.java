package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int amountBooks = 0;
		int sellFag = 0;
		int bookPrice = 200;

		System.out.println("本を売却します。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		do {

			++amountBooks;

			System.out.println("売却する本の冊数を増やしますか？");
			System.out.println("はい：0、いいえ：1＞");

			String res = reader.readLine();
			sellFag = Integer.parseInt(res);

		} while (sellFag == 0);

		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks * bookPrice) + "円です。");

	}

}
