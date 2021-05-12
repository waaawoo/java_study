//パッケージ宣言
package Lesson_1;

import java.util.Iterator;

//　クラス
public class HelloWorld {

//	メインメソッド
	public static void main(String[] args) {
		System.out.println("HelloWorld");
//		型の宣言
		String n;
		String x = "おはよう";
		n = "ございます";
//		型の連結
		String i = x + n;
		System.out.println(i);
//		実行結果　「おはようございます」

//		型変換
		String x1 = "12";
		String x2 = "3";
		System.out.println(x1 + x2);

//		String -> int
		int y = Integer.parseInt(x1);
		int y2 = Integer.parseInt(x2);
		System.out.println(y + y2);

//		条件分岐
		int umare;
		umare = 1989;
		if (umare < 1927) {
			System.out.println("大正生まれ");
		} else if (umare < 1912) {
			System.out.println("昭和生まれ");
		} else {
			System.out.println("平成生まれ");
		}
		
//		繰り返し処理
		int sum = 0;
		for(int fori = 1; fori <= 10; fori++) {
			sum += fori;
		}
		System.out.println(sum);
		
//		配列
//		new　型名[配列]　で配列を作成する
		String name[] = new String[3];
		double hei[] = new double[3];
		
		name[0] = "山田";
		hei[0] = 189.1;
		name[1] = "田中";
		hei[1] = 183.1;
		name[2] = "鈴木";
		hei[2] = 180.1;
		
		int roop;
		for(roop = 0; roop < 3; roop++) {
			System.out.println(name[roop] + ":" + hei[roop] + "cm");
		}
	
		
	}

}
