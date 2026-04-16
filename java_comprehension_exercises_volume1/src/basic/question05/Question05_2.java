package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {

		int[] numbeGroup = { 3, 5, 7, 9 };

		switch (numbeGroup[3]) {
		case 3:

			System.out.println("４番目の要素は３です。");

			break;

		case 5:

			System.out.println("４番目の要素は５です。");
			break;

		case 7:

			System.out.println("４番目の要素は７です。");
			break;

		default:

			System.out.println("４番目の要素の値は３，５，７以外の値です。");

			break;
		}

	}
}
