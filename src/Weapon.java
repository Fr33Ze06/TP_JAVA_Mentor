public class Weapon extends Equipment{
    private WeaponCategory category;
    private WeaponType weaponType;

    public Weapon(String name, Rarity rarity, int price, WeaponCategory category, WeaponType weaponType) {
        super(name, rarity, price);
        this.category = category;
        this.weaponType = weaponType;
        calculatePrice();
    }

    public WeaponCategory getCategory() {
        return category;
    }

    public void setCategory(WeaponCategory category) {
        this.category = category;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "category=" + category +
                ", weaponType=" + weaponType +
                '}';
    }

    private void calculatePrice() {
        float basePrice = super.getPrice();

        switch (category) {
            case HELMET:
                basePrice *= 1.2;
                break;
            case CHESTPLATE:
                basePrice *= 1.5;
                break;

        }

        switch (armorPiece) {
            case LIGHT:
                basePrice *= 1.1;
                break;
            case MEDIUM:
                basePrice *= 1.3;
                break;
        }

        super.setPrice(Math.round(basePrice));
    }
}
