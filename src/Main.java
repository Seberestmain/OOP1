import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HotDrinkWithTemperature coffee1 = new HotDrinkWithTemperature("Кофе", 200, 80);
        HotDrinkWithTemperature coffee2 = new HotDrinkWithTemperature("Кофе", 300, 85);
        HotDrinkWithTemperature tea1 = new HotDrinkWithTemperature("Чай", 250, 75);
        HotDrinkWithTemperature tea2 = new HotDrinkWithTemperature("Чай", 300, 80);
        HotDrinkWithTemperature cocoa = new HotDrinkWithTemperature("Какао", 300, 85);

        VendingMachineHotDrinks vendingMachine = new VendingMachineHotDrinks();
        vendingMachine.addDrink(coffee1);
        vendingMachine.addDrink(coffee2);
        vendingMachine.addDrink(tea1);
        vendingMachine.addDrink(tea2);
        vendingMachine.addDrink(cocoa);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available drinks:");
        List<HotDrinkWithTemperature> allDrinks = vendingMachine.getAllProducts();
        for (HotDrinkWithTemperature drink : allDrinks) {
            System.out.println("- " + drink);
        }

        System.out.print("Напишите название вашего напитка");
        String name = scanner.nextLine();

        List<HotDrinkWithTemperature> availableDrinks = vendingMachine.getProductsByName(name);

        if (!availableDrinks.isEmpty()) {
            System.out.println("Список напитков");
            for (int i = 0; i < availableDrinks.size(); i++) {
                System.out.println((i + 1) + ". " + availableDrinks.get(i));
            }

            System.out.print("Выберите номер вашего напитка");
            int choice = scanner.nextInt();

            if (choice > 0 && choice <= availableDrinks.size()) {
                HotDrinkWithTemperature selectedDrink = availableDrinks.get(choice - 1);
                System.out.println("Вы выбрали: " + selectedDrink);
            } else {
                System.out.println("Выбрали не то");
            }
        } else {
            System.out.println("У нас нет такого напитка");
        }

        scanner.close();
    }
}