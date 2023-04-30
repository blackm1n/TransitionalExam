package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    public int showMenu() {
        System.out.println("\n" + breakLine());
        System.out.println("1. Добавление игрушки");
        System.out.println("2. Просмотреть игрушки");
        System.out.println("3. Закончить работу");
        return getInt("Введите номер необходимого действия: ");
    }

    public List<String> inputToy(){
        List<String> data = new ArrayList<>();
        System.out.println(breakLine());
        data.add(getString("Введите название игрушки: "));
        data.add(String.valueOf(getInt("Введите количество игрушки: ")));
        data.add(String.valueOf(getInt("Введите вес игрушки (в процентах от 100): ")));
        return data;
    }

    public int showToy (String toys) {
        System.out.println("\n" + breakLine());
        System.out.println(toys);
        System.out.println("6. Предыдущая страница");
        System.out.println("7. Следующая страница");
        System.out.println("8. Вернуться в главное меню");
        return getInt("Введите номер необходимого действия: ");
    }

    public String breakLine() {
        return "=".repeat(20);
    }

    public void info(Object message) {
        System.out.println(breakLine());
        System.out.println(message);
    }

    public void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите любое сообщение для продолжения... ");
        scanner.next();
    }

    public String getString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    public int getInt(String message) {
        int num = 0;
        boolean caught = true;
        while (caught) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);
            try {
                num = scanner.nextInt();
                caught = false;
            }
            catch (Exception e) {
                System.out.println("Что-то пошло не так во время ввода числа.");
            }
        }
        return num;
    }
}
