
import java.util.List;


public interface VendingMachine {
    List<HotDrinkWithTemperature> getProductsByName(String name);

    List<HotDrinkWithTemperature> getAllProducts();
}