package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		System.out.println("年齢を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String res = reader.readLine();
		int age = Integer.parseInt(res);

		if (age < 20) {

			System.out.println("２０歳未満なので、お酒の提供ができません。");

		} else {

			System.out.println("２０歳以上なので、お酒を提供することが可能です。");

		}

	}
}
