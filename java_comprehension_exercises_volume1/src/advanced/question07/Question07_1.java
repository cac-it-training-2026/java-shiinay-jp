package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		String[] itemNames = new String[5];
		int[] price = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {

			System.out.print("商品" + (i + 1) + "を入力してください：＞");
			String res = reader.readLine();
			itemNames[i] = res;
			System.out.print("\n");

		}

		for (int i = 0; i < itemNames.length; i++) {

			System.out.println("各商品の単価を順に入力してください：");
			System.out.print(itemNames[i] + "の単価：＞");
			String res = reader.readLine();
			price[i] = Integer.parseInt(res);
			System.out.print("\n");

		}

		System.out.println("登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {

			System.out.println(itemNames[i] + "：" + price[i] + "円");

		}

	}

}
