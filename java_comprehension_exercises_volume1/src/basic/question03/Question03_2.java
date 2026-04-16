package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		int basePrice = 1200;
		int tickets = 3;
		int reducePrice = basePrice - 200;
		int reduceTickts = --tickets;
		int totalPrice = reducePrice * reduceTickts;
		double taxRate = 1.1;
		int totalWithTax = (int) (totalPrice * taxRate);

		System.out.println("購入可能枚数は" + reduceTickts + "枚です。");
		System.out.println("値下げ後の１枚当たりの料金は" + reducePrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込み）は" + totalWithTax + "です。");

	}
}
