package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		int[] stocks = { 10, 20, 30, 40, 50 };

		int[] sum = new int[itemNames.length];
		int all_sum = 0;
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

		System.out.println("\n購入内容一覧：");

		for (int i = 0; i < itemNames.length; i++) {

			sum[i] = amounts[i] * prices[i];
			all_sum += sum[i];
			System.out.println(
					itemNames[i] + "：単価" + prices[i] + "円（税込み" + (int) (prices[i] * 1.1) + "円） ×" + amounts[i] + "個 = "
							+ sum[i]
							+ "円");

		}

		if (all_sum >= 5000) {

			System.out.println("合計(税込）：" + (int) (all_sum * 1.1) + "円");
			System.out.println("割引後合計（税込）：" + (int) ((all_sum * 1.1) * 0.9) + "円");

		} else {

			System.out.println("合計（税込）：" + (int) ((all_sum * 1.1)) + "円");

		}

	}
}