package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("名前を入力してください。");
		String name = reader.readLine();

		System.out.println("好きなスポーツを入力してください。");
		String sport = reader.readLine();

		System.out.println(name);
		System.out.println(sport);

	}
}
