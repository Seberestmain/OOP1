public class HotDrinkWithTemperature extends HotDrinks {
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток с температурой (" + "название='" + getName() + '\'' + ", объём=" + getVolume() + ", температура=" + temperature + ')';
    }
}
