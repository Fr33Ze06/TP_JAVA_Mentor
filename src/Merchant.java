import java.util.ArrayList;

public class Merchant {
    private String name;
    private ArrayList<Equipment> inventory;
    private int money;

    public Merchant(String name, int money) throws Exception {
        if (money < 0 || money > 500) {
            throw new Exception("Price must be between 0 and 500.");
        }else{
            this.name = name;
            this.inventory = new ArrayList<>();
            this.money = money;
        }

    }

    public String getName() {
        return name;
    }

    public ArrayList<Equipment> getInventory() {
        return inventory;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(ArrayList<Equipment> inventory) {
        this.inventory = inventory;
    }

    public void setMoney(int money) throws Exception {
        if (money < 0 || money > 500) {
            throw new Exception("Price must be between 0 and 500.");
        } else {
            this.money = money;
        }

    }

    public void sell_item_from_inventory(Equipment item, Customer customer){
        inventory.remove(item);
        bonus_money(item.price, customer.getMultiplier());
    }

    private void add_money(float price) {
        money += Math.round(price);
    }

    private void bonus_money(int price, float x_bonus){
        add_money(price * x_bonus);
    }

}



