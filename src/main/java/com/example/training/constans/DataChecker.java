/**
 * 
 */
package com.example.training.constans;

/**
 * @author Administrator
 *
 */
public class DataChecker {

	/* kiểm tra xem đối tượng truyền vào có là null hay không */
	public static boolean isNull(Object obj) {
		return obj == null;
	}

	/* kiểm tra xem chuỗi truyền vào có là rỗng hay không */
	public static boolean isEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}

	/* kiểm tra xem chuỗi truyền vào có là null hoặc rỗng hay không */
	public static boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}

	/* kiểm tra xem số nguyên truyền vào có là số dương hay không */
	public static boolean isPositive(int num) {
		return num > 0;
	}

	/* kiểm tra xem số nguyên truyền vào có là số âm hay không */
	public static boolean isNegative(int num) {
		return num < 0;
	}

	/* kiểm tra giá trị bằng 0 */
	public static boolean isZero(int num) {
		return num == 0;
	}

	/* Kiểm tra giá trị khác 0 */
	public static boolean isNonZero(int num) {
		return num != 0;
	}

}
