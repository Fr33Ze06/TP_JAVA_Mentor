public class Equipment {
    protected String name;
    protected Rarity rarity;
    protected int price;

    public Equipment(String name, Rarity rarity,int price){
        this.name = name;
        this.rarity = rarity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
