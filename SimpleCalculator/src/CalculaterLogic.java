import java.util.ArrayList;
import java.util.List;

public class CalculaterLogic {

	// public
	public static String Calculate(String num1, String num2, String operator) {
		String result = "";
		double doubleResult = 0;

		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		if (operator == "+") {
			doubleResult = n1 + n2;
		} else if (operator == "-") {
			doubleResult = n1 - n2;
		} else if (operator == "*") {
			doubleResult = n1 * n2;
		} else if (operator == "/") {
			doubleResult = n1 / n2;
		} else {
			doubleResult = 0;
		}
		result = Double.toString(doubleResult);
		;
		return result;
	}

}

