package HW2.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.print("Введите строку текста: ");
            String inputString  = scanner.nextLine();
            if (inputString.equals("")) {
                throw new RuntimeException("Введена пустая строка, это недопустимо!\n");
            }
            System.out.println("Введена строка: " + inputString);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
