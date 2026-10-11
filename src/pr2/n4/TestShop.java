package pr2.n4;

import java.util.Scanner;
public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop(10);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.print("Введите производителя: ");
                String proizvod = scanner.nextLine();
                System.out.print("Введите модель: ");
                String model = scanner.nextLine();
                System.out.print("Введите цену: ");
                double price = Double.parseDouble(scanner.nextLine());
                Computer computer = new Computer(
                        proizvod, model, price
                );
                if (shop.addComputer(computer)) {
                    System.out.println("Компьютер добавлен");
                } else {
                    System.out.println("Магазин заполнен");
                }
            } else if (choice == 2) {
                System.out.print("Введите модель для удаления: ");
                String model = scanner.nextLine();
                if (shop.removeComputer(model)) {
                    System.out.println("Компьютер удалён");
                } else {
                    System.out.println("Компьютер не найден");
                }
            } else if (choice == 3) {
                System.out.print("Введите модель для поиска: ");
                String model = scanner.nextLine();
                Computer found = shop.findComputer(model);
                if (found != null) {
                    System.out.println("Найден компьютер:");
                    System.out.println(found);
                } else {
                    System.out.println("Компьютер не найден");
                }
            } else if (choice == 4) {
                shop.printComputers();
            } else if (choice != 0) {
                System.out.println("Неправильный выбор действия");
            }
        }
        System.out.println("Программа завершена");
        scanner.close();
    }
}