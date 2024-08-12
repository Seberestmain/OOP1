import java.util.ArrayList;
import java.util.List;


public class VendingMachineHotDrinks implements VendingMachine {
    private List<HotDrinkWithTemperature> drinks;

    public VendingMachineHotDrinks() {
        drinks = new ArrayList<>();
    }

    public void addDrink(HotDrinkWithTemperature drink) {
        drinks.add(drink);
    }

    @Override
    public List<HotDrinkWithTemperature> getProductsByName(String name) {
        List<HotDrinkWithTemperature> result = new ArrayList<>();
        for (HotDrinkWithTemperature drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name)) {
                result.add(drink);
            }
        }
        return result;
    }
    @Override
    public List<HotDrinkWithTemperature> getAllProducts() {
        return new ArrayList<>(drinks);
    }
}
