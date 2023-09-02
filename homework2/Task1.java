
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
 приложения, вместо этого, необходимо повторно запросить у пользователя ввод
 данных. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = readFloat();
        System.out.println("Введенное число: " + number);
    }

    public static float readFloat() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Введите дробное число: ");
                    float number = Float.parseFloat(scanner.nextLine());
                    return number;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                }
            }
        }
    }
}

