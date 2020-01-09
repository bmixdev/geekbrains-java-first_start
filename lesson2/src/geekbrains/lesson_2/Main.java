package geekbrains.lesson_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите действие: \n 1. Сложение\n 2. Вычитание\n 3. Умножение\n 4. Деление");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        System.out.println("Введите 1ое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите 2ое число: ");
        int b = scanner.nextInt();
        float result;
        if (action == 1)
            result = a + b;
        else if (action == 2)
            result = a - b;
        else if (action == 3)
            result = a * b;
        else
            result = a / b;
        System.out.println("Результат: " + result);

    }
}
