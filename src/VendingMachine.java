public interface VendingMachine {
    HotDrinks getProduct(String name, int volume, int temperature);
}