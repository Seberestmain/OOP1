public class Main {
    public static void main(String[] args) {
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Кофе", 200, 80);
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Чай", 250, 75);
        HotDrinkWithTemperature cocoa = new HotDrinkWithTemperature("Какао", 300, 85);

        VendingMachineHotDrinks vendingMachine = new VendingMachineHotDrinks();
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(tea);
        vendingMachine.addDrink(cocoa);


        HotDrinks selectedDrink = vendingMachine.getProduct("Чай", 250, 75);

        if (selectedDrink != null) {
            System.out.println("Выбран " + selectedDrink);
        } else {
            System.out.println("Такого напитка нет");
        }
    }
}