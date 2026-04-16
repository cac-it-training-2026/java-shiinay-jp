package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		int[] stocks = { 10, 20, 30, 40, 50 };

		int sum = 0;
		int num = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {

			System.out.println(itemNames[i] + "の在庫数：＞" + stocks[i]);

		}

		for (int i = 0; i < itemNames.length; i++) {

			while (num < stocks[i]) {

				System.out.print(itemNames[i] + "の購入数：＞");
				String res = reader.readLine();
				num = Integer.parseInt(res);

				if (num > stocks[i]) {

					System.out.println("在庫を超えています。もう一度入力してください。");

				} else {

					amounts[i] = num;
					stocks[i] -= num;
					num = 0;

					break;

				}

			}

		}

		for (int i = 0; i < itemNames.length; i++) {

			sum += amounts[i] * prices[i];

		}

		if (sum >= 5000) {

			System.out.println("割引前合計：" + sum + "円");
			System.out.println("割引適用（10%OFF）：" + (int) (sum * 0.9) + "円");
			System.out.println("税込合計：" + (int) ((sum * 0.9) * 1.1) + "円");

		} else {

			System.out.println("割引前合計：" + sum + "円");
			System.out.println("税込合計：" + (int) (sum * 1.1) + "円");

		}

	}

}
