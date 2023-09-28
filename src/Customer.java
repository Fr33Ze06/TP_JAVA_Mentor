public class Customer {
    private String name;
    private Equipment wantToBuy;
    private float multiplier;

    public Customer(String name, Equipment wantToBuy, float multiplier) {
        this.name = name;
        this.wantToBuy = wantToBuy;
        this.multiplier = multiplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equipment getWantToBuy() {
        return wantToBuy;
    }

    public void setWantToBuy(Equipment wantToBuy) {
        this.wantToBuy = wantToBuy;
    }

    public float getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(float multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wantToBuy=" + wantToBuy +
                ", multiplier=" + multiplier +
                '}';
    }
}
