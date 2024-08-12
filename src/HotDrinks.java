public class HotDrinks {
    private String name;
    private int volume;

    public HotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Горячий напиток(" + "название='" + name + '\'' + ", объём=" + volume + ')';
    }
}