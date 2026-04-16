package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		System.out.println("数学の試験結果の点数を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String math_score = reader.readLine();
		int math = Integer.parseInt(math_score);

		System.out.println("国語の試験結果の点数を入力してください。");

		String japanese_score = reader.readLine();
		int japanses = Integer.parseInt(japanese_score);

		if (math >= 60 && japanses >= 60) {

			System.out.println("数学と国語ともに合格です。");

		} else if (math >= 60 || japanses >= 60) {

			System.out.println("数学、国語どちらかが合格です。");

		} else {

			System.out.println("どちらの強化も不合格です。");

		}

	}
}
