package calculator;
import java.util.Scanner;

class Main {
public static String calc(String input) {
try {
String[] tokens = input.split(" ");
double num1 = Double.parseDouble(tokens[0]);
double num2 = Double.parseDouble(tokens[2]);
String operator = tokens[1];

double result = 0.0;

switch (operator) {
case "+":
result = num1 + num2;
break;
case "-":
result = num1 - num2;
break;
case "*":
result = num1 * num2;
break;
case "/":
if (num2 != 0) {
result = num1 / num2;
} else {
return "Ошибка: деление на ноль";
}
break;
default:
return "Ошибка: неподдерживаемая операция";
}

return String.format("%.2f", result);
} catch (Exception e) {
return "Ошибка: неверный формат ввода";
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("Введите арифметическое выражение (например, 2 + 3):");
String input = scanner.nextLine();

if (input.equalsIgnoreCase("выход")) {
System.out.println("Программа завершена.");
break;
}

String result = calc(input);
System.out.println("Результат: " + result);
}

scanner.close();
}
}
