package Numeric.binary;
/*десятичное в двоичное*/
public class dec_in_bin {
	static String decimalToBinary (int decimalValue) {
		int n = 0;
		String a = "";
		while (n <= decimalValue) {
			if (decimalValue % 2 == 0) {
				decimalValue = decimalValue / 2;
				a = "1" + a;
			} else {
				a = "0" + a;
				decimalValue += -1;
			}
			n++;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(decimalToBinary(34));
	}
}
