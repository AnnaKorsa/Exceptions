package HW2.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    */

        public static void main(String[] args) {
            boolean flag = false;
            float num = 0;

            do try {
                num = inputFloatNumber();
                flag = false;
            } catch (Exception e) {
                System.out.println("Ошибка! Некорректный ввод");
                flag = true;
            }
            while (flag);
            System.out.println("Результат: " +  num);
        }

    private static float inputFloatNumber() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        float result;
        try {
            result = scanner.nextFloat();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ошибка! Некорректный ввод");
        }
        return result;
    }
}