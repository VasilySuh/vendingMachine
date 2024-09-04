public class HotDrinks extends Product{
    private int volume;
    private int temp;


    public HotDrinks(String name, double cost, int volume, int temp) {
        super(name, cost);
        this.volume = volume;
        this.temp = temp;
    }

    public int getTemp(){
        return temp;
    }

    public void setTemp(int temp){
        this.temp = temp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
               "name='" + super.getName() + '\'' +
               "volume='" + this.volume + '\'' +
               "temperature='" + this.temp + '\'' +
               ", cost=" + super.getCost() +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrinks)) {
            return false;
        }

        HotDrinks that = (HotDrinks) o;

        return super.getName().equalsIgnoreCase(that.getName())
               && super.getCost() == that.getCost()
               && getVolume() == that.getVolume()
               && getTemp() == that.getTemp();
    }
}
