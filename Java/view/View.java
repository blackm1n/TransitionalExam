package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    public int showMenu() {
        System.out.println("\n" + breakLine());
        System.out.println("1. Добавление игрушки");
        System.out.println("2. Закончить работу");
        return getInt("Введите номер необходимого действия: ");
    }

    public List<String> inputToy(){
        List<String> data = new ArrayList<>();
        data.add(getString("Введите название игрушки: "));
        data.add(String.valueOf(getInt("Введите количество игрушки: ")));
        data.add(String.valueOf(getInt("Введите вес игрушки (в процентах от 100): ")));
        return data;
    }

    public String breakLine() {
        return "=".repeat(20);
    }

    public void info(Object message) {
        System.out.println(message);
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
